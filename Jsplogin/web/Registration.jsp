<%-- 
    Document   : Registration
    Created on : Oct 25, 2023, 7:10:35 PM
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
      background: #1EEC1B;
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
          <p class="message">Already registered? <a href="Login.jsp">Log In</a></p>
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

Connection con = null;
PreparedStatement ps = null;
ResultSet generatedKeys = null;
if(name!=null&&name!=" "&& fname!= null && fname!=" " ){
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/server", "root", "udaysql@350");
    String sql = "insert into reginfo(Name, Fname, Email, Password, Contact) values(?, ?, ?, ?, ?)";
    ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    ps.setString(1, name);
    ps.setString(2, fname);
    ps.setString(3, email);
    ps.setString(4, pass);
    ps.setString(5, mycontact);
    int count = ps.executeUpdate();

    if (count > 0) {
        generatedKeys = ps.getGeneratedKeys();
        if (generatedKeys.next()) {
            response.setContentType("text/html");
            out.println("<h2><font color='green'>Registration successful</font></h2>");
            response.sendRedirect("Login.jsp");
        } else {
            out.println("Registration not successful");
            RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
            rd.include(request, response);
        }
    }
} catch (ClassNotFoundException ex) {
    ex.printStackTrace();
    out.println("Database driver not found.");
} catch (SQLException ex) {
    ex.printStackTrace();
    out.println("SQL error: " + ex.getMessage());
} finally {
    try {
        if (generatedKeys != null) {
            generatedKeys.close();
        }
        if (ps != null) {
            ps.close();
        }
        if (con != null) {
            con.close();
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}
    }
%>

