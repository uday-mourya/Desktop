<%-- 
    Document   : Updatepass
    Created on : Oct 25, 2023, 11:05:42 PM
    Author     : dell
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.io.IOException" %>
<%@ page import="javax.servlet.RequestDispatcher" %>
<%@ page import="javax.servlet.ServletException" %>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page import="javax.servlet.http.HttpServletResponse" %>
<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }
        #container {
            height: 620px;
            width: 100%;
            margin: auto;
            background-color: #9AE5FC;
/*            background: linear-gradient(120deg, #007bff, #d0314c);*/
        }
        #header {
            height: 60px;
            width: 100%;
            background-color: white;
        }
        h1 {
            padding-top: 10px;
        }
        #nav {
            height: 50px;
            width: 100%;
            background-color: black !important;
            padding-top: 30px;
        }
        #nav ul li {
            list-style: none;
            display: inline;
            font-size: 20px;
        }
        #nav ul li a {
            text-decoration: none;
            color: white;
            margin-left: 120px;
            margin-top: 50px;
            text-align: center;
        }
        #nav ul li a:hover {
            color: #00FF00;
        }
    </style>
</head>
<body>
    <div id="conatiner"> 
    <div id='nav'>
        <ul>
            <li><a href='Dashboard'>Home</a></li>
            <li><a href='Dashboard'>About Us</a></li>
            <li><a href='Dashboard'>Gallery</a></li>
            <li><a href='Profile5'>Profile</a></li>
            <li><a href='Updatepass'>UpdatePassword</a></li>
            <li><span><a href='Logout'>Logout</a><span></li>
        </ul>
    </div>

    <div id="content">
        <div id="change">
            <form action="UpdateTask">
                <table cellspacing="13">
                    <tr>
                        <td>Enter New Password :</td>
                        <td><input type="password" placeholder="Enter New Password" name="new1"></td>
                    </tr>
                    <tr>
                        <td>Confirm New Password :</td>
                        <td><input type="password" placeholder="Confirm New Password" name="new2"></td>
                    </tr>
                    <tr>
                        <td>Enter Old Password :</td>
                        <td><input type="password" placeholder="Enter Old Password" name="old"></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" value="Change Password" id="password"></td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
   </div>     
</body>
</html>

<%

    String passnew = request.getParameter("new1");
    String passnew1 = request.getParameter("new2");
    String passold = request.getParameter("old");
//    HttpSession session1 = request.getSession();
//    Object id = session1.getAttribute("id");
    
    if (passnew.equals(passnew1)) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Server", "root", "udaysql@350")) {
                String sql = "SELECT Password FROM reginfo WHERE UserId = ?";
                try (PreparedStatement ps1 = con.prepareStatement(sql)) {
                    ps1.setString(1, (String) id);
                    ResultSet rs1 = ps1.executeQuery();

                    if (rs1.next()) {
                        String password = rs1.getString("Password");

                        if (password.equals(passold)) {
                            String sql1 = "UPDATE reginfo SET Password = ? WHERE UserId = ?";

                            try (PreparedStatement ps = con.prepareStatement(sql1)) {
                                ps.setString(1, passnew);
                                ps.setString(2, (String) id);
                                int count = ps.executeUpdate();

                                if (count > 0) {
                                    response.sendRedirect("Dashboard");
                                } else {
                                    response.sendRedirect("Updatepass?error=update-failed");
                                }
                            }
                        } else {
                            response.sendRedirect("Updatepass?error=incorrect-old-password");
                        }
                    } else {
                        response.sendRedirect("Updatepass?error=user-not-found");
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace(); // For debugging purposes; consider logging errors
            response.sendRedirect("Updatepass?error=internal-error");
        }
    } else {
        response.sendRedirect("Updatepass?error=passwords-do-not-match");
    }

%>


