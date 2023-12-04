<%-- 
    Document   : documentupdate
    Created on : Nov 27, 2023, 7:25:06 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta content="width=device-width, initial-scale=1.0" name="viewport" />

        <title>User-Dashboard</title>
        <meta content="" name="description" />
        <meta content="" name="keywords" />

        <!-- Favicons -->
        <link href="assets/img/logo.png" rel="icon" />
        <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon" />

        <!-- Google Fonts -->
        <link href="https://fonts.gstatic.com" rel="preconnect" />
        <link
            href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
            rel="stylesheet"
            />

        <!-- Vendor CSS Files -->
        <link
            href="assets/vendor/bootstrap/css/bootstrap.min.css"
            rel="stylesheet"
            />
        <link
            href="assets/vendor/bootstrap-icons/bootstrap-icons.css"
            rel="stylesheet"
            />

        <!-- Template Main CSS File -->
        <link href="assets/css/style.css" rel="stylesheet" />


        <!-- fafa icons -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">

    </head>



    <!-- responsive link -->

    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">
    <!-- form link -->


    <!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> -->



    <!-- css code -->
    <style>
        .box-custom {
            background-color: white;
            height: 150px;
            width: 120px;
            text-align: center;
            padding: 17px;
            margin-left: 15px;
        }

    </style>

    <body>
        <!-- ======= Header ======= -->
        <%@include file="navbar2.jsp" %>
        <!-- End Sidebar-->


        <main id="main" class="main">
            <div class="pagetitle">
                <h1>Dashboard</h1>
                <nav>
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="index.html">Home</a></li>
                        <li class="breadcrumb-item active">Dashboard</li>
                    </ol>
                </nav>
            </div>
            <!-- End Page Title -->


    

<!-- E-governance -->
<section class="section dashboard my-3 ml-3">
  <div class="container border p-20 " >
    <h4 class="text-center my-3 mb-4">Details Update</h4>
<fieldset>   
<form class="row g-3 border mb-5">
  <h4 class="my-3 mb-4">Identity Details</h4>
    <div class="col-md-6">
      <label for="inputEmail4" class="form-label">Name</label>
      <input onkeyup="namevalidate()" id="name" type="email" class="form-control" id="inputEmail4">
      <span id="udisplay" style="color:red; font-size: 14px;">*</span>
    </div>
    <div class="col-md-6">
      <label for="inputPassword4" class="form-label">Father Name</label>
      <input onkeyup="Fvalidate()" id="Fname" type="password" class="form-control" id="inputPassword4">
      <span id="fdisplay" style="color:red; font-size: 14px;">*</span>
    </div>
    <!-- <div class="col-md-4">
        <label for="inputPassword4" class="form-label">Mother Name</label>
        <input type="password" class="form-control" id="inputPassword4">
      </div> -->
    
    <div class="col-md-4">
      <label for="inputAddress2" class="form-label">  Gender</label><br>
           <input type="radio" name="radio">Male
           <input type="radio" name="radio">Female  
           <input type="radio" name="radio">Other
    </div>
    <div class=" col-md-4">
      <label for="inputAddress" class="form-label">Dateof Birth</label>
      <input type="date" class="form-control" id="inputAddress" placeholder="1234 Main St">
    </div>
    <div class="col-md-4">
      <label for="inputState" class="form-label">Marital-Status</label>
      <select id="inputState" class="form-select">
        <option selected>Choose...</option>
        <option>Single</option>
        <option>Married</option>
        <option>Divorced</option>
        <option>Widowed</option>
      </select>
      </div>

      <div class="col-md-6">
        <label for="inputCity" class="form-label">Aadhar.no</label>
        <input onkeyup="aadharvalidate()" id="firsta" type="text" class="form-control" id="inputCity">
        <span id="adisplay" style="color:red; font-size: 14px;">*</span>
</div>

