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
</head>
<body>
  <form id="form" onsubmit="return validate()">
    <table align="center" border="1" cellspacing="0" height="400px" width="400px" bgcolor="goldenroad">
      <center>
        <h1>Sign Up</h1>
      </center>
      <tr>
        <td align="center">Enter Your Name</td>
        <td align="center">
          <input onkeyup="namevalidate()" type="text"  pattern="[A-Za-z]+" id="name" name="name" required>
          <span id="udisplay" style="color:red;">*</span>
        </td>
      </tr>
      <tr>
        <td align="center">Enter Father Name</td>
        <td align="center">
          <input onkeyup="Fvalidate()"   type="text" pattern="[A-Za-z]+" id="Fname" name="fname" required>
           <span id="fdisplay" style="color:red;"></span>
        </td>
      </tr>
      <tr>
        <td align="center">Enter Your Email</td>
        <td align="center">
          <input onkeyup="eValidate()"  type="email" name="email" id="email" name="email" required>
          <span id="edisplay" style="color:red;"></span>
        </td>
      </tr>
      <tr>
        <td align="center">Enter Password</td>
        <td align="center">
          <input onkeyup=" passValidate()" type="password" name="pass"id="pass" name="pass" required>
           <span id="pdisplay" style="color:red;"></span>
        </td>
      </tr>
      <tr>
        <td align="center">Confirm Password</td>
        <td align="center">
          <input  onkeyup=" passValidate()" type="password" name="pass" id="cpass" name="cpass" required>
          <span id="pdisplay" style="color:red;"></span>
        </td>
      </tr>
      <tr>
        <td align="center">Enter Mobile Number</td>
        <td align="center">
          <input onkeyup="Movalidate()" type="tel" id="mobile" name="mobno" required>
          <span id="mdisplay" style="color:red;">*</span>
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

</html>



