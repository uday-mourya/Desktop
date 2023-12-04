<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <link rel="stylesheet" href="">
</head>
<style>
    /* Your existing CSS styles */

    /* Add a new class for the selected div */
    
    *{
        margin: 0;
        height: auto;
        width: 100%;
        box-sizing: border-box;
    }
    #button1{

        width: 350px; 
        border-radius: 10px;
        background-color:rgb(245,245,245);    
        font-size: 18px;
        height: 50px;
        
    }
    #button2{

        width: 350px;
         border-radius: 10px; 
         font-weight: 700;
        font-size: 18px;
        height: 50px;
        
    }
    #div1{
        height: 100px;
        width: 110px;
        border: 1px solid gainsboro;
        margin: 14px;
        border-radius: 10px;
        background-color: rgb(222, 222, 222);
        
        


    }
    #p1{
        margin-left: 25px;
        font-weight: 600;
        margin-top: 10px;
        font-size: 17px;
        color: rgb(126, 117, 117);
    }
    #h{
        margin-left: 21px;
        font-weight: bold;
        margin-top: -20px;
        font-size: 37px;
    }
    #div1 p h3:hover{
            background-color: white;
            color:  rgb(255, 202, 8);
    }

    #div2{
        height: 80px;
        width: 120px;
        border: 1px solid gainsboro;
        margin: 14px;
        border-radius: 10px;
        background-color: rgb(222, 222, 222);
        
        


    }
    #p2{
        margin-left: 20px;
        font-weight: 600;
        margin-top: 16px;
        font-size: 14px;
        color: rgb(126, 117, 117);
    }
    #h1{
        margin-left: 20px;
        font-weight: 600;
        margin-top: -6px;
        font-size: 14px;
        color: rgb(126, 117, 117);
    }
    #i1{
        color: rgb(126, 122, 122); 
        font-size: 40px;
         margin-top:40px; 
         margin-left: 20px;


    }
    #p4{
        margin-left: 550px; 
         font-size: 22px; 
         margin-top:-20px;
    }
    #i2{
        color: rgb(126, 122, 122);
         font-size: 40px;
         margin-left: 1150px;
         margin-top: -70px;
    }
    #btn6{

        width:600px;
        height: 40px;
        margin-left: 360px;
        border-radius: 10px;
        margin-top: 20px;
    }
    .selected {
        background-color: white !important;
    }
</style>

<body>
    <div class="container-fluid">
        <div class="container-fluid" ">
    <div class="container-fluid">
        <div class="row row-cols-lg-1 row-cols-1 shadow-lg">
           <div class="col">
            <div>
                <i id="i1" class="fa-solid fa-angle-left" ></i>
                <p id="p4" >ELECTRICIAN</p>
                <i  id="i2"class="fa-solid fa-xmark"></i>
            </div>


           </div> 

        </div>

    </div>
    <div class="container-fluid" style="background-color: rgb(242, 242, 242); height: 65px;">
        <div class="row row-cols-lg-1 row-cols-1">
            <div style="font-weight: 700;font-size: 25px; margin-left: 520px;margin-top: 10px;">CHOOSE DATE/TIME</div>

        </div>    
 
    </div>
        <!-- Your existing HTML structure -->

        <div class="container" style="background-color:rgb(242, 242, 242); margin-top: 30px; width: 70%;">
            <div class="row row-cols-lg-6 row-cols-md-4 row-cols-sm-3 mt-4 ms-3 p-4">
                <div id="div1" class="col shadow-lg" onclick="changeBackground(this)">
                    <p id="p1">Mon</p>
                    <h3 id="h">15</h3>
                </div>
                <div id="div2" class="col shadow-lg" onclick="changeBackground(this)">
                    <p id="p1">Tue</p>
                    <h3 id="h">16</h3>
                </div>
                <div id="div2" class="col shadow-lg" onclick="changeBackground(this)">
                    <p id="p1">Tue</p>
                    <h3 id="h">16</h3>
                </div>
                <div id="div2" class="col shadow-lg" onclick="changeBackground(this)">
                    <p id="p1">Tue</p>
                    <h3 id="h">16</h3>
                </div>
                <div id="div2" class="col shadow-lg" onclick="changeBackground(this)">
                    <p id="p1">Tue</p>
                    <h3 id="h">16</h3>
                </div>
                <div id="div2" class="col shadow-lg" onclick="changeBackground(this)">
                    <p id="p1">Tue</p>
                    <h3 id="h">16</h3>
                </div>
                
                <!-- Add similar onclick attribute for other divs -->

            </div>
        </div>
        
        
        <!--date and time-->
        <div class="container" style="background-color:rgb(255, 255, 255); margin-top: 30px; width: 70%;">
            <div class="row row-cols-lg-6 row-cols-md-4  ms-3 p-4">
                <div id="div2" class="col  shadow-lg" onclick="changeBackground(this)">
                    <p id="p2">08:00 AM -</p>
                    <h3 id="h1">10:00 AM</h3>
                </div>
                <div id="div2" class="col  shadow-lg" onclick="changeBackground(this)">
                    <p id="p2">10:00 AM -</p>
                    <p id="h1">12:00 PM</p> 
                </div>
                <div id="div2" class="col  shadow-lg" onclick="changeBackground(this)">
                    <p id="p2">12:00 PM -</p>
                    <h3 id="h1">02:00 PM</h3>                </div>
                <div id="div2" class="col  shadow-lg" onclick="changeBackground(this)">
                    <p id="p2">02:00 PM -</p>
                    <h3 id="h1">04:00 PM</h3> 
                </div>
                <div id="div2" class="col  shadow-lg" onclick="changeBackground(this)">
                    <p id="p2">04:00 PM -</p>
                    <h3 id="h1">06:00 PM</h3> 
                </div>
                <div id="div2" class="col  shadow-lg" onclick="changeBackground(this)">
                    <p id="p2">06:00 PM -</p>
                    <h3 id="h1">08:00 PM</h3> 
                </div>
           </div>
        </div>
         <!--date and time-->
       
        <!-- Remaining HTML content -->
        <div class="container-fluid">
    <div class="row">
        <div class="col" style="background-color: white; border: 1px solid gainsboro; height: 80px;">
            <button id="btn6" class="btn-warning shadow-lg"><a href="confirmproject.jsp" style="color: black; text-decoration: none;">PROCEED</a></button>

        </div>

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
