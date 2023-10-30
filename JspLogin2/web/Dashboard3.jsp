<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

    <style>
        @media screen and (min-width: 777px) {
            .nav-link {
                padding: 18px 0;
                min-width: 120px;
            }
            .navbar {
                padding: 0;
            }
        }
    </style>
</head>

<body>
    <nav class="navbar navbar-expand-md navbar-dark bg-dark">
        <div class="container">
            <a class="navbar-brand d-md-none d-xs-block py-3" href="#">
                <img src="/static_files/images/logos/beer_white.png" height="40" alt="Company Logo">
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarNavDropdown">
                <ul class="navbar-nav mx-auto">
                    <li class="nav-item">
                        <a class="nav-link mx-2 active" aria-current="page" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link mx-2" href="#">Locations</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link mx-2" href="#">Menus</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link mx-2" href="#">Catering</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link mx-2" href="#">Reserve</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link mx-2 btn rounded-0 btn-danger" href="#">Order Online</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <div class="text-center p-3 d-none d-md-block">
        <img src="/static_files/images/logos/beer.png" height="120" alt="Company Logo">
    </div>
</body>
</html>