<div class="col-md-6 mb-3">
<label for="inputCity" class="form-label">Confirm Aadhar Number</label>
<input  onkeyup="aadharvalidate()" id="seconda" type="text" class="form-control" id="inputCity">
 <span id="adisplay2" style="color:red; font-size: 14px;">*</span>
</div>
<div class="col-md-6">
  <label for="inputCity" class="form-label">Pan Number</label>
  <input  onkeyup="panvalidate()" id="firstpan" type="text" class="form-control" id="inputCity">
  <span id="pdisplay" style="color:red; font-size: 14px;"></span>
</div>

<div class="col-md-6 mb-3">
<label for="inputCity" class="form-label">Confirm Pan Number</label>
<input onkeyup="panvalidate()" id="secondpan" type="text" class="form-control" id="inputCity">
 <span id="pdisplay2" style="color:red; font-size: 14px;"></span>
</div>

</form>
</fieldset> 

<form class="row g-3 border mb-5">
  <h4 class="my-3 mb-4">Address Details</h4>
      <div class="col-md-6">
        <label for="inputCity" class="form-label">Street HomeNumber</label>
        <input onkeyup="homevalidate()" id="amount" type="text" class="form-control" id="inputCity">
        <span id="displayhome" style="color:red; font-size: 14px;">*</span>
        </div>
        
            <div class="col-md-6">
                <label for="inputCity" class="form-label">City </label>
                <input type="text" class="form-control" id="inputCity">
              
            
        </div>
            <!-- <--  <div class="col-md-4">
                <label for="inputCity" class="form-label">City</label>
                <input type="text" class="form-control" id="inputCity">
              
         -->
     
    <div class="col-md-6">
      <label for="inputState" class="form-label">State</label>
      <select id="inputState" class="form-select">
        <option selected>Choose...</option>
        <option>...</option>
      </select>
    </div>
     <div class="col-md-6">
        <label for="inputState" class="form-label">Country</label>
        <select id="inputState" class="form-select">
          <option selected>Choose...</option>
          <option>...</option>
        </select>
      </div>
      <div class="col-md-4">
        <label for="inputCity" class="form-label">Mobile Number</label>
        <input  onkeyup="Movalidate()" id="mobile" maxlength="10" type="text" class="form-control" id="inputCity">
        <span id="mdisplay" style="color:red; font-size: 14px;">*</span>
      </div>
      <div class="col-md-4">
          <label for="inputCity" class="form-label">Email-id</label>
          <input onkeyup="validateEmail()" id="email" type="text" class="form-control" id="inputCity">
          <span id="edisplay" style="color:red; font-size: 14px;">*</span>
          
        </div>

<div class="col-md-4">
<label for="inputCity" class="form-label">Ocupation</label>
<input type="text" class="form-control" id="inputCity">

</div>


<div class="col-md-6">
<label for="inputCity" class="form-label">Nominee name</label>
<input onkeyup="namevalidatenominee()" id="nomineename" type="text" class="form-control" id="inputCity">
<span id="ndisplay" style="color:red; font-size: 14px;">*</span>

</div>
<div class="col-md-6 ">
  <label for="inputCity" class="form-label">Nominee Address</label>
  <input type="text" class="form-control" id="inputCity">
  
  </div>
<div class="col-md-6">
<label for="inputCity" class="form-label">Nominee Aadhar no.</label>
<input type="text" class="form-control" id="inputCity">

</div>
<div class="col-md-6 mb-3">
<label for="inputCity" class="form-label">Confirm Nominee Aadhar no.</label>
<input type="text" class="form-control" id="inputCity">

