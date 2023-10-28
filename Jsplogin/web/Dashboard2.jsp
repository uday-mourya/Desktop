<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<%@ page import = "java.io.*,java.util.*" %>
<%@ page import="java.sql.Connection, java.sql.ResultSet, java.sql.Statement" %>

<%
try {
   
//    ResultSet rs = (ResultSet) session.getAttribute("rs");

//    if (session1 != null && rs != null) {
//        if (rs.next()) {



            String name = session.getAttribute("name").toString();
            String fname=session.getAttribute("fname").toString();
            String email=session.getAttribute("email").toString();
            String password=session.getAttribute("password").toString();
            String contact=session.getAttribute("contact").toString();
            
           
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
    <link rel="stylesheet" type="text/css" href="style.css">
    <style>
    * {
      margin: 0;
      padding: 0;
    }

    #container {
      height: 620px;
      width: 100%;
      margin: auto;
      background-color: #9AE5FC ;
/*      background: linear-gradient(120deg, #007bff, #d0314c);*/
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
      color: #00FF00jjj;
    }
  </style>
</head>
<body>
    <div id="container">
        <div id="header">
            <center><h1>WELCOME <%= name %></h1></center>
<!--            <center><h1>WELCOME <%= fname %></h1></center>
            <center><h1>WELCOME <%= email %></h1></center>
            <center><h1>WELCOME <%= password %></h1></center>
            <center><h1>WELCOME <%= contact %></h1></center>-->
        </div>
        <div id="nav">
            <ul>
                <li><a href="Dashboard2.jsp">Home</a></li>
                <li><a href="Dashboard2.jsp">About Us</a></li>
                <li><a href="Dashboard2.jsp">Gallery</a></li>
                <li><a href="profile.jsp">Profile</a></li>
                <li><a href="Updatepass.jsp">Update Password</a></li>
                <li><a href="Logout.jsp">Logout</a></li>
            </ul>
        </div>
    </div>
</body>

</html>
<%
//    } else {
//            response.sendRedirect("Login3.jsp");
//        }
//    } else {
//        response.sendRedirect("Login3.jsp");
//    }

%>
<%
    } catch (Exception e) {
    // Log the error and provide a user-friendly error message
    // Log.e("Error in Dashboard.jsp", e);
    out.println("An error occurred. Please try again later.");
}
    %>