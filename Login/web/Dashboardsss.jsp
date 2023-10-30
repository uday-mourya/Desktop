<%-- 
    Document   : DashBoard
    Created on : 25-Oct-2023, 11:15:49 pm
    Author     : Dell
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
    try {
        response.setHeader("Cache-Control", "NO-Cache");
        response.setHeader("Cache-Control", "NO-Store");
//        HttpSession session1 = request.getSession();
        ResultSet rs = (ResultSet) session.getAttribute("rs");

        // Check if the 'rs' ResultSet and 'email' attribute are not null
        if (rs != null) {
%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
    <meta charset="UTF-8" />
    <title>Sticky Navigation Bar | CodingLab</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <!-- Add any other necessary CSS and script includes here -->

    <style>
      #Tab {
    height: 200px;
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
    font-size: 30px;
    margin-left: -100px;
    margin-top: 20px;
}

* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    text-decoration: none;
}

#head {
    width: 100%;
    padding: 15px;
    background: white;
    display: flex;
    align-items: center;
    justify-content: center;
    font-family: 'Ubuntu', sans-serif;
}

#head div {
    font-size: 20px;
    color: Black;
}

nav {
    top: 0;
    left: 0;
    width: 100%;
    padding: 15px;
    background: black;
    position: sticky;
    font-family: Candara;
}

.nav-content {
    height: 100%;
    margin: auto;
    display: flex;
    align-items: center;
    justify-content: space-between;
}

.logo a {
    font-weight: 500;
    font-family: Candara;
    font-size: 35px;
    color: white;
}

.nav-links {
    width: 60%;
}

.nav-content .nav-links {
    display: flex;
}

.nav-content .nav-links li {
    list-style: none;
    margin: 8px;
    margin-left: 50px;
}

.nav-links li a {
    text-decoration: none;
    color: white;
    font-size: 18px;
    font-weight: 500;
    padding: 10px 4px;
}

.nav-links li a:hover {
    color: black;
}

#section_one {
    height: 500px;
    width: 100%;
    display: flex;
    justify-content: space-evenly;
    align-items: center;
}

#section_one_one,
#section_one_two,
#section_one_three {
    height: 450px;
    width: 33%;
    background-color:lightgrey;
}

footer {
    width: 100%;
    background: rgb(14, 55, 120);
}

.content {
    width: 100%;
    padding: 20px;
    display: flex;
}

.content p,
a {
    color: white;
}

.left_box {
    width: 33%;
    display: flex;
    flex-direction: column;
}

.left_box p {
    width: 80%;
}

.middle_box {
    width: 33%;
    display: flex;
    flex-direction: column;
}

.right_box {
    width: 33%;
    display: flex;
    flex-direction: column;
}

#Update {
    color: black;
}

.content .topic {
    font-size: 22px;
    font-weight: 600;
    color: #fff;
    margin-bottom: 16px;
}

footer .content .lower i {
    padding-right: 16px;
}

#text_sub {
    height: 43px;
    width: 50%;
    font-size: 20px;
}

#sent_btn {
    height: 43px;
    width: 20%;
    font-size: 20px;
}

footer .content .media-icons a {
    font-size: 16px;
    width: 45px;
    display: inline-block;
    text-align: center;
    line-height: 43px;
    border: 2px solid #222222;
    margin: 30px 5px;
}

.content .media-icons a:hover {
    border-color: #eb2f06;
}

footer .bottom {
    width: 100%;
    text-align: right;
    color: #d9d9d9;
    padding: 0 40px 5px 0;
}

footer .bottom a {
    color: #eb2f06;
}

footer a:hover {
    color: #eb2f06;
}

    </style>
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>



<header id="head">
    <div>WELCOME   <%= rs.getString("Name") %></div>
