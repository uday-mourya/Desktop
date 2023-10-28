<%-- 
    Document   : profileedit
    Created on : Oct 25, 2023, 11:22:58 PM
    Author     : dell
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Profile Edit</title>
    <style>
        * {
            border-radius: 30px;
            background-image: url('back.jpg');
        }
        #btn {
            width: 150px;
            height: 30px;
            background-color: red;
            color: green;
        }
    </style>
</head>
<body style="border: 1px solid red;">
    <%
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Server", "root", "udaysql@350");

        HttpSession session = request.getSession();
        ResultSet rs1 = (ResultSet) session.getAttribute("rs");
        
        String name = rs1.getString(1);
        String fname = rs1.getString(2);
        String email = rs1.getString(3);
        String pass = rs1.getString(4);
        String mobno = rs1.getString(5);
    %>
    <form action="Update4" method="post">
        <table align="center" cellspacing="0" height="300px" width="600px">
            <center>
                <h1>--Profile--<%= name %></h1>
            </center>
            <tr>
                <td align="center">Your Name</td>
                <td align="center">
                    <input type="text" pattern="[A-Za-z]+" name="name" value="<%= name %>">
                </td>
            </tr>
            <tr>
                <td align="center">Father Name</td>
                <td align="center">
                    <input type="text" name="fname" pattern="[A-Za-z]+" value="<%= fname %>">
                </td>
            </tr>
            <tr>
                <td align="center">Your Email</td>
                <td align="center">
                    <input type="email" name="email" value="<%= email %>">
                </td>
            </tr>
            <tr>
                <td align="center">Password</td>
                <td align="center">
                    <input type="password" name="pass" value="<%= pass %>">
                </td>
            </tr>
            <tr>
                <td align="center">Mobile Number</td>
                <td align="center">
                    <input type="tel" name="mobno" min="1" max="10" value="<%= mobno %>">
                </td>
            </tr>
            <tr colspan="2">
                <td align="center">
                    <input type="submit" name="sub" value="SUBMIT">
                </td>
            </tr>
        </table>
    </form>
    <%
    } catch (Exception e) {
        out.println(e);
    }
    %>
</body>
</html>
