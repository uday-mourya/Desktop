<%-- 
    Document   : Dashboard
    Created on : Oct 25, 2023, 2:41:20 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<%@ page import = "java.io.*,java.util.*" %>
<%  
    try {
        response.setHeader("Cache-Control", "NO-Cache");
        response.setHeader("Cache-Control", "NO-Store");
//        HttpSession session1 = request.getSession();
        ResultSet rs = (ResultSet) session.getAttribute("rs");
          
        // Check if the 'rs' ResultSet and 'email' attribute are not null
        if (rs != null) {
         String name = rs.getString("Name");
%>

<!DOCTYPE html>
<html>
<head>
  <title>Servlet Dashboard</title>
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
    <div  id="container">
     <div id="header">
            <center><h1>WELCOME <%= name %></h1></center>
        </div>  
    <div id='nav'>
      <ul>
        <li><a href='Dashboard.jsp'>Home</a></li>
        <li><a href='Dashboard.jsp'>About Us</a></li>
        <li><a href='Dashboard.jsp'>Gallery</a></li>
        <li><a href='profile2.jsp'>Profile</a></li>
        <li><a href='Updatepassword.jsp'>UpdatePassword</a></li>
        <li><span><a href='Logout.jsp'>Logout</a><span></li>
      </ul>
    </div>
  </div>
</body>
</html>

<% } else { %>
    <%
        response.sendRedirect("Login.jsp");
    %>
<% }}
catch(Exception e){
 out.print(e);
}%>