</div>
 
  </form>
  <form class="row g-3 border mb-5">
    <h4 class="my-3 mb-4"> Permanent Address Details</h4>
        <div class="col-md-6">
          <label for="inputCity" class="form-label">Street HomeNumber</label>
          <input onkeyup="phomevalidate()" id="amount" type="text" class="form-control" id="inputCity">
          <span id="displayhome2" style="color:red; font-size: 14px;">*</span>
          </div>
          
              <div class="col-md-6">
                  <label for="inputCity" class="form-label">City </label>
                  <input type="text" class="form-control" id="inputCity">
                
              
          </div>
              <!-- <--  <div class="col-md-4">
                  <label for="inputCity" class="form-label">City</label>
                  <input type="text" class="form-control" id="inputCity">
                
           -->
       
      <div class="col-md-6">
        <label for="inputState" class="form-label">State</label>
        <select id="inputState" class="form-select">
          <option selected>Choose...</option>
          <option>...</option>
        </select>
      </div>
       <div class="col-md-6 mb-3">
          <label for="inputState" class="form-label">Country</label>
          <select id="inputState" class="form-select">
            <option selected>Choose...</option>
            <option>...</option>
          </select>
        </div>
        
    </form>
    <div class="text-center mb-3">
      <button
        class="btn btn-danger waves-effect waves-light"
        id="btn-submit"
      >
        Submit
      </button>
    </div>
