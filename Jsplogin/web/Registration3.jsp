<%-- 
    Document   : Registration
    Created on : Oct 25, 2023, 3:55:06 PM
    Author     : admin
--%>
<%@ page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>uday</title>
  <style>
    @import url("https://fonts.googleapis.com/css2?family=Open+Sans:wght@200;300;400;500;600;700&display=swap");

    * {
      margin: 0;
      padding: 0;
      box-sizing: border-box;
      font-family: "Open Sans", sans-serif;
    }

    body {
      display: flex;
      align-items: center;
      justify-content: center;
      min-height: 100vh;
      width: 100%;
      padding: 0 10px;
    }

    body::before {
      content: "";
      position: absolute;
      width: 100%;
      height: 100%;
      background: url(), #000;
      background-position: center;
      background-size: cover;
    }

    .wrapper {
      width: 400px;
      border-radius: 8px;
      padding: 30px;
      background-color: black;
      text-align: center;
      border: 1px solid rgba(255, 255, 255, 0.5);
      backdrop-filter: blur(9px);
      -webkit-backdrop-filter: blur(9px);
    }
    form {
      display: flex;
      flex-direction: column;
    }

    h2 {
      font-size: 2rem;
      margin-bottom: 20px;
      color: #fff;
    }

    .input-field {
      position: relative;
      border-bottom: 2px solid #ccc;
      margin: 10px 0;
    }

    .input-field label {
      position: absolute;
      top: 50%;
      left: 0;
      transform: translateY(-50%);
      color: #fff;
      font-size: 16px;
      pointer-events: none;
      transition: 0.15s ease;
    }

    .input-field input {
      width: 100%;
      height: 40px;
      background: transparent;
      border: none;
      outline: none;
      font-size: 16px;
      color: #fff;
    }

    .input-field input:focus~label,
    .input-field input:valid~label {
      font-size: 0.8rem;
      top: 10px;
      transform: translateY(-120%);
    }

    button {
      background: #fff;
      color: #000;
      font-weight: 600;
      border: none;
      padding: 12px 20px;
      cursor: pointer;
      border-radius: 10px;
      font-size: 16px;
      border: 2px solid transparent;
      transition: 0.3s ease;
    }

    button:hover {
      color: #fff;
      border-color: #fff;
      background: rgba(255, 255, 255, 0.15);
    }

    .register {
      text-align: center;
      margin-top: 30px;
      color: #fff;
    }
  </style>
  <script>
    function validateForm() {
      var name = document.getElementById("name");
      var nameValue = name.value.trim();

      if (nameValue === "") {
        alert("Name is required");
        name.focus();
        return false;
      }

      // Check if the input contains only letters (no numbers or special characters)
      if (!/^[A-Za-z]+$/.test(nameValue)) {
        alert("Name should contain only letters");
        name.focus();
        return false;
      }

      var fname = document.getElementById("fname");
      var fnameValue = fname.value.trim();
      if (fnameValue === "") {
        alert("FName is required");
        fname.focus();
        return false;
      }

      // Check if the input contains only letters (no numbers or special characters)
      if (!/^[A-Za-z]+$/.test(fnameValue)) {
        alert("FName should contain only letters");
        fname.focus();
        return false;
      }

      var pass = document.getElementById("pass");
      var cpass = document.getElementById("cpass");
      if (pass.value !== cpass.value) {
        alert("Password and Confirm Password do not match");
        cpass.focus();
        return false;
      }

      var mob = document.getElementById("mob");
      var mobValue = mob.value.trim();
      // if (mobValue === "") {
      //   alert("Mobile is required");
      //   mob.focus();
      //   return false;
      // }
      // // Check if the number is exactly 10 digits long
      // if (mobValue.length !== 10) {
      //   alert("Mobile should be exactly 10 digits long");
      //   mob.focus();
      //   return false;
      // }

      // // Check if the mobile number starts with 9 or 6
      // if (mob.charAt(0) !== '9' && mob.charAt(0) !== '6') {
      //   alert("Mobile number must start with 9 or 6");
      //   return false;
      // }
          var r=/^[6789][0-9]{9}$/;
          if(!r.test(mob.value)){
            alert("number start 6,7,8,9 and digit 10 only");
            mob.focus();
            return false;
          }
      // Validation passed
      return true;
    }
  </script>
</head>
<body>
  <div class="wrapper">
    <form action="" onsubmit="return validateForm()">
      <h2>Registration</h2>
      <div class="input-field">
        <input type="text" id="name" name="name" >
        <label>Enter your Name</label>
      </div>
      <div class="input-field">
        <input type="text" id="fname" name="fname" >
        <label>Enter Father Name</label>
      </div>
      <div class="input-field">
        <input type="email" name="email" id="email" >
        <label>Enter your email</label>
      </div>
      <div class="input-field">
          <input type="password" name="pass" id="pass">
        <label>Enter your password</label>
      </div>
      <div class="input-field">
        <input type="password" name="cpass" id="cpass" >
        <label>Confirm password</label>
      </div>
      <div class="input-field">
        <input type="number" id="mob" name="mob">
        <label>Mobile</label>
      </div>
      <button type="submit" name="submit" value="submit">Register</button>
      <div class="register">
        <p>You already have an account? <a href="Login3.jsp">Login</a></p>
      </div>
    </form>
  </div>
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
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sarvlet", "root", "root");

            // Check if email already exists
            String checkEmailSql = "SELECT email FROM jsp WHERE email=?";
            ps = con.prepareStatement(checkEmailSql);
            ps.setString(1, email);
            rs = ps.executeQuery();

            if (rs.next()) {
                out.println("<h3><font color='green'>Email already exists</font></h3>");
            } else {
                // Insert data into the database
                String insertSql = "INSERT INTO jsp(name, father, email, pass, mobile) VALUES (?, ?, ?, ?, ?)";
                ps = con.prepareStatement(insertSql);
                ps.setString(1, name);
                ps.setString(2, fname);
                ps.setString(3, email);
                ps.setString(4, pass);
                ps.setString(5, mob);

                int count = ps.executeUpdate();

                if (count > 0) {
                    out.println("Data inserted successfully!");
                     response.sendRedirect("index.jsp");
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