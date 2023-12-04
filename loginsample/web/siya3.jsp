<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
</head>
<style>
    * {
        margin: 0;
        height: auto;
        box-sizing: border-box;
    }

    #button1,
    #button2 {
        width: 100%;
        max-width: 350px;
        border-radius: 10px;
        font-size: 18px;
        height: 50px;
        margin-bottom: 10px;
    }

    #div1,
    #div2 {
        height: 80px;
        width: 100%;
        max-width: 120px;
        border: 1px solid gainsboro;
        margin: 14px;
        border-radius: 10px;
        background-color: rgb(222, 222, 222);
    }

    #div1 p,
    #div2 p,
    #div1 h3,
    #div2 h3 {
        margin: 0;
    }

    #p1,
    #p2 {
        font-weight: 600;
        font-size: 14px;
        color: rgb(126, 117, 117);
    }

    #h,
    #h1 {
        font-weight: 600;
        font-size: 14px;
        color: rgb(126, 117, 117);
        margin-top: -6px;
    }

    #i1 {
        color: rgb(126, 122, 122);
        font-size: 40px;
        margin-top: 10px;
        margin-left: 20px;
    }

    #p4 {
        font-size: 22px;
        margin-top: -20px;
    }

    #i2 {
        color: rgb(126, 122, 122);
        font-size: 40px;
        margin-top: -20px;
        margin-left: 10px;
    }

    #btn6 {
        width: 100%;
        max-width: 600px;
        height: 40px;
        border-radius: 10px;
        margin-top: 20px;
    }

    .container-fluid {
        padding-right: 15px;
        padding-left: 15px;
        margin-right: auto;
        margin-left: auto;
    }

    @media (min-width: 576px) {
        .container {
            max-width: 540px;
        }
    }

    @media (min-width: 768px) {
        .container {
            max-width: 720px;
        }
    }

    @media (min-width: 992px) {
        .container {
            max-width: 960px;
        }
    }

    @media (min-width: 1200px) {
        .container {
            max-width: 1140px;
        }
    }

    .row-cols-lg-6 .col {
        flex: 0 0 16.666667%;
        max-width: 16.666667%;
    }

    .row-cols-md-4 .col {
        flex: 0 0 25%;
        max-width: 25%;
    }

    .row-cols-sm-3 .col {
        flex: 0 0 33.333333%;
        max-width: 33.333333%;
    }
</style>

<body>
    <div class="container-fluid">
        <div class="container-fluid">
            <div class="row row-cols-lg-1 row-cols-1 shadow-lg">
                <div class="col">
                    <div>
                        <i id="i1" class="fa-solid fa-angle-left"></i>
                        <p id="p4">ELECTRICIAN</p>
                        <i id="i2" class="fa-solid fa-xmark"></i>
                    </div>
                </div>
            </div>
        </div>

        <div class="container-fluid" style="background-color: rgb(242, 242, 242); height: 65px;">
            <div class="row row-cols-lg-1 row-cols-1">
                <div style="font-weight: 700; font-size: 25px; margin-left: 520px; margin-top: 10px;">CHOOSE DATE/TIME</div>
            </div>
        </div>

        <div class="container" style="background-color: rgb(242, 242, 242); margin-top: 30px; width: 70%;">
            <div class="row row-cols-lg-2 row-cols-sm-1 mt-4">
                <div class="col">
                    <button id="button1" class="btn ms-5">Urgently Required</button>
                </div>
                <div class="col">
                    <button id="button2" class="btn-dark">Schedule For Later</button>
                </div>
            </div>

            <div class="row row-cols-lg-6 row-cols-md-4 row-cols-sm-3 mt-4 ms-3 p-4">
                <div id="div1" class="col shadow-lg" onclick="changeBackground(this)">
                    <p id="p1">Mon</p>
                    <h3 id="h">15</h3>
                </div>
                <div id="div2" class="col shadow-lg" onclick="changeBackground(this)">
                    <p id="p1">Tue</p>
                    <h3 id="h">16</h3>
                </div>
                <!-- Add similar onclick attribute for other divs -->
            </div>
        </div>

        <div class="container" style="background-color: rgb(255, 255, 255); margin-top: 30px; width: 70%;">
            <div class="row row-cols-lg-6 row-cols-md-4 ms-3 p-4">
                <div id="div2" class="col shadow-lg" onclick="changeBackground(this)">
                    <p id="p2">08:00 AM -</p>
                    <h3 id="h1">10:00 AM</h3>
                </div>
                <div id="div2" class="col shadow-lg" onclick="changeBackground(this)">
                    <p id="p2">10:00 AM -</p>
                    <p id="h1">12:00 PM</p>
                </div>
                <!-- Add similar onclick attribute for other divs -->
            </div>
        </div>

        <div class="container-fluid">
            <div class="row">
                <div class="col" style="background-color: white; border: 1px solid gainsboro; height: 80px;">
                    <button id="btn6" class="btn-warning shadow-lg"><a href="confirmproject.jsp" style="color: black; text-decoration: none;">PROCEED</a></button>
                </div>
            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    <script>
        // JavaScript function to change background color
        function changeBackground(clickedDiv) {
            // Remove 'selected' class from all divs
            var allDivs = document.querySelectorAll('.col');
            allDivs.forEach(function (div) {
                div.classList.remove('selected');
            });

            // Add 'selected' class to the clicked div
            clickedDiv.classList.add('selected');
        }
    </script>
</body>

</html>
