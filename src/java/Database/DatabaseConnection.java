/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author Admin
 */
import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.SQLException; 
  
// This class can be used to initialize the database connection 
public class DatabaseConnection { 
    public static Connection initializeDatabase() 
        throws SQLException, ClassNotFoundException 
    { 
        // Initialize all the information regarding 
        // Database Connection 
        String dbDriver = "com.mysql.cj.jdbc.Driver";

        String dbURL = "jdbc:mysql://localhost:3306/hospital?useSSL=false&allowPublicKeyRetrieval=true";

 
        // Database name to access 
        //String dbName = "hospital"; 
        String dbUsername = "root"; 
        String dbPassword = "Vasu@1248"; 
  
        Class.forName(dbDriver); 
        Connection con = DriverManager.getConnection(dbURL,dbUsername,dbPassword); 
        return con;
    } 
} 

