<%-- 
    Document   : profile2
    Created on : Oct 27, 2023, 8:11:28 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<%@ page import = "java.io.*,java.util.*" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
         <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
         <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
          <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <style>
            body {
  background: #BA68C8;
}

.form-control:focus {
  box-shadow: none;
  border-color: #BA68C8;
}

.profile-button {
  background: #BA68C8;
  box-shadow: none;
  border: none;
}

.profile-button:hover {
  background: #682773;
}

.profile-button:focus {
  background: #682773;
  box-shadow: none;
}

.profile-button:active {
  background: #682773;
  box-shadow: none;
}

.back:hover {
  color: #682773;
  cursor: pointer;
}
        </style>
       <script>

            function namevalidate()
            {
                var name = document.getElementById("name");
                var udisplay = document.getElementById("udisplay");
                if (name.value.trim() == "") {
                    udisplay.innerHTML = " Please Enter Name Required";
                    udisplay.style.color = "red";
                    return false;
                } else {
                    var reg = /^[A-Z a-z]+$/;
                    if (reg.test(name.value)) {
                        udisplay.innerHTML = "";
                        udisplay.style.color = "Green";
                        return true;
                    } else {
                        udisplay.innerHTML = "Only letters are allowed";
                        udisplay.style.color = "purple";
                        return false;
                    }
                     }
                    }
            function Fvalidate()
            {
                var Fname = document.getElementById("Fname");
                var fdisplay = document.getElementById("fdisplay");
                if (Fname.value.trim() == "") {
                    fdisplay.innerHTML = "Please Enter FatherName Required";
                    fdisplay.style.color = "red";
                    return false;
                } else {
                    var reg = /^[A-Z a-z]+$/;
                    if (reg.test(Fname.value)) {
                        fdisplay.innerHTML = "";
                        fdisplay.style.color = "Green";
                        return true;
                    } else {
                        fdisplay.innerHTML = "Only letters are allowed";
                        fdisplay.style.color = "purple";
                        return false;
                    }
                     }
                    }
            function eValidate()
            {
                var name = document.getElementById("email");
                var edisplay = document.getElementById("edisplay");
                if (name.value.trim() == "") {
                    edisplay.innerHTML = "  Please Enter Email Required";
                    edisplay.style.color = "red";

                    return false;
                } else {
                    var reg = /^[0-9A-Za-z]+@[a-z]+\.[a-z]{2,3}$/;
                    if (reg.test(name.value)) {
                        edisplay.innerHTML = "";
                        edisplay.style.color = "green";
                        return true;
                    } else {
                        edisplay.innerHTML = "Invalid email @";
                        edisplay.style.color = "purple";
                        return false;
                    }
                     }
                    }

            function Movalidate()
            {
                var mobile = document.getElementById("mobile");
                var mdisplay = document.getElementById("mdisplay");
                if (mobile.value.trim() == "") {
                    mdisplay.innerHTML = "mobile Required";
                    mdisplay.style.color = "red";
                    return false;
                } else {
                    var reg = /^[6789][0-9]{9}/;
                    if (reg.test(mobile.value)) {
                        mdisplay.innerHTML = "";
                        mdisplay.style.color = "Green";
                        return true;
                    } else {
                        mdisplay.innerHTML = "Number should start with 6, 7, 8, or 9 and have 10 digits";
                        mdisplay.style.color = "purple";
                        return false;
                    }
                     }
                    }

            function confirmEdit() {
                return confirm("Are you sure you want to edit this record?");
            }
            function confirmDelete() {
                return confirm("Are you sure you want to edit this record?");
            }

        </script>

    </head>
    <body>
        <form method="post">
        <div class="container rounded bg-white mt-5">
        <div class="row">
        
            <div class="col-md-6">
                <div class="p-3 py-5">
                    <div class="d-flex justify-content-between align-items-center mb-3">
                        <div class="d-flex flex-row align-items-center back"><i class="fa fa-long-arrow-left mr-1 mb-1"></i>
                           <a href="Dashboard33.jsp" ><h6>Back to home</h6></a>
                        </div>
                        
                    </div>
                    <div class="row mt-2">
                        <div class="col-md-3">Your Name</div>
                        <div class="col-md-6"><input onkeyup="namevalidate()" id="name"  type="text" class="form-control"  name="name" ></div>
                        <span class="span1" id="udisplay" style="color:red"></span>
                    </div>
                    <div class="row mt-3">
                        <div class="col-md-3">Father Name</div>
                        <div class="col-md-6"><input onkeyup="Fvalidate()" id="Fname" type="text" class="form-control"  name="fname" ></div>
                         <span class="span1" id="fdisplay" style="color:red"></span>
                    </div>
                    <div class="row mt-3">
                        <div class="col-md-3">Email</div>
                        <div class="col-md-6"><input onkeyup="eValidate()" id="email" type="text" class="form-control"  name="email" ></div>
                         <span class="span1" id="edisplay" style="color:red"></span>
                    </div>
                    <div class="row mt-3">
                        <div class="col-md-3">Mobile Number</div>
                        <div class="col-md-6"><input onkeyup="Movalidate()" id="mobile" type="text" class="form-control"  name="mobile" ></div> <span class="span1" id="mdisplay" style="color:red"></span>
                        
                    </div>
<!--                    <div class="mt-5 text-right"><button class="btn btn-primary profile-button" type="button">Save Profile</button></div>-->
                    <div class="row mt-5">
                            <div class="mt-5 text-left"><input type="submit" value="Register"></div>
<!--                            <div class="col-md-4"><a  href="Updatepassword.jsp" ><h6>Update Password</h6></a></div>
                        
                          -->
                    </div>
                </div>
            </div>
        </div>
    </div>
        </form>
    </body>
</html>
<%
String name = request.getParameter("name");
String Fname = request.getParameter("fname");
String email = request.getParameter("email");
String mobile = request.getParameter("mobile");

if (name != null && Fname != null && email != null && mobile != null) {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/server", "root", "udaysql@350");

        String sql = "INSERT INTO reginfo (Name, Fname, Email, Contact) VALUES (?, ?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, name);
        pst.setString(2, Fname);
        pst.setString(3, email);
        pst.setString(4, mobile);

        int count = pst.executeUpdate();
        con.close();

        if (count > 0) {
%>
            <p>Record inserted successfully.</p>
<%
        } else {
%>
            <p>Record not inserted successfully.</p>
<%
        }
    } catch (ClassNotFoundException | SQLException ex) {
        out.println("An error occurred: " + ex.getMessage());
    }
}
%>

