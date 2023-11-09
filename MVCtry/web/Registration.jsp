<%-- 
    Document   : Registration
    Created on : Nov 4, 2023, 02:18:15?PM
    Author     : hp
--%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Registration</title>
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
      background-color:yellowgreen;
      background-position: center;
      background-size: cover;
    }

    .wrapper {
      width: 400px;
      border-radius: 8px;
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
      border-radius: 3px;
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
 
</head>
<body>
   <div class="wrapper">
    <form action="Registrationcontroller" >
      <h2>Registration</h2>
      <div class="input-field">
        <input type="text" onkeyup="validateName()" id="name" name="name" >
        <span id="ndisplay"></span>
        <label>Enter your Name</label>
      </div>
      
      <div class="input-field">
        <input type="text" onkeyup="validateEmail()" id="email" name="email">
        <span id="edisplay"></span>
        <label>Enter your Email</label>
    </div>
      <div class="input-field">
          <input type="password" onkeyup="validatePass()" name="password" id="password">
        <span id="pdisplay"></span>
        <label>Enter your password</label>
      </div>
      <div class="input-field">
        <input type="password" onkeyup="validatecPass()" name="cpassword" id="cpassword" >
        <span id="cpdisplay"></span>
        <label>Confirm password</label>
      </div>
      <div class="input-field">
        <input type="text" onkeyup="validateMobile()" id="mob" name="mobile">
        <span id="numdisplay"></span>
        <label> Mobile Number</label>
    </div>
      <div class="input-field">
        <input type="text" onkeyup="validateSalary()" id="salary" name="salary" >
        <span id="fdisplay"></span>
        <label>Enter salary</label>
      </div>
      <button type="submit" onsubmit="valid()" name="submit" value="submit">Register</button>
      <div class="register">
        <p>You already have an account? <a href="Login.jsp">Login</a></p>
      </div>
    </form>
  </div>
</body>
</html>
    