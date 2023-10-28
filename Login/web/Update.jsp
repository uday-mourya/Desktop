<%-- Document : Update
    Created on : 26-Oct-2023, 12:47:32 am
    Author : Dell
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.SQLException" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="jakarta.servlet.http.HttpSession" %>
<%@page import="java.io.IOException" %>
<%
                   // HttpSession session=request.getSession();
                   ResultSet rs = (ResultSet) session.getAttribute("rs");
                   String name = rs.getString("Name");
                   String Fname = rs.getString("Fname");
                   String Email = rs.getString("Email");
                   String Mobile = rs.getString("Contact");
                   String Id = rs.getString("UserId");
               
if (rs != null) {
%>

<!DOCTYPE html>
<html>
        <style>
        body {
            background-image: url('your-background-image-url.jpg'); /* Set your background image URL */
        }

        #Tab {
            height: 400px;
            width: 100%;
        }

        #div1 {
            border: 1px solid black;
            height: 24px;
            width: 100%;
        }

        #input1 {
            margin-left: 30px;
        }

        #logo1 {
            color: Navyblue;
            font-size: 57px;
            margin-left: 250px;
            margin-top: 20px;
        }

        /* Add more styles as needed */

        fieldset {
            color: black;
            background-color: white;
            height: 550px;
            font-size: 25px;
            width: 42%;
        }

        fieldset > legend {
            background-color: #900C3F;
        }

        fieldset > legend > font {
            font-family: cursive;
            font-size: 25px;
            color: white;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        table td {
            padding: 5px;
        }

        input[type="text"] {
            width: 100%;
        }

        /* Add more specific styles as needed */
    </style>
    
    <script>
    
        function namevalidate()
        {
            var name= document.getElementById("name");
            var udisplay = document.getElementById("udisplay");
            if(name.value.trim()==""){
                udisplay.innerHTML=" Please Enter Name Required";
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
                fdisplay.innerHTML="Please Enter FatherName Required";
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
        function eValidate()
        {
            var name = document.getElementById("email");
            var edisplay = document.getElementById("edisplay");
            if(name.value.trim()==""){
                edisplay.innerHTML="  Please Enter Email Required";
                edisplay.style.color="red";
                
                return false;
            }
            else{
                var reg =/^[0-9A-Za-z]+@[a-z]+\.[a-z]{2,3}$/;
                if(reg.test(name.value)){
                     edisplay.innerHTML="";
                    edisplay.style.color="green";   
                    return true;
                }
                else{
                    edisplay.innerHTML="Invalid email @";
                    edisplay.style.color="purple";
                    return false;
                }
            }
        }
      
function Movalidate()
        {
            var mobile= document.getElementById("mobile");
            var mdisplay = document.getElementById("mdisplay");
            if(mobile.value.trim()==""){
                mdisplay.innerHTML="mobile Required";
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
        
</script>


<body>
    <form action="" method="post">
        <center>
            <fieldset>
                <legend>
                    <font face="cursive" size="5" color="white">PROFILE</font>
                </legend>
                <i id="logo1" class="fa-solid fa-user"></i>
                
                <center>
                    <table id="Tab" cellspacing="1">
                        <tr>
                            <td>Name:</td>
                            <td>
                                <input onkeyup="namevalidate()" id="name" type="text" value="<%= name %>" name="Name" pattern="[A-Za-z]+">
                                <span class="span1" id="udisplay" style="color:red"></span>
                                
                            </td>
                        </tr>
                        <tr>
                            <td>FName:</td>
                            <td>
                                <input onkeyup="Fvalidate()" id="Fname" type="text" value="<%= Fname %>" name="fname" pattern="[A-Za-z]+">
                                 <span class="span1" id="fdisplay" style="color:red"></span>
                            </td>
                        </tr>
                        <tr>
                            <td>Email Id:</td>
                            <td>
                                <input onkeyup="eValidate()" id="email" type="email" value="<%= Email %>" name="Email">
                                 <span class="span1" id="edisplay" style="color:red"></span>
                            </td>
                        </tr>
                        <tr>
                            <td>Mobile:</td>
                            <td>
                                <input onkeyup="Movalidate()" id="mobile" type="text" max='9999999999' min='6000000000'  value="<%= Mobile %>" name="Mobile" maxlength="10" >
                                 <span class="span1" id="mdisplay" style="color:red"></span>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <input type="submit" value="Submit">
                            </td>
                            <td>
                                <a href="Dashboardsss.jsp">Back Home</a>
                            </td>
                            <td>
                                <a href="Updatepassword.jsp">Change Password</a>
                            </td>
                        </tr>
                    </table>
                </center>
            </fieldset>
        </center>
    </form>
</body>
</html>
       
<%
    }
    else
    {}
    if(request.getParameter("Name")!=null)
{

        try {
        String name1=request.getParameter("Name");
String mno = request.getParameter("Mobile");
String email = request.getParameter("Email");
String fname = request.getParameter("fname");

Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/server", "root", "udaysql@350");

String sql1 = "update reginfo set Name = ?, Fname = ?, Email = ?, Contact = ? where UserId = ?";
PreparedStatement ps1 = con.prepareStatement(sql1);
ps1.setString(1, name1);
ps1.setString(2, fname);
ps1.setString(3, email);
ps1.setString(4, mno);
ps1.setString(5, Id);

int i = ps1.executeUpdate();

if (i > 0) {
response.sendRedirect("Dashboardsss.jsp");
} else {
out.println("Failed to update.");
}
} catch (Exception e) {
out.print("Error: " + e.getMessage());
}
}
%>