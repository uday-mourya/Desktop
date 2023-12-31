<%-- 
    Document   : Login
    Created on : Nov 4, 2023, 2:29:38 PM
    Author     : dell
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.io.*,java.util.*" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login</title>
        <style>
            /* Your CSS styles here */
            .login-page {
                width: 360px;
                padding: 8% 0 0;
                margin: auto;
            }
            .form {
                position: relative;
                z-index: 1;
                background: #FFFFFF;
                max-width: 360px;
                border-radius:20px;
                max-height: 360px;
                height:250px;
                margin: 0 auto 100px;
                padding: 45px;
                text-align: cent;
                box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24); /* Fixed the box-shadow */
            }
            .form input {
                font-family: 'Roboto', sans-serif;
                outline: 0;
                background: #f2f2f2;
                width: 100%;
                border: 0;
                margin: 0 0 15px;
                padding: 15px;
                box-sizing: border-box;
                font-size: 14px;
            }
            .form button {
                font-family: 'Roboto', sans-serif;
                text-transform: uppercase;
                outline: 0;
                background: #4CAF50;
                width: 100%;
                border: 0;
                padding: 15px;
                color: #FFFFFF;
                font-size: 14px;
                -webkit-transition: all 0.2 ease;
                transition: all 0.2 ease;
                cursor: pointer;
            }
            .form button:hover,.form button:active,.form button:focus {
                background: #43A047;
            }
            .form .message {
                margin: 15px 0 0;
                color: #b3b3b3;
                font-size: 16px;
            }
            .form .message a {
                color: #4CAF50;
                text-decoration: none;
            }
            .form .register-form {
                display: none;
            }
            .container {
                position: relative;
                z-index: 1;
                max-width: 300px;
                margin: 0 auto;
            }
            .container:before, .container:after {
                content:
                    display: block;
                clear: both;
            }
            .container .info {
                margin: 50px auto;
                text-align: center;
            }
            .container .info h1 {
                margin: 0 0 15px;
                padding: 0;
                font-size: 36px;
                font-weight: 300;
                color: #1a1a1a;
            }
            .container .info span {
                color: #4d4d4d;
                font-size: 12px;
            }
            .container .info span a {
                color: #000000;
                text-decoration: none;
            }
            .container .info span .fa {
                color: #EF3B3A;
            }
        </style>
    </head>
    <body>
        <div class='login-page'>
            <div class='form'>
                <form class='register-form'>
                    <input type='text' placeholder='name'/>
                    <input type='password' placeholder='password'/>
                    <input type='text' placeholder='email address'/>
                    <button>create</button>
                    <p class='message'>Already registered? <a href='#'>Sign In</a></p>
                </form>
                <form class='login-form' method="post" action="logincontroller">
                    <input type='text' name='email' placeholder='Email'/>
                    <input type='password' name='pass' placeholder='password'/>
                    <button type="submit">login</button>
                    <p class='message'>Not registered? <a href='Registration.jsp'>Create an account</a></p>
                </form>
            </div>
        </div>
   
    </body>
</html>