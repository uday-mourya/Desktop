<%-- 
    Document   : Login
    Created on : Oct 31, 2023, 9:03:45 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="Login.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    </head>
    <title>Responsive Webpage</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        .navbar {
            background-color: #333;
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 10px 20px;
        }

        .logo img {
            max-width: 100px;
        }

        .menu-toggle {
            display: none;
            cursor: pointer;
        }

        .bar {
            background-color: white;
            height: 3px;
            width: 25px;
            margin: 3px 0;
        }

        .menu {
            display: flex;
        }

        .menu a {
            color: white;
            text-decoration: none;
            padding: 0 15px;
        }

        .content {
            display: flex;
            flex-direction: row;
            flex-wrap: wrap;
            justify-content: space-around;
            padding: 60px;
            height: 60vh;
            width: 100vw;
        }

        .login-form {
            flex: 1;
            max-width: 300px;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .login-form input,
        .login-form button {
            width: 100%;
            margin-bottom: 10px;
            padding: 10px;
        }

        .image-gallery {
            flex: 1;
            display: flex;
            flex-wrap: wrap;
            justify-content: space-around;
        }

        .image-gallery img {
            width: 30%;
            margin-bottom: 20px;
        }

        @media (max-width: 768px) {
            .menu {
                display: none;
                flex-direction: column;
                text-align: center;
                width: 100%;
                background-color: #333;
                position: absolute;
                top: 60px;
                left: 0;
            }

            .menu.show {
                display: flex;
            }

            .menu a {
                padding: 10px 0;
                width: 100%;
                box-sizing: border-box;
            }

            .menu-toggle {
                display: block;
            }
        }
        .footer {
            background-color: #333;
            color: white;
            padding: 30px 0;
            margin-top: 50px;
        }

        .container {
            width: 80%;
            margin: 0 auto;
        }

        .footer-content {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-between;
        }

        .footer-section {
            flex: 1 1 30%; /* Responsive layout for different screen sizes */
            margin-bottom: 20px;
        }

        .footer-section h2 {
            font-size: 1.5rem;
            margin-bottom: 10px;
        }

        .footer-section ul {
            list-style: none;
            padding: 0;
        }

        .footer-section ul li {
            margin-bottom: 10px;
        }

        @media (max-width: 768px) {
            .footer-section {
                flex: 1 1 100%; /* Full width on smaller screens */
            }
        }
        @media (max-width: 36px) {
            .footer {
                /* flex: 1 1 100%; Full width on smaller screens */
                margin-top: 200px;
            }

        }
    </style>
</head>

<body>
    <div class="navbar">
        <div class="logo">
            <img src="images/logo1.jpg" alt="Logo">
        </div>
        <div class="menu-toggle" id="mobile-menu">
            <span class="bar"></span>
            <span class="bar"></span>
            <span class="bar"></span>
        </div>
        <div class="menu" id="menu">
            <a href="#">Home</a>
            <a href="#">Login</a>
            <a href="#">Contact</a>
            <a href="#">Services</a>
        </div>
    </div>

    <div class="content">
        <div class="login-form">
            <h2>Login</h2>
            <form>
                <input type="text" placeholder="Username" required >
                <input type="password" placeholder="Password" required>
                <button type="submit" class="btn btn-info">Login</button>
            </form>
        </div>
        <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="images/img3.jpg" class="d-block w-60" alt="..." class="img-fluid">
                </div>
                <div class="carousel-item">
                    <img src="images/img3.jpg" class="d-block w-60" alt="..." class="img-fluid">
                </div>
                <div class="carousel-item">
                    <img src="images/img3.jpg" class="d-block w-60" alt="..." class="img-fluid">
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>
    </div>

    <script src="script.js"></script>

    <footer class="footer">
        <div class="container">
            <div class="footer-content">
                <div class="footer-section about">
                    <h2>About Us</h2>
                    <p>Education is the transmission of knowledge, skills, and character traits. Its precise definition is disputed and some researchers stress the role of critical thinking to distinguish education from indoctrination.</p>
                </div>
                <div class="footer-section links">
                    <h2>Quick Links</h2>
                    <ul>
                        <li><a href="#">Home</a></li>
                        <li><a href="Servic.jsp">Services</a></li>
                        <li><a href="#">About</a></li>
                        <li><a href="#">Contact</a></li>
                    </ul>
                </div>
                <div class="footer-section contact">
                    <h2>Contact Us</h2>
                    <p>Email: info@example.com<br>Phone: +1 234 567 890</p>
                </div>
            </div>
        </div>
    </footer>

</body>

</html>