</header>
<nav>
    <div class="nav-content">
        <div class="logo">
            <a href="#">MyDashBoard</a>
        </div>
        <ul class="nav-links">
            <li><a href="#">Home</a></li>
            <li><a href="#">About</a></li>
            <li><a href="#">Gallery</a></li>
            <li><a href="#">Contact</a></li>
            <li><a href="Logout.jsp">Logout</a></li>
            <li><a href="update.jsp">Profile</a></li>
        </ul>
        <button class="btn btn-primary" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasRight" aria-controls="offcanvasRight">
            <i class="fa-solid fa-user" style="color: #ffffff;"></i> Profile
        </button>
        <div class="offcanvas offcanvas-end" tabindex="-1" id="offcanvasRight" aria-labelledby="offcanvasRightLabel">
            <div class="offcanvas-header">
                <h5 id="offcanvasRightLabel">Offcanvas right</h5>
                <button type="button" class="btn-close text-reset" data-bs-dismiss="offcanvas" aria-label="Close"></button>
            </div>
            <div class="offcanvas-body">
                <div id="profile">
                    <form action="">
                        <center>
                            <fieldset style="color: black; background-color: white; height: 500px; font-size: 17px; width: 50%;">
                                <legend>
                                    <fieldset style="background-color: #900C3F;">
                                        <font face="cursive" size="5" color="white">PROFILE</font>
                                    </fieldset>
                                    <i id="logo1" class="fa-solid fa-user"></i>
                                </legend>
                                <center>
                                    <table id="Tab" cellspacing="1">
                                        <tr>
                                            <td>Name:</td>
                                            <td>
                                                <div id="div1"> <%= rs.getString("Name") %></div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>FName:</td>
                                            <td>
                                                <div id="div1"> <%= rs.getString("Fname") %></div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>Email Id:</td>
                                            <td>
                                                <div id="div1"> <%= rs.getString("Email") %></div>
                                            </td>
                                        </tr>
                                         <tr>
                                            <td>Mobile:</td>
                                            <td>
                                                <div id="div1"> <%= rs.getString("Contact") %></div>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td><a id="Update" href="Update.jsp">Update</a></td>
                                        </tr>
                                    </table>
                                </center>
                            </fieldset>
                        </center>
                    </form>
                </div>
            </div>
        </div>
    </div>
</nav>
<section id="section_one">
    <div id="section_one_one"></div>
    <div id="section_one_two"></div>
    <div id="section_one_three"></div>
</section>
<footer>
    <div class="content">
        <div class="left_box">
            <div class="upper">
                <div class="topic">About us</div>
                <p>
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Vitae illo nihil porro magnam quod explicabo nisi expedita dolores aut perspiciatis!
                </p>
            </div>
            <div class="lower">
                <div class="topic">Contact us</div>
                <div class="phone">
                    <a href="#"><i class="fas fa-phone-volume"></i>+007 9089 6767</a>
                </div>
                <div class="email">
                    <a href="#"><i class="fas fa-envelope"></i>abc@gmail.com</a>
                </div>
            </div>
        </div>
        <div class="middle_box">
            <span class="topic">Our Services</span><br />
            <span><a href="#">Web Design, Development</a></span> <br />
            <span><a href="#">Web UX Design, Research</a></span> <br />
            <span><a href="#">Web User Interface Design</a></span> <br />
            <span><a href="#">Theme Development, Design</a></span> <br />
            <span><a href="#">Mobile Application Design</a></span> <br />
            <span><a href="#">Wireframing & Prototyping</a></span> <br />
        </div>
        <div class="right_box">
            <div class="topic">Subscribe us</div>
            <form action="#">
                <input id="text_sub" type="text" placeholder="Enter email address" />
                <input id="sent_btn" type="submit" name="" value="Send" />
                <div class="media-icons">
                    <a href="#"><i class="fab fa-facebook-f"></i></a>
                    <a href="#"><i class="fab fa-instagram"></i></a>
                    <a href="#"><i class="fab fa-twitter"></i></a>
                    <a href="#"><i class="fab fa-youtube"></i></a>
                    <a href="#"><i class="fab fa-linkedin-in"></i></a>
                </div>
            </form>
        </div>
    </div>
    <div class="bottom">
        <p>Copyright © 2020 <a href="#">CodingLab</a> All rights reserved</p>
    </div>
</footer>
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