</div>
</section>
  <!-- shhshend -->

        </main>
        <!-- End #main -->

        <!-- ======= Footer ======= -->
        <%@include file="footer.jsp" %>
        <!-- End Footer -->

        <a
            href="#"
            class="back-to-top d-flex align-items-center justify-content-center"
            ><i class="bi bi-arrow-up-short"></i
            ></a>

        <!-- Vendor JS Files -->
        <script src="assets/vendor/apexcharts/apexcharts.min.js"></script>
        <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="assets/vendor/chart.js/chart.umd.js"></script>
        <script src="assets/vendor/echarts/echarts.min.js"></script>
        <script src="assets/vendor/quill/quill.min.js"></script>
        <script src="assets/vendor/simple-datatables/simple-datatables.js"></script>
        <script src="assets/vendor/tinymce/tinymce.min.js"></script>
        <script src="assets/vendor/php-email-form/validate.js"></script>

        <!-- Template Main JS File -->
        <script src="assets/js/main.js"></script>
        
         <script>
      function validate(){}
          function namevalidate()
          {
              var name= document.getElementById("name");
              var udisplay = document.getElementById("udisplay");
              if(name.value.trim()==""){
                  udisplay.innerHTML="Name Required";
                  udisplay.style.color="red";
                  return false;
              }
              else{
                  var reg =/^[A-Z a-z]+$/;
                  if(reg.test(name.value)){
                      udisplay.innerHTML="";
                      udisplay.style.color="Green";   
                      return true;
                  }
                  else{
                     udisplay.innerHTML="Only letters are allowed";
                     udisplay.style.color="red";
                      return false;
                  }
              }
          }
  function Fvalidate()
          {
              var Fname= document.getElementById("Fname");
              var fdisplay = document.getElementById("fdisplay");
              if(Fname.value.trim()==""){
                  fdisplay.innerHTML="FatherName Required";
                  fdisplay.style.color="red";
                  return false;
              }
              else{
                  var reg =/^[A-Z a-z]+$/;
                  if(reg.test(Fname.value)){
                      fdisplay.innerHTML="";
                      fdisplay.style.color="green";   
                      return true;
                  }
                  else{
                     fdisplay.innerHTML="Only letters are allowed";
                     fdisplay.style.color="red";
                      return false;
                  }
              }
          }
  function namevalidatenominee()
          {
              var name= document.getElementById("nomineename");
              var udisplay = document.getElementById("ndisplay");
              if(name.value.trim()==""){
                  udisplay.innerHTML="Name Required";
                  udisplay.style.color="red";
                  return false;
              }
              else{
                  var reg =/^[A-Z a-z]+$/;
                  if(reg.test(name.value)){
                      udisplay.innerHTML="";
                      udisplay.style.color="Green";   
                      return true;
                  }
                  else{
                     udisplay.innerHTML="Only letters are allowed";
                     udisplay.style.color="red";
                      return false;
                  }
              }
          }

  function Movalidate()
          {
              var mobile= document.getElementById("mobile");
              var mdisplay = document.getElementById("mdisplay");
              if(mobile.value.trim()==""){
                  mdisplay.innerHTML="Mobile Number Required";
                  mdisplay.style.color="red";
                  return false;
              }
              else{
                  var reg =/^[6789][0-9]{9}/;
                  if(reg.test(mobile.value)){
                      mdisplay.innerHTML="Valid";
                      mdisplay.style.color="Green";   
                      return true;
                  }
                  else{
                     mdisplay.innerHTML="Number should start with 6, 7, 8, or 9 and have 10 digits";
                     mdisplay.style.color="red";
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
            var firstInput = document.getElementById("firsta");
            var secondInput = document.getElementById("seconda");
            var display = document.getElementById("adisplay");
            var display2 = document.getElementById("adisplay2");

            // Check if either input is empty
            if (firstInput.value.trim() === "") {
                display.innerHTML = "Aadhar Number is required";
                display.style.color = "red";
                return false;
            }

            // Check if the first input contains only numbers
            var reg = /^\d{12}$/; 
            if (!reg.test(firstInput.value)) {
                display.innerHTML = "Please Enter Valid 12 digits Aadhar Number";
                display.style.color = "red";
                return false;
            }
            else {
                // Clear the first field's error message if it's valid
                display.innerHTML = "";
            }

            // Check if the second input is empty
            if (secondInput.value.trim() === "") {
                display2.innerHTML = "Confirm Aadhar is required";
                display2.style.color = "red";
                return false;
            }

            // Check if both inputs contain only numbers
            if (reg.test(firstInput.value) && reg.test(secondInput.value)) {
                // Check if the values are the same
                if (firstInput.value === secondInput.value) {
                    display2.innerHTML = "Valid";
                    display2.style.color = "green";
                    return true;
                } else {
                    display2.innerHTML = "Values do not match";
                    display2.style.color = "red";
                    return false;
                }
            } else {
                display2.innerHTML = "Please Enter Valid 12 digits Aadhar Number";
                display2.style.color = "red";
                return false;
            }
        }

        function panvalidate() {
            var firstInput = document.getElementById("firstpan");
            var secondInput = document.getElementById("secondpan");
            var display = document.getElementById("pdisplay");
            var display2 = document.getElementById("pdisplay2");

            // Check if either input is empty
            if (firstInput.value.trim() === "") {
                display.innerHTML = "Pan Number is required";
                display.style.color = "red";
                return false;
            }

            // Check if the first input contains only numbers
            var reg = /^[A-Za-z]{5}\d{4}[A-Za-z]$/; // 5 characters, 4 digits, 1 character
            if (!reg.test(firstInput.value)) {
                display.innerHTML = "Please enter the valid 10 digit Pan Number AAAAA1234A";
                display.style.color = "red";
                return false;
            }
            else {
                // Clear the first field's error message if it's valid
                display.innerHTML = "";
            }

            // Check if the second input is empty
            if (secondInput.value.trim() === "") {
                display2.innerHTML = "Confirm Pan Number is required";
                display2.style.color = "red";
                return false;
            }

            // Check if both inputs contain only numbers
            if (reg.test(firstInput.value) && reg.test(secondInput.value)) {
                // Check if the values are the same
                if (firstInput.value === secondInput.value) {
                    display2.innerHTML = "Valid";
                    display2.style.color = "green";
                    return true;
                } else {
                    display2.innerHTML = "Values do not match";
                    display2.style.color = "red";
                    return false;
                }
            } else {
                display2.innerHTML = "Please enter the valid 10 digit Pan Number AAAAA1234A";
                display2.style.color = "red";
                return false;
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
    </body>
</html>
