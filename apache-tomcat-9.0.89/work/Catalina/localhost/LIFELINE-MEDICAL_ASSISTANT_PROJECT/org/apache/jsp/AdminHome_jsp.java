/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.89
 * Generated at: 2025-02-24 13:38:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import Database.DatabaseConnection;

public final class AdminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(4);
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("java.sql.Statement");
    _jspx_imports_classes.add("Database.DatabaseConnection");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Home</title>\n");
      out.write("        <link rel=\"stylesheet\"\n");
      out.write("              href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\"\n");
      out.write("              href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script\n");
      out.write("        src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script\n");
      out.write("        src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("        <script\n");
      out.write("        src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("        <link\n");
      out.write("            href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\n");
      out.write("            rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script\n");
      out.write("        src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script\n");
      out.write("        src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background-image: url(\"img/Medical.jpg\");\n");
      out.write("                background-color: #cccccc;\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("            body.modal-open {\n");
      out.write("                padding-right: 0 !important;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #sidebar {\n");
      out.write("                padding-left: 0;\n");
      out.write("            }\n");
      out.write("            /*\n");
      out.write("         * Off Canvas at medium breakpoint\n");
      out.write("         * --------------------------------------------------\n");
      out.write("         */\n");
      out.write("\n");
      out.write("            @media screen and (max-width: 48em) {\n");
      out.write("                .row-offcanvas {\n");
      out.write("                    position: relative;\n");
      out.write("                    -webkit-transition: all 0.25s ease-out;\n");
      out.write("                    -moz-transition: all 0.25s ease-out;\n");
      out.write("                    transition: all 0.25s ease-out;\n");
      out.write("                }\n");
      out.write("                .row-offcanvas-left .sidebar-offcanvas {\n");
      out.write("                    left: -33%;\n");
      out.write("                }\n");
      out.write("                .row-offcanvas-left.active {\n");
      out.write("                    left: 33%;\n");
      out.write("                    margin-left: -6px;\n");
      out.write("                }\n");
      out.write("                .sidebar-offcanvas {\n");
      out.write("                    position: absolute;\n");
      out.write("                    top: 0;\n");
      out.write("                    width: 33%;\n");
      out.write("                    height: 100%;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            /*\n");
      out.write("         * Off Canvas wider at sm breakpoint\n");
      out.write("         * --------------------------------------------------\n");
      out.write("         */\n");
      out.write("\n");
      out.write("            @media screen and (max-width: 34em) {\n");
      out.write("                .row-offcanvas-left .sidebar-offcanvas {\n");
      out.write("                    left: -45%;\n");
      out.write("                }\n");
      out.write("                .row-offcanvas-left.active {\n");
      out.write("                    left: 45%;\n");
      out.write("                    margin-left: -6px;\n");
      out.write("                }\n");
      out.write("                .sidebar-offcanvas {\n");
      out.write("                    width: 45%;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card {\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card-block .rotate {\n");
      out.write("                z-index: 8;\n");
      out.write("                float: right;\n");
      out.write("                height: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card-block .rotate i {\n");
      out.write("                color: rgba(20, 20, 20, 0.15);\n");
      out.write("                position: absolute;\n");
      out.write("                left: 0;\n");
      out.write("                left: auto;\n");
      out.write("                right: -10px;\n");
      out.write("                bottom: 0;\n");
      out.write("                display: block;\n");
      out.write("                -webkit-transform: rotate(-44deg);\n");
      out.write("                -moz-transform: rotate(-44deg);\n");
      out.write("                -o-transform: rotate(-44deg);\n");
      out.write("                -ms-transform: rotate(-44deg);\n");
      out.write("                transform: rotate(-44deg);\n");
      out.write("            }\n");
      out.write("            a{\n");
      out.write("                color: white;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Connection con = null;
        
      out.write("\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("            <a href=\"#\" class=\"navbar-brand\"> <img src=\"img/2855.jpeg\"\n");
      out.write("                                                   height=\"30\" width=\"100\" alt=\"HospitalManagementSystem\">\n");
      out.write("            </a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <h3>\n");
      out.write("                    <b>Hospital Management System</b>\n");
      out.write("                </h3>\n");
      out.write("                <ul class=\"navbar-nav ml-auto\" style=\"margin-right: 70px;\">\n");
      out.write("\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"index.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            PATIENT\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"addpatient.jsp\">Add Patient</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"adminPatientList.jsp\">Patient List</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            DOCTOR\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"addDoctor.jsp\">Add Doctor</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"adminDoctorList.jsp\">View Doctor</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            RECEPTIONIST\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"addRecp.jsp\">Add Receptionist</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"adminRecpList.jsp\">View Receptionist</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            WORKER\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"addWorker.jsp\">Add Worker</a>\n");
      out.write("                            <a class=\"dropdown-item\" href=\"adminWorkerList.jsp\">View Worker</a>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        ");

            try {
                con = DatabaseConnection.initializeDatabase();
                Statement st = (Statement) con.createStatement();
                String query = "select count(*) from patient";
                ResultSet rs = st.executeQuery(query);
                while (rs.next()) {
                    int patient = rs.getInt(1);
        
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"row mb-3\">\n");
      out.write("            <div class=\"col-xl-3 col-lg-6\" style=\"margin-top: 20px; \">\n");
      out.write("                <div class=\"card card-inverse card-success\">\n");
      out.write("                    <div class=\"card-block bg-success\">\n");
      out.write("                        <div class=\"rotate\">\n");
      out.write("                            <i class=\"fa fa-user fa-5x\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <h6 class=\"text-uppercase\" style=\"text-align: center; \"><a href=\"adminPatientList.jsp\">Patient</a></h6>\n");
      out.write("                        <h1 class=\"display-1\" style=\"text-align: center\">");
      out.print( patient);
      out.write("</h1>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");

                    }
                    con.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            
      out.write("\n");
      out.write("            ");

                try {
                    con = DatabaseConnection.initializeDatabase();
                    Statement st = (Statement) con.createStatement();
                    String query = "select count(*) from doctor";
                    ResultSet rs = st.executeQuery(query);
                    while (rs.next()) {
                        int doctor = rs.getInt(1);
            
      out.write("\n");
      out.write("            <div class=\"col-xl-3 col-lg-6\" style=\"margin-top: 20px;\">\n");
      out.write("                <div class=\"card card-inverse card-danger\">\n");
      out.write("                    <div class=\"card-block bg-danger\">\n");
      out.write("                        <div class=\"rotate\">\n");
      out.write("                            <i class=\"fa fa-user fa-5x\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <h6 class=\"text-uppercase\" style=\"text-align: center\"><a href=\"adminDoctorList.jsp\">Doctor</a></h6>\n");
      out.write("                        <h1 class=\"display-1\" style=\"text-align: center\">");
      out.print( doctor);
      out.write("</h1>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");

                    }
                    con.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            
      out.write("\n");
      out.write("            ");

                try {
                    con = DatabaseConnection.initializeDatabase();
                    Statement st = (Statement) con.createStatement();
                    String query = "select count(*) from recp";
                    ResultSet rs = st.executeQuery(query);
                    while (rs.next()) {
                        int recp = rs.getInt(1);
            
      out.write("\n");
      out.write("            <div class=\"col-xl-3 col-lg-6\" style=\"margin-top: 20px;\">\n");
      out.write("                <div class=\"card card-inverse card-info\">\n");
      out.write("                    <div class=\"card-block bg-info\">\n");
      out.write("                        <div class=\"rotate\">\n");
      out.write("                            <i class=\"fa fa-user fa-5x\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <h6 class=\"text-uppercase\" style=\"text-align: center\"><a href=\"adminRecpList.jsp\">Receptionist</a></h6>\n");
      out.write("                        <h1 class=\"display-1\" style=\"text-align: center\">");
      out.print( recp);
      out.write("</h1>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");

                    }
                    con.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            
      out.write("\n");
      out.write("            ");

                try {
                    con = DatabaseConnection.initializeDatabase();
                    Statement st = (Statement) con.createStatement();
                    String query = "select count(*) from worker";
                    ResultSet rs = st.executeQuery(query);
                    while (rs.next()) {
                        int worker = rs.getInt(1);
            
      out.write("\n");
      out.write("            <div class=\"col-xl-3 col-lg-6\" style=\"margin-top: 20px;\">\n");
      out.write("                <div class=\"card card-inverse card-warning\">\n");
      out.write("                    <div class=\"card-block bg-warning\">\n");
      out.write("                        <div class=\"rotate\">\n");
      out.write("                            <i class=\"fa fa-user fa-5x\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <h6 class=\"text-uppercase\" style=\"text-align: center\"><a href=\"adminWorkerList.jsp\">Worker</a></h6>\n");
      out.write("                        <h1 class=\"display-1\" style=\"text-align: center\">");
      out.print( worker);
      out.write("</h1>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");

                }
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
