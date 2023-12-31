<%-- 
    Document   : Welcome3
    Created on : Oct 30, 2023, 11:49:18 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Responsive Navbar</title>
    <link rel="stylesheet" href="styles.css">
    <style>
        body {
    margin: 0;
    font-family: Arial, sans-serif;
}

.navbar {
    background-color:black;
    color: white;
    display: flex;
    justify-content: space-between;
    padding: 10px 20px;
}

.logo {
    font-size: 1.5rem;
}

.menu {
    display: flex;
}

.menu a {
    color: white;
    text-decoration: none;
    margin: 0 15px;
}

.hamburger-menu {
    display: none;
    cursor: pointer;
    font-size: 1.5rem;
}

@media (max-width: 768px) {
    .menu {
        display: none;
    }

    .hamburger-menu {
        display: block;
    }
}
body {
    margin: 0;
    padding: 0;
    background: url('images.jpeg') no-repeat center center/cover;
    /* The shorthand property sets the background image, centers it horizontally and vertically,
    and ensures it covers the entire container */
    height: 100vh; /* Sets the background to cover the full height of the viewport */
    color: white;
    font-family: Arial, sans-serif;
}

/* Additional styles for content */
.content {
    text-align: center;
    padding: 100px;
    font-size: 24px;
}
.text-center{
    margin-top: 170px;
    margin-left: 400px;
}
h1{
    color:red;
}

    </style>
    <Script>
    const menu = document.getElementById('menu');
const hamburgerMenu = document.getElementById('hamburger-menu');

hamburgerMenu.addEventListener('click', () => {
    menu.classList.toggle('show');
});

    </Script>
</head>


<body>
    
    <nav class="navbar">
        <div class="logo">Logo</div>
        <div class="menu" id="menu">
            <a href="#">Home</a>
            <a href="Adminlogin.jsp">Admin</a>
            <a href="Login.jsp">Login</a>
            <a href="#">Services</a>
        </div>
        <div class="hamburger-menu" id="menu">&#9776;</div>
    </nav>
    <div class="text-center">
<!--    <h2>Make Your Carrier With  </h2>
    <h1>E-Learner</h1>-->
    </div>
    <script src="script.js"></script>
</body>

</html>