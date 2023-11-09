<%-- 
    Document   : Dashboard
    Created on : Nov 7, 2023, 9:47:10 AM
    Author     : hp
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="javax.servlet.*" %>

   <!DOCTYPE html>
   <html lang="en" dir="ltr">
   <head>
  <meta charset="UTF-8" />
  <title></title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
  <style>
    * {
      margin: 0;
      padding: 0;
      box-sizing: border-box;
      text-decoration: none;
    }
    #head {
      width: 100%;
      padding: 15px;
      background: grey;
      display: flex;
      align-items: center;
      justify-content: center;
      font-family: 'Ubuntu', sans-serif;
    }
    #head div {
      font-size: 20px;
      color: white;
    }
    nav {
      top: 0;
      left: 0;
      width: 100%;
      padding: 15px;
      background: lightseagreen;
      position: sticky;
      font-family: 'Ubuntu', sans-serif;
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
      margin-left: 70px;
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
      background-color: pink;
      border: 2px solid black;
    }
    footer {
      width: 100%;
      background: #111;
    }
    .content {
      width: 100%;
      padding: 20px;
      display: flex;
    }
    .content p,
    a {
      color: #fff;
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
      text-align: center;
      color: #d9d9d9;
      padding: 0 40px 5px 0;
      margin-left: 120px;
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
   <%
    // Retrieve the user's name from the session
    response.setHeader("Cache-Control", "no-cache, no-store");
            response.setHeader("Pragma", "no-cache");
            
            String email = (String) session.getAttribute("email");
            String name = (String) session.getAttribute("name");
            String mobile = (String) session.getAttribute("mobile");
             
            if(email==null){
                response.sendRedirect("Login.jsp");
                System.out.println(email);
            }
%>
  <header id="head">
      <center><div>WELCOME To <%=name%></div></center>
  </header>
  <nav>
    <div class="nav-content">
      <div class="logo">
        <a href="#">DashBoard</a>
      </div>
      <ul class="nav-links">
        <li><a href="#">Home</a></li>
        <li><a href="#">Service</a></li>
        <li><a href="Profile.jsp">Profile</a></li>
        <li><a href="#">Gallery</a></li>
        <li><a href="Logoutcontroller">Logout</a></li>
      </ul>
    </div>
  </nav>
  <section id="section_one">
    <!-- Your content for section_one can be added here -->
  </section>
  <footer>
    <div class="content">
      <div class="left_box">
        <div class="upper">
          <div class="topic">About us</div>
          <p>
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Vitae
            illo nihil porro magnam quod explicabo nisi expedita dolores aut
            perspici </p>
                  </div>
        <div class="lower">
          <div class="topic">Contact us</div>
          <div class="phone">
            <a href="#"><i class="fas fa-phone-volume"></i>+007 9089 6767</a>
          </div>
          <div class="email">
            <a href="#"><i class="fas mailto:fa-envelope"></i>abc@gmail.com</a>
          </div>
        </div>
      </div>
    </div>
    
    <div class="right_box">
      <div class="topic">Subscribe us</div>
      <form action="#">
        <input
          id="text_sub"
          type="text"
          placeholder="Enter email address"
        />
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
    <p>Copyright © 2020 All rights reserved | Made by ~ Uday Mourya</p>
  </div>
</footer>
</body>
</html>



