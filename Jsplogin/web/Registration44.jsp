<%-- 
    Document   : Registration
    Created on : 25-Oct-2023, 4:00:37 pm
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.io.IOException" %>

<!DOCTYPE html>
<html>
<head>
    <title>Registration</title>
    <style>
        body {
            background-color: skyblue;
        }
        table {
            width: 350px;
            background-color: white;
            height: 400px;
            padding: 20px;
            border-radius: 21px;
            -moz-border-radius: 21px;
            -webkit-border-radius: 21px;
            border: 0px solid #000000;
        }
        h2 {
            text-align: center;
        }
    </style>
</head>
<script>
    function validate(){}
        function namevalidate()
        {
            var name= document.getElementById("name");
            var udisplay = document.getElementById("udisplay");
            if(name.value.trim()==""){
                udisplay.innerHTML="Name Required";
                udisplay.style.color="red";
                return false;
            }
            else{
                var reg =/^[A-Z a-z]+$/;
                if(reg.test(name.value)){
                    udisplay.innerHTML="";
                    udisplay.style.color="Green";   
                    return true;
                }
                else{
                   udisplay.innerHTML="Invalid";
                   udisplay.style.color="purple";
                    return false;
                }
            }
        }
function Fvalidate()
        {
            var Fname= document.getElementById("Fname");
            var fdisplay = document.getElementById("fdisplay");
            if(Fname.value.trim()==""){
                fdisplay.innerHTML="Name Required";
                fdisplay.style.color="red";
                return false;
            }
            else{
                var reg =/^[A-Z a-z]+$/;
                if(reg.test(Fname.value)){
                    fdisplay.innerHTML="";
                    fdisplay.style.color="Green";   
                    return true;
                }
                else{
                   fdisplay.innerHTML="Invalid";
                   fdisplay.style.color="purple";
                    return false;
                }
            }
        }
        function Movalidate()
        {
            var mobile= document.getElementById("mobile");
            var mdisplay = document.getElementById("mdisplay");
            if(mobile.value.trim()==""){
                mdisplay.innerHTML="Name Required";
                mdisplay.style.color="red";
                return false;
            }
            else{
                var reg =/^[6789][0-9]{9}/;
                if(reg.test(mobile.value)){
                    mdisplay.innerHTML="";
                    mdisplay.style.color="Green";   
                    return true;
                }
                else{
                   mdisplay.innerHTML="Invalid";
                   mdisplay.style.color="purple";
                    return false;
                }
            }
        }
function Movalidate()
        {
            var mobile= document.getElementById("mobile");
            var mdisplay = document.getElementById("mdisplay");
            if(mobile.value.trim()==""){
                mdisplay.innerHTML="Name Required";
                mdisplay.style.color="red";
                return false;
            }
            else{
                var reg =/^[6789][0-9]{9}/;
                if(reg.test(mobile.value)){
                    mdisplay.innerHTML="";
                    mdisplay.style.color="Green";   
                    return true;
                }
                else{
                   mdisplay.innerHTML="Invalid";
                   mdisplay.style.color="purple";
                    return false;
                }
            }
        }
 function passValidate()
        {
            var pass= document.getElementById("pass");
            var pdisplay = document.getElementById("pdisplay");
            if(pass.value.trim()==""){
                pdisplay.innerHTML="Name Required";
                pdisplay.style.color="red";
                return false;
            }
            else{
                var reg =/^(?=.+?[0-9])(?=.+[A-Z])(?=.+?[a-z])(?=.+?[~!@#$%^&*()-+]).{8,}$/;
                if(reg.test(pass.value)){
                    pdisplay.innerHTML="Valid";
                    pdisplay.style.color="Green";   
                    return true;
                }
                else{
                   pdisplay.innerHTML="Please enter one character,no,symbol and min 8";
                   pdisplay.style.color="purple";
                    return false;
                }
            }
        }
        
</script>
<body>
    <center>
        <form onsubmit="return validate">
            <table>
                <th>
                    <h2>Registration Form</h2>
                </th>
                <tr>
                    <td>
                        <input  onkeyup="namevalidate()"required style="width: 250px; height: 25px;" id="name" type="text" placeholder="Enter your name" name="name" pattern="[A-Za-z ]+">
                        <span id="udisplay" style="color:red;">*</span>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input onkeyup="Fvalidate()" id="Fname" required style="width: 250px; height: 25px;" type="text" placeholder="Enter your Father name" name="fname" pattern="[A-Za-z ]+">
                        <span id="fdisplay" style="color:red;"></span>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input onkeyup="eValidate()" id="email" required style="width: 250px; height: 25px;" type="email" placeholder="Enter your email" name="email">
                        <span id="edisplay" style="color:red;"></span>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input onkeyup=" passValidate()" id="pass" required style="width: 250px; height: 25px;" type="password" placeholder="Create password" name="pass">
                         <span id="pdisplay" style="color:red;"></span>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input onkeyup=" passValidate()" id="pass" required style="width: 250px; height: 25px;" type="password" placeholder="Confirm password" name="cpass">
                        <span id="pdisplay" style="color:red;"></span>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input id="mobile" onkeyup="Movalidate()" maxlength="10" required style="width: 250px; height: 25px;" type="tel" placeholder="Mobile No" name="mob" pattern="[0-9]{10}">
                        <span id="mdisplay" style="color:red;">*</span>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input required style="width: 150px; height: 25px; margin-left: 50px; border-radius: 67px; -moz-border-radius: 67px; -webkit-border-radius: 67px; border: 0px solid #000000; background-color: #E40073; color: white;" type="submit" value="Submit" name="submit">
                    </td>
                </tr>
            </table>
        </form>
    </center>
</body>
</html>
<%
    String name = request.getParameter("name");
    String fname = request.getParameter("fname");
    String email = request.getParameter("email");
    String pass = request.getParameter("pass");
    String mob = request.getParameter("mob");

    if (name != null && !name.trim().isEmpty() &&
        fname != null && !fname.trim().isEmpty() &&
        email != null && !email.trim().isEmpty() &&
        pass != null && !pass.trim().isEmpty() &&
        mob != null && !mob.trim().isEmpty()) {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/server", "root", "udaysql@350");

            // Check if email already exists
            String checkEmailSql = "SELECT email FROM reginfo WHERE email=?";
            ps = con.prepareStatement(checkEmailSql);
            ps.setString(1, email);
            rs = ps.executeQuery();

            if (rs.next()) {
                out.println("<h3><font color='green'>Email already exists</font></h3>");
            } else {
                // Insert data into the database
                String insertSql ="insert into reginfo(Name, Fname, Email, Password, Contact) values(?, ?, ?, ?, ?)";
                ps = con.prepareStatement(insertSql);
                ps.setString(1, name);
                ps.setString(2, fname);
                ps.setString(3, email);
                ps.setString(4, pass);
                ps.setString(5, mob);

                int count = ps.executeUpdate();

                if (count > 0) {
                    out.println("Data inserted successfully!");
                     response.sendRedirect("Login3.jsp");
                } else {
                    out.println("Failed to insert data.");
                }
            }
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        } finally {
            // Close resources in the reverse order of their creation
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                out.println("Error closing resources: " + e.getMessage());
            }
        }
    }
%>
