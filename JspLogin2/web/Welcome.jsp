<%-- 
    Document   : Welcome
    Created on : Oct 29, 2023, 6:16:58 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bootstrap One-Page Website</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        /* Additional Custom Styles */
        /* You can customize these styles as needed */
        body {
            padding-top: 50px;
        }
        .jumbotron {
            background-color: #f8f9fa;
        }
        .services {
            background-color: #e9ecef;
            padding: 60px 0;
        }
        .about {
            background-color: #d1ecf1;
            padding: 60px 0;
        }
        .contact {
            background-color: #f8d7da;
            padding: 60px 0;
        }
    </style>
</head>
<body>
    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
        <a class="navbar-brand" href="#">Your Website</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item"><a class="nav-link" href="#services">Services</a></li>
                <li class="nav-item"><a class="nav-link" href="#about">About</a></li>
                <li class="nav-item"><a class="nav-link" href="#contact">Contact</a></li>
            </ul>
        </div>
    </nav>

    <!-- Header Section -->
    <header class="jumbotron text-center">
        <h1>Welcome to Our Website</h1>
        <p>A simple and beautiful one-page website using Bootstrap</p>
    </header>

    <!-- Services Section -->
    <section id="services" class="services">
        <div class="container text-center">
            <h2>Our Services</h2>
            <p>Check out what we offer</p>
            <!-- Your services content here -->
        </div>
    </section>

    <!-- About Section -->
    <section id="about" class="about">
        <div class="container text-center">
            <h2>About Us</h2>
            <p>Learn more about our company</p>
            <!-- About content here -->
        </div>
    </section>

    <!-- Contact Section -->
    <section id="contact" class="contact">
        <div class="container text-center">
            <h2>Contact Us</h2>
            <p>Get in touch with us</p>
            <!-- Contact form or contact information here -->
        </div>
    </section>

    <!-- Footer Section -->
    <footer class="jumbotron text-center">
        <p>&copy; 2023 Your Website. All rights reserved.</p>
    </footer>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
