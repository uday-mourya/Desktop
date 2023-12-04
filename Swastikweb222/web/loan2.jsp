<%-- 
    Document   : loan2
    Created on : Dec 2, 2023, 4:38:26 PM
    Author     : dell
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <title>Loan Apply Form</title>

        <style>
            .box {
                border: 2px solid #9F1945;
                padding: 20px;
                text-align: center;
                margin-top: 15px;
                margin-bottom: 20px;
                background-color: #fefefe;
                border-radius: 10px;
                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
                transition: transform 0.3s ease-in-out;
            }

            .box:hover {
                transform: scale(1.05);
            }
            h2 {
                text-align: center;
                color: #9F1945;
                margin-top: 100px;
                margin-bottom: 10px;
            }
            s




            #ba {
                background-color: #fff0e6;
            }

            #top-nav {
                font-size: 20px;
                color: black;
            }

            #top-nav:hover {
                color: blue;
            }

            .navbar {
                background-color: #9F1945;
            }

            .btn {
                background-color: #9F1945;
            }
            .btn:hover {
                background-color: #9F1945;
            }
            h3 {
                font-size: 20px;
            }

            h4 {
                font-size: 17px;
            }

            #internet {
                margin-top: 30px;
            }

            .back-img {
                height: 80vh;
                width: 100%;
                background-repeat: no-repeat;
                background-size: cover;
            }

            .lead {
                font-size: 20px;
            }

            #icon {
                color: #FF9933;
                font-size: 25px;
                margin-left: 30px;
            }

            .img-fluid {
                height: 250px;
                width: 400px;
                border-radius: 15px;
                transition: 1s;
            }

            .img-fluid:hover {
                color: #FF9933;
                transform: scale(1.1);
            }

            #butcenter {
                margin-left: 70px;
                border-radius: 20px;
            }

            #navbarDropdownMenuLink {
                font-size: 20px;
            }

            .foot {
                margin-top: 35px;
                color: white;
            }

            div a {
                color: white;
            }

            .footer-desc {
                color: white;
            }

            .icon {
                font-size: 25px;
                margin-left: 5px;
            }

            .mar {
                margin-top: 70px;
                background-color: whitesmoke;
            }

            .icon:hover {
                color: #9F1945;
            }

            footer {
                background-color: #3D3D3D;
            }

            #save {
                margin-top: 100px;
            }

            .background {
                background-color: #fff0e6;
            }

            #fix {
                margin-top: 6px;
            }

            .mat {
                margin-top: 30px;
            }
            /* Add this CSS code to your existing styles */

            @media screen and (max-width: 360px) {
                /* .box {
                    margin-top: 40px;
                } */
                .shadow {
                    height: 70px;
                    width: 90%;
                }

                .imggg {
                    width: 80%;
                }
            }
        </style>
        <script>
            function namevalidate()
            {
                var name = document.getElementById("name");
                var udisplay = document.getElementById("udisplay");
                if (name.value.trim() == "") {
                    udisplay.innerHTML = "Name Required";
                    udisplay.style.color = "red";
                    return false;
                } else {
                    var reg = /^[A-Z a-z]+$/;
                    if (reg.test(name.value)) {
                        udisplay.innerHTML = "";
                        udisplay.style.color = "Green";
                        return true;
                    } else {
                        udisplay.innerHTML = "Only letters are allowed";
                        udisplay.style.color = "red";
                        return false;
                    }
                     }
                    }
            function Fvalidate()
            {
                var Fname = document.getElementById("Fname");
                var fdisplay = document.getElementById("fdisplay");
                if (Fname.value.trim() == "") {
                    fdisplay.innerHTML = "FatherName Required";
                    fdisplay.style.color = "red";
                    return false;
                } else {
                    var reg = /^[A-Z a-z]+$/;
                    if (reg.test(Fname.value)) {
                        fdisplay.innerHTML = "";
                        fdisplay.style.color = "green";
                        return true;
                    } else {
                        fdisplay.innerHTML = "Only letters are allowed";
                        fdisplay.style.color = "red";
                        return false;
                    }
                     }
                    }
            function namevalidatenominee()
            {
                var name = document.getElementById("nomineename");
                var udisplay = document.getElementById("ndisplay");
                if (name.value.trim() == "") {
                    udisplay.innerHTML = "Name Required";
                    udisplay.style.color = "red";
                    return false;
                } else {
                    var reg = /^[A-Z a-z]+$/;
                    if (reg.test(name.value)) {
                        udisplay.innerHTML = "";
                        udisplay.style.color = "Green";
                        return true;
                    } else {
                        udisplay.innerHTML = "Only letters are allowed";
                        udisplay.style.color = "red";
                        return false;
                    }
                     }
                    }

            function Movalidate()
            {
                var mobile = document.getElementById("mobile");
                var mdisplay = document.getElementById("mdisplay");
                if (mobile.value.trim() == "") {
                    mdisplay.innerHTML = "Mobile Number Required";
                    mdisplay.style.color = "red";
                    return false;
                } else {
                    var reg = /^[6789][0-9]{9}/;
                    if (reg.test(mobile.value)) {
                        mdisplay.innerHTML = "Valid";
                        mdisplay.style.color = "Green";
                        return true;
                    } else {
                        mdisplay.innerHTML = "Number should start with 6, 7, 8, or 9 and have 10 digits";
                        mdisplay.style.color = "red";
                        return false;
                    }
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



            function aadharvalidate() {
                var name = document.getElementById("aadhar");
                var udisplay = document.getElementById("display2");

                if (name.value.trim() == "") {
                    udisplay.innerHTML = "Aadhar Number Required";
                    udisplay.style.color = "red";
                    return false;
                } else {
                    var reg = /^\d{12}$/; // Exactly 12 digits
                    if (reg.test(name.value)) {
                        udisplay.innerHTML = "Valid";
                        udisplay.style.color = "green";
                        return true;
                    } else {
                        udisplay.innerHTML = "Please Enter Valid 12 digits Aadhar Number";
                        udisplay.style.color = "red";
                        return false;
                    }
                }
            }
            function panvalidate() {
                var name = document.getElementById("pan");
                var udisplay = document.getElementById("display");

                if (name.value.trim() == "") {
                    udisplay.innerHTML = "Pan Number Required";
                    udisplay.style.color = "red";
                    return false;
                } else {
                    var reg = /^[A-Za-z]{5}\d{4}[A-Za-z]$/; // 5 characters, 4 digits, 1 character
                    if (reg.test(name.value)) {
                        udisplay.innerHTML = "";
                        udisplay.style.color = "green";
                        return true;
                    } else {
                        udisplay.innerHTML = "Please enter the valid pattern";
                        udisplay.style.color = "red";
                        return false;
                    }
                }
            }
            function homevalidate() {
                var name = document.getElementById("amount");
                var udisplay = document.getElementById("displayhome");

                if (name.value.trim() == " ") {
                    udisplay.innerHTML = "Amount Required";
                    udisplay.style.color = "red";
                    return false;
                } else {
                    var reg = /^[0-9]+$/; // Only allow numbers
                    if (reg.test(name.value)) {
                        udisplay.innerHTML = "valid";
                        udisplay.style.color = "green";
                        return true;
                    } else {
                        udisplay.innerHTML = "Only numbers are allowed in HomeNumber";
                        udisplay.style.color = "red";
                        return false;
                    }
                }
            }
            function phomevalidate() {
                var name = document.getElementById("amount");
                var udisplay = document.getElementById("displayhome2");

                if (name.value.trim() == " ") {
                    udisplay.innerHTML = "Amount Required";
                    udisplay.style.color = "red";
                    return false;
                } else {
                    var reg = /^[0-9]+$/; // Only allow numbers
                    if (reg.test(name.value)) {
                        udisplay.innerHTML = "valid";
                        udisplay.style.color = "green";
                        return true;
                    } else {
                        udisplay.innerHTML = "Only numbers are allowed in HomeNumber";
                        udisplay.style.color = "red";
                        return false;
                    }
                }
            }

        </script>
    </head>
    <body>
        <header>
            <div class="shadow bg-white rounded fixed-top">
                <nav class="navbar navbar-expand-lg">
                    <div class="container-fluid">
                        <a class="navbar-brand " href="#"
                           ><img src="img/Logo_New-3.png" height="40px" width="140px" alt=""
                              /></a>
                        <button
                            class="navbar-toggler bg-light"
                            type="button"
                            data-bs-toggle="collapse"
                            data-bs-target="#navbarSupportedContent"
                            aria-controls="navbarSupportedContent"
                            aria-expanded="false"
                            aria-label="Toggle navigation"
                            >
                            <span class="navbar-toggler-icon"></span>
                        </button>
                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-auto">
                                <li class="nav-item ms-4">
                                    <a class="nav-link active text-white" id="top-nav" href="index.html"
                                       >Home</a
                                    >
                                </li>
                                <li class="nav-item ms-4">
                                    <a class="nav-link active text-white " id="top-nav" href="About.html"
                                       >About Us</a
                                    >
                                </li>
                                <li class="nav-item ms-4">
                                    <a class="nav-link active text-white" id="top-nav" href="Accountd.html"
                                       >Account</a
                                    >
                                </li>
                                <li class="nav-item ms-4">
                                    <a class="nav-link active text-white" id="top-nav" href="Loan.html"
                                       >Loans</a
                                    >
                                </li>
                                <li class="nav-item ms-4">
                                    <a class="nav-link active text-white "   id="top-nav" href="Cards.html"
                                       >Cards</a
                                    >
                                </li>
                                <li class="nav-item ms-4">
                                    <a class="nav-link active text-white " id="top-nav" href="Offers.html"
                                       >Offers</a
                                    >
                                </li>
                                <li class="nav-item dropdown ml-5 text-white">
                                    <a
                                        class="nav-link dropdown-toggle ms-5 text-white"
                                        style="font-size: 20px"
                                        href="#"
                                        id="navbarDropdown"
                                        role="button"
                                        data-bs-toggle="dropdown"
                                        aria-expanded="false"
                                        >
                                        Login
                                    </a>
                                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                        <li>
                                            <a class="dropdown-item" href="Login.html">Customer</a>
                                        </li>
                                        <li><a class="dropdown-item" href="#">Employee</a></li>
                                        <li><a class="dropdown-item" href="#">Admin</a></li>
                                        <!-- <li><hr class="dropdown-divider"></li> -->
                                        <!-- <li><a class="dropdown-item" href="#">Something else here</a></li> -->
                                    </ul>
                                </li>
                            </ul>

                        </div>
                    </div>
                </nav>
            </div>
        </header>
        <br><br>
        <section class="section dashboard  loan my-5 ml-3 mr-3" >
            <div class="container border p-20 " >
                <h3 class="text-center my-3 mb-4"  id="top">Loan Apply Form</h3>
                <fieldset>   
                    <form class="row g-3 border">
                        <!-- <h4 class="my-3 mb-4">Identity Details</h4> -->
                        <div class="col-md-12">
                            <h5 class="my-3 mb-4">Identity Details</h5>  
                        </div>
                        <div class="col-md-4 mb-5">
                            <label for="inputState" class="form-label">Select Loan Type <font face="Lato" color="red">*</font></label>
                            <select id="inputState" class="form-select  form-control mx-auto w-100">
                                <option selected disabled>Choose...</option>
                                <option>Home Loan </option>
                                 <option>Education Loan </option>
                                  <option>Car Loan </option>
                                   <option>Personal Loan </option>
                            </select>
                        </div>
                        <div class="col-md-4 mb-4 ">
                            <label for="inputCity" class="form-label">Aadhar Number <font face="Lato" color="red">*</font></label>
                            <input onkeyup="aadharvalidate()" id="aadhar" type="text" class="form-control" id="inputCity">
                            <span id="display2" style="color:red; font-size: 14px;"></span>
                        </div>

                        <div class="col-md-4 mb-4">
                            <label for="inputCity" class="form-label">Confirm Aadhar Number <font face="Lato" color="red">*</font></label>
                            <input type="text" class="form-control" id="inputCity">

                        </div>
                        <div class="col-md-6 my-3 mb-4">
                            <label for="inputCity" class="form-label">Pan Number <font face="Lato" color="red">*</font></label>
                            <input onkeyup="panvalidate()" id="pan" type="text" class="form-control" id="inputCity">
                            <span id="display" style="color:red; font-size: 14px;"></span>
                        </div>

                        <div class="col-md-6 my-3 mb-4">
                            <label for="inputCity" class="form-label">Confirm Pan Number <font face="Lato" color="red">*</font></label>
                            <input type="text" class="form-control" id="inputCity">

                        </div>
                        <!--
                                            </form>
                                        </fieldset> -->

                        <form class="row g-3 border">
                            <!-- <h4 class="my-3 mb-4">Address Details</h4> -->
                            <div class="col-md-12">
                                <h5 class="my-3 mb-4">Personal Details</h5>  
                            </div>
                            <div class="col-md-6 mb-4">
                                <label for="inputCity" class="form-label">Enter Address <font face="Lato" color="red">*</font></label>
                                <input type="text" class="form-control" id="inputCity">
                            </div>

<!--                            <div class="col-md-6">
                                <label for="inputCity" class="form-label">Mobile Number <font face="Lato" color="red">*</font></label>
                                <input  onkeyup="Movalidate()" id="mobile" maxlength="10" type="text" class="form-control" id="inputCity">
                                <span id="mdisplay" style="color:red; font-size: 14px;"></span>
                            </div>-->
                            <div class="col-md-6 mb-4">
                                <label for="inputCity" class="form-label">Email-id <font face="Lato" color="red">*</font></label>
                                <input onkeyup="validateEmail()" id="email" type="text" class="form-control" id="inputCity">
                                <span id="edisplay" style="color:red; font-size: 14px;"></span>

                            </div>
                        </form>
                        <!-- hhhd -->
                        <div class="container p-20 " >

                            <h3 class="text-center my-3 mb-4">Co-Applicant/Guarantor Details</h3>   
                            <form class="row g-3">
                                <!-- <h4 class="my-3 mb-4">Identity Details</h4> -->
                                <div class="col-md-12">
                                    <h5 class="my-3 mb-4">Identity Details</h5>  
                                </div>

                                <div class="col-md-6">
                                    <label for="inputEmail4" class="form-label">Guarantor Name <font face="Lato" color="red">*</font></label>
                                    <input onkeyup="namevalidate()" id="name" type="email" class="form-control" id="inputEmail4">
                                    <span id="udisplay" style="color:red; font-size: 14px;"></span>
                                </div>
                                <div class="col-md-6">
                                    <label for="inputPassword4" class="form-label">Father Name <font face="Lato" color="red">*</font></label>
                                    <input onkeyup="Fvalidate()" id="Fname" type="text" class="form-control" id="inputPassword4">
                                    <span id="fdisplay" style="color:red; font-size: 14px;"></span>
                                </div>
                                <div class="col-md-6 my-4">
                                    <label for="inputAddress2" class="form-label">  Gender <font face="Lato" color="red">*</font></label><br>
                                    <input type="radio" name="radio" class="mr-3 ml-2">Male
                                    <input type="radio" name="radio" class="mr-3 ml-2">Female  
                                    <input type="radio" name="radio" class="mr-3 ml-2">Other
                                </div>
                                <div class="col-md-6 my-4">
                                    <label for="inputCity" class="form-label">Enter Address <font face="Lato" color="red">*</font></label>
                                    <input type="text" class="form-control" id="inputCity">
                                </div>
                                <div class="col-md-6 my-4">
                                    <label for="inputCity" class="form-label">Guarantor Account Number <font face="Lato" color="red">*</font></label>
                                    <input type="text" class="form-control" id="inputCity">

                                </div>

                                <div class="col-md-6 my-4">
                                    <label for="inputCity" class="form-label">Confirm Account Number <font face="Lato" color="red">*</font></label>
                                    <input type="text" class="form-control" id="inputCity">

                                </div>
                                <div class="col-md-6 my-4">
                                    <label for="inputCity" class="form-label">Aadhar Number <font face="Lato" color="red">*</font></label>
                                    <input type="text" class="form-control" id="inputCity">

                                </div>

                                <div class="col-md-6 my-4">
                                    <label for="inputCity" class="form-label">Confirm Aadhar Number <font face="Lato" color="red">*</font></label>
                                    <input type="text" class="form-control" id="inputCity">

                                </div>
                                <div class="col-md-6 mb-4">
                                    <label for="inputCity" class="form-label">Pan Number <font face="Lato" color="red">*</font></label>
                                    <input type="text" class="form-control" id="inputCity">

                                </div>

                                <div class="col-md-6 mb-4">
                                    <label for="inputCity" class="form-label">Confirm Pan Number <font face="Lato" color="red">*</font></label>
                                    <input type="text" class="form-control" id="inputCity">

                                </div>

                            </form>  
                            <div class="text-center my-3">
                                <button class="btn text-white mt-3">Submit</button>
                            </div>

                    </form>
                </fieldset> 

            </div>
        </section>
        <!-- shhshend -->

        <!----Footer --->

        <footer >
            <div class="foot">&nbsp;</div>
            <div class="container" id="footer">
                <div class="row">
                    <div class="col-xl-3 col-lg-4 col-md-6 ">
                        <div>
                            <h3><img src="img/Logo_New-3.png" alt="" width="200px" /></h3>
                            <p class="footer-desc">
                                Lorem ipsum dolor sit amet consectetur adipisicing elit. Ad
                                soluta facilis eos quia optio iusto odit atque eum tempore,
                                quisquam officiis vero veniam hic,
                            </p>
                        </div>
                        <div class="footicon">
                            <a href="#"><i class="icon fa-brands fa-twitter"></i></a>
                            <a href="#"><i class="icon fa-brands fa-instagram"></i></a>
                            <a href="#"><i class="icon fa-brands fa-linkedin"></i></a>
                            <a href="#"><i class="icon fa-brands fa-facebook"></i></a>
                            <a href="#"><i class="icon fa-brands fa-github"></i></a>
                        </div>
                    </div>
                    <div class="col-xl-2 offset-xl-1 col-lg-2 col-md-6">
                        <div class="text-white">
                            <h4>Quick Link</h4>
                            <ul class="list-unstyled">
                                <li>
                                    <a href="#" class="text-decoration-none">Home</a>
                                </li>
                                <li>
                                    <a href="#" class="text-decoration-none">About Us</a>
                                </li>
                                <li>
                                    <a href="#" class="text-decoration-none">Service</a>
                                </li>
                                <li>
                                    <a href="#" class="text-decoration-none">Contact</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-xl-3 col-lg-3 col-md-6">
                        <div class="text-white">
                            <h4>Popular products</h4>
                            <ul class="list-unstyled">
                                <li>
                                    <a href="#" class="text-decoration-none">Accounts</a>
                                </li>
                                <li>
                                    <a href="#" class="text-decoration-none">Cards</a>
                                </li>
                                <li>
                                    <a href="#" class="text-decoration-none">Loan</a>
                                </li>
                                <li>
                                    <a href="#" class="text-decoration-none">Deposit</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-xl-3 col-lg-3 col-md-6">
                        <div class="text-white">
                            <h4>Newsletter</h4>
                            <div>
                                <label for="Newsletter" class="form-label"
                                       >Subscribe to our newsletter</label
                                >
                                <input
                                    type="text"
                                    class="form-control"
                                    placeholder="Enter Your Email"
                                    />
                                <button class="btn text-white mt-3">Subscribe</button>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="d-flex justify-content-center text-white">
                    <div class="copyright">
                        <p>
                            Developed and maintained by
                            <a href="#" target="_blank">Tech Nerds</a>
                        </p>
                    </div>
                </div>
                <div class="d-flex justify-content-center text-white">
                    <div class="copyright">
                        All Right Reserved
                        <a href="Index.html">@Swastik Bank</a>
                    </div>
                </div>
            </div>
        </footer>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

    </body>
</html>

