<%-- 
    Document   : Registration2
    Created on : Oct 26, 2023, 11:45:25 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<%@ page import = "java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
  <title>Servlet registration</title>
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
      border: 0.3;
      color: #FFFFFF;
      font-size: 14px;
      -webkit-transition: all 0.3 ease;
      transition: all 0.3 ease;
      cursor: pointer;
    }
    
    #btn:hover, #btn:active, #btn:focus {
      background: goldenroad;
    }
  </style>
</head>
<body>
  <form id="form">
    <table align="center" border="1" cellspacing="0" height="400px" width="600px" bgcolor="goldenroad">
      <center>
        <h1>Sign Up</h1>
      </center>
      <tr>
        <td align="center">Enter Your Name</td>
        <td align="center">
          <input type="text" pattern="[A-Za-z]+" name="name" required>
        </td>
      </tr>
      <tr>
        <td align="center">Enter Father Name</td>
        <td align="center">
          <input type="text" pattern="[A-Za-z]+" name="fname" required>
        </td>
      </tr>
      <tr>
        <td align="center">Enter Your Email</td>
        <td align="center">
          <input type="email" name="email" required>
        </td>
      </tr>
      <tr>
        <td align="center">Enter Password</td>
        <td align="center">
          <input type="password" name="pass" required>
        </td>
      </tr>
      <tr>
        <td align="center">Confirm Password</td>
        <td align="center">
          <input type="password" name="cpass" required>
        </td>
      </tr>
      <tr>
        <td align="center">Enter Mobile Number</td>
        <td align="center">
          <input type="tel" name="mobno" required>
        </td>
      </tr>
      <tr colspan="2">
        <td align="center" colspan="2">
          <input type="submit" id="btn" name="op" value="Register">
        </td>
      </tr>
      <tr colspan="2">
        <td align="center" colspan="2">
          <p class="message">Already registered? <a href="Login3.jsp">Log In</a></p>
        </td>
      </tr>
    </table>
  </form>
</body>
</html>
<%
    String name = request.getParameter("name");
    String fname = request.getParameter("fname");
    String email = request.getParameter("email");
    String pass = request.getParameter("pass");
    String cpass = request.getParameter("cpass");
    String mycontact = request.getParameter("mobno");

    if (pass != null && !pass.isEmpty() && cpass != null && !cpass.isEmpty() &&
        name != null && !name.isEmpty() && fname != null && !fname.isEmpty() &&
        email != null && !email.isEmpty() && mycontact != null && !mycontact.isEmpty()) {

        // Check if the email is already in the database
          Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/server", "root", "udaysql@350");
        String sql = "select Email from reginfo where Email=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, email);
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            out.println("<center><h4><font color='green'>Email already exists</font></h4></center>");
        }
        else {
            if (!pass.equals(cpass)) {
%>
            <center><h4><font color="red">Password and confirm password do not match</font></h4></center>
<%
            } else if (mycontact.length() != 10) {
%>
            <center><h4><font color="red">Invalid mobile number (must be 10 digits)</font></h4></center>
<%
            } else {
                try {
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/server", "root", "udaysql@350");
                    sql = "insert into reginfo(Name, Fname, Email, Password, Contact) values(?, ?, ?, ?, ?)";
                    ps = con.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                    ps.setString(1, name);
                    ps.setString(2, fname);
                    ps.setString(3, email);
                    ps.setString(4, pass);
                    ps.setString(5, mycontact);
                    int count = ps.executeUpdate();

                    if (count > 0) {
                        ResultSet generatedKeys = ps.getGeneratedKeys();
                        if (generatedKeys.next()) {
%>
                        <center> <h4><font color="green">Registration successful</font></h4></center>
<%
                       response.sendRedirect("Login.jsp");
                        }
                    } else {
%>
                        <center><h4><font color="red">Registration not successful</font></h4></center>
<%
                    }
                } catch (Exception ex) {
%>
                        <center><h4><font color="red">An error occurred during registration</font></h4></center>
<%
                }
            }
        }
    } else {
%>
                  <center><h4><font color="red">Please fill in all the required fields</font></h4></center>
<%
    }
%>







