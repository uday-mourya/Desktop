<%-- 
    Document   : profile
    Created on : Oct 25, 2023, 7:30:47 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<%@ page import = "java.io.*,java.util.*" %>
<%
try {
   
      ResultSet rs = (ResultSet) session.getAttribute("rs");
      String name = rs.getString("Name");
//    ResultSet rs = (ResultSet) session.getAttribute("rs");

//    if (session1 != null && rs != null) {
//        if (rs.next()) {
//            String name = session.getAttribute("name");
            String fname=rs.getString("Fname");
            String email=rs.getString("Email");
            String password=rs.getString("Password");
            String contact=rs.getString("Contact");
            
           
%>
<!DOCTYPE html>
<html>
<head>
    <title>Profile</title>
    <style>
        * {
            border-radius: 30px;
            background-image: url('back.jpg');
        }
        
        #btn {
            width: 150px;
            height: 30px;
            cursor: pointer;
            font-family: 'Roboto', sans-serif;
            text-transform: uppercase;
            outline: 0;
            background: green;
            color: green;
        }

        #btn:hover, #btn:active, #btn:focus {
            background: red;
            color: green;
        }
    </style>
</head>
<body>
    <form>
        <table align="center" cellspacing="0" height="300px" width="600px">
            <center>
                <h1>--Profile--</h1>
                <%= name %>
            </center>
            <tr>
                <td align="center">Your Name</td>
                <td align="center">
                    <input type="text" name="name" readonly value="<%= name %>">
                </td>
            </tr>
            <tr>
                <td align="center">Father Name</td>
                <td align="center">
                    <input type="text" name="fname" readonly value="<%= fname %>">
                </td>
            </tr>
            <tr>
                <td align="center">Your Email</td>
                <td align="center">
                    <input type="email" name="email" readonly value="<%= email %>">
                </td>
            </tr>
            <tr>
                <td align="center">Password</td>
                <td align="center">
                    <input type="password" name="pass" readonly value="<%= password %>">
                </td>
            </tr>
            <tr>
                <td align="center">Mobile Number</td>
                <td align="center">
                    <input type="tel" name="mobno" readonly value="<%=contact %>">
                </td>
            </tr>
            <tr>
                <td align="center">
                    <a href="Update.jsp">edit</a>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
<%
} catch (Exception e) {
    e.printStackTrace();
}
%>

