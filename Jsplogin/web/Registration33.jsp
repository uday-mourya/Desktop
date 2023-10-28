<%-- 
    Document   : Registration
    Created on : Oct 25, 2023, 3:55:06 PM
    Author     : Lenovo
--%>
<%@ page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Akhil</title>
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
      background-color: black;
      background-position: center;
      background-size: cover;
    }

    .wrapper {
      width: 400px;
      border-radius: 8px;
      background-color: black;
      padding: 30px;
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
      height: 20px;
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
      border-radius: 3px;
      font-size: 16px;
      border: 2px solid transparent;
      transition: 0.3s ease;
    }

    button:hover {
      color: #fff;
      border-color: #yy5577;
      background: rgba(255, 255, 255, 0.15);
    }

    .register {
      text-align: center;
      margin-top: 30px;
      color: #fff;
    }
  </style>
  <script>
    function validateForm(){
        var user=validateName();
        var fname=validateFname();
        var email=validateEmail();
        var pass=validatePass();
        var cpass=validatecPass();
        var mobile=validateMobile();

        var ndisplay=document.getElementById("ndisplay");
        var fdisplay=document.getElementById("fdisplay");
        var edisplay=document.getElementById("edisplay");
        var pdisplay=document.getElementById("pdisplay");
        var cpdisplay=document.getElementById("cpdisplay");
        var numdisplay=document.getElementById("numdisplay");

        if(user==false){
            if(fname==false)
                fdisplay.innerHTML="";
                if(email==false)
                edisplay.innerHTML="";
                if(pass==false)
                pdisplay.innerHTML="";
                if(cpass==false)
                cpdisplay.innerHTML="";
                if(mobile==false)
                 numdisplay.innerHTML="";

                 
            return false;
          
        }
       
          else if(fname==false){
              
                if(email==false)
                edisplay.innerHTML="";
                if(pass==false)
                pdisplay.innerHTML="";
                if(cpass==false)
                cpdisplay.innerHTML="";
                if(mobile==false)
                numdisplay.innerHTML="";
            return false;
        }
      
              else  if(email==false){
               
                if(pass==false)
                pdisplay.innerHTML="";
                if(cpass==false)
                cpdisplay.innerHTML="";
                if(mobile==false)
                numdisplay.innerHTML="";
            return false;
        }
        else if(pass==false){
               if(cpass==false)
               cpdisplay.innerHTML="";
               if(mobile==false)
               numdisplay.innerHTML="";
           return false;
       } else if(cpass==false){
              
               if(mobile==false)
               numdisplay.innerHTML="";
           return false;
       }else if(mobile==false){
            
           return false;
       }
    }
    function validateName() {
            var nameInput = document.getElementById("name");
            var nameDisplay = document.getElementById("ndisplay");
            var reg = /^[A-Za-z]+$/;

            if (nameInput.value.trim() === "") {
                nameDisplay.innerHTML = "Name is required";
                nameDisplay.style.color = "red";
                nameInput.focus();
                return false;
            } else if (!reg.test(nameInput.value)) {
                nameDisplay.innerHTML = "Only letters are allowed";
                nameDisplay.style.color = "red";
                nameInput.focus();
                return false;
            } else {
                nameDisplay.innerHTML = "";
                return true;
            }
        }
        function validateFname() {
            var fnameInput = document.getElementById("fname");
            var fnameDisplay = document.getElementById("fdisplay");
            var reg = /^[A-Za-z]+$/;

            if (fnameInput.value.trim() === "") {
                fnameDisplay.innerHTML = "fName is required";
                fnameDisplay.style.color = "red";
                fnameInput.focus();
                return false;
            } else if (!reg.test(fnameInput.value)) {
                fnameDisplay.innerHTML = "Only letters are allowed";
                fnameDisplay.style.color = "red";
                fnameInput.focus();
                return false;
            } else {
                fnameDisplay.innerHTML = "";
                return true;
            }
        }
        function validateEmail() {
            var emailInput = document.getElementById("email");
            var emailDisplay = document.getElementById("edisplay");
            var emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

            if (emailInput.value.trim() === "") {
                emailDisplay.innerHTML = "Email is required";
                emailDisplay.style.color = "red";
                return false;
            } else if (!emailPattern.test(emailInput.value)) {
                emailDisplay.innerHTML = "Invalid email format";
                emailDisplay.style.color = "red";
                return false;
            } else {
                emailDisplay.innerHTML = "";
                return true;
            }
        }
        function validatePass() {
            var passInput = document.getElementById("pass");
            var passDisplay = document.getElementById("pdisplay");
           

            if (passInput.value.trim() === "") {
                passDisplay.innerHTML = "pass is required";
                passDisplay.style.color = "red";
                return false;
            }else {
                passDisplay.innerHTML = "";
                return true;
            }
        }
        function validatecPass() {
            var passInput = document.getElementById("cpass");
            var passDisplay = document.getElementById("cpdisplay");
           

            if (passInput.value.trim() === "") {
                passDisplay.innerHTML = "cpass is required";
                passDisplay.style.color = "red";
                return false;
            }else {
                passDisplay.innerHTML = "";
                return true;
            }
        }
        function validateMobile() {
            var mobInput = document.getElementById("mob");
            var numDisplay = document.getElementById("numdisplay");
            var r = /^[6789][0-9]{9}$/;

            if (mobInput.value.trim() === "") {
                numDisplay.innerHTML = "Mobile number is required";
                numDisplay.style.color = "red";
                return false;
            } else if (!r.test(mobInput.value)) {
                numDisplay.innerHTML = "Number should start with 6, 7, 8, or 9 and have 10 digits";
                numDisplay.style.color = "red";
                mobInput.focus();
                return false;
            } else {
                numDisplay.innerHTML = "";
                return true;
            }
        }
  </script>
</head>
<body>
   <div class="wrapper">
    <form action="" onsubmit="return validateForm()">
      <h2>Registration</h2>
      <div class="input-field">
        <input type="text" onkeyup="validateName()" id="name" name="name" >
        <span id="ndisplay"></span>
        <label>Enter your Name</label>
      </div>
      <div class="input-field">
        <input type="text" onkeyup="validateFname()" id="fname" name="fname" >
        <span id="fdisplay"></span>
        <label>Enter Father Name</label>
      </div>
      <div class="input-field">
        <input type="text" onkeyup="validateEmail()" id="email" name="email">
        <span id="edisplay"></span>
        <label>Enter your Email</label>
    </div>
      <div class="input-field">
          <input type="password" onkeyup="validatePass()" name="pass" id="pass">
        <span id="pdisplay"></span>
        <label>Enter your password</label>
      </div>
      <div class="input-field">
        <input type="password" onkeyup="validatecPass()" name="cpass" id="cpass" >
        <span id="cpdisplay"></span>
        <label>Confirm password</label>
      </div>
      <div class="input-field">
        <input type="text" onkeyup="validateMobile()" id="mob" name="mob">
        <span id="numdisplay"></span>
        <label> Mobile Number</label>
    </div>
      <button type="submit" onsubmit="valid()" name="submit" value="submit">Register</button>
      <div class="register">
        <p>You already have an account? <a href="index.jsp">Login</a></p>
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
                String insertSql = "INSERT INTO reginfo(Name, FName, Email, Password, Contact) VALUES (?, ?, ?, ?, ?)";
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