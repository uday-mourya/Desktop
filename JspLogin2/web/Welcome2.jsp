<%-- 
    Document   : Welcome2
    Created on : Oct 30, 2023, 11:23:53?AM
    Author     : dell
--%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome Page</title>
    <style>
        /* Reset some default styles */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, sans-serif;
            background-image: url('background.jpg'); /* Replace 'background.jpg' with your image path */
            background-size: cover;
            background-position: center;
            background-attachment: fixed;
            color: #fff;
            text-align: center;
            line-height: 1.6;
        }

        /* Navigation Bar Styles */
        .navbar {
            background: rgba(0, 0, 0, 0.7);
            overflow: hidden;
        }

        .navbar a {
            float: left;
            display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }

        .navbar a:hover {
            background-color: #555;
        }

        /* Welcome Content Styles */
        .welcome-content {
            padding: 100px 0;
        }

        .welcome-text {
            font-size: 36px;
        }

        /* Responsive Design */
        @media (max-width: 768px) {
            .navbar a {
                float: none;
                display: block;
                text-align: left;
            }
        }
    </style>
</head>
<body>
    <div class="navbar">
        <a href="#">Home</a>
        <a href="#">About</a>
        <a href="#">Services</a>
        <a href="#">Contact</a>
    </div>

    <div class="welcome-content">
        <h1 class="welcome-text">Welcome to Our Website</h1>
        <p>This is a responsive welcome page with a navigation bar and a background image.</p>
    </div>
</body>
</html>
