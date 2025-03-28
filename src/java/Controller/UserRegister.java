package Controller;

import Database.DatabaseConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserRegister")
public class UserRegister extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        try {
            // Initialize database connection
            Connection con = DatabaseConnection.initializeDatabase();

            // Get user input
            String user = request.getParameter("Username");
            String pass = request.getParameter("password");
            String repassp = request.getParameter("repassword");

            // Check if passwords match
            if (!pass.equals(repassp)) {
                pw.println("<script type=\"text/javascript\">");
                pw.println("alert('Passwords do not match!');");
                pw.println("window.location.href = \"userRegister.jsp\";");
                pw.println("</script>");
                return;
            }

            // Check if the user already exists
            PreparedStatement checkUser = con.prepareStatement("SELECT * FROM login WHERE username = ?");
            checkUser.setString(1, user);
            if (checkUser.executeQuery().next()) {
                pw.println("<script type=\"text/javascript\">");
                pw.println("alert('User already exists!');");
                pw.println("window.location.href = \"userRegister.jsp\";");
                pw.println("</script>");
                return;
            }

            // Insert new user
            PreparedStatement pst = con.prepareStatement("INSERT INTO login(username, password) VALUES(?,?)");
            pst.setString(1, user);
            pst.setString(2, pass);
            int i = pst.executeUpdate();

            // Success message
            if (i > 0) {
                response.sendRedirect("index.jsp?register=success");
            } else {
                response.sendRedirect("userRegister.jsp?register=fail");
            }

        } catch (Exception e) {
            e.printStackTrace(); // Debugging
            pw.println("<script type=\"text/javascript\">");
            pw.println("alert('Error: " + e.getMessage() + "');");
            pw.println("window.location.href = \"userRegister.jsp\";");
            pw.println("</script>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("userRegister.jsp");
    }
}

