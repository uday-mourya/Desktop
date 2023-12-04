<%-- 
    Document   : AccountOpen
    Created on : 30-Nov-2023, 12:09:47 pm
    Author     : Sohan_Maali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Document</title>
        <!-- <link rel="stylesheet" href="AccountCss.css" /> -->
        <!-- ------------------CDN---------------- -->
        <link
            href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
            rel="stylesheet"
            id="bootstrap-css"
            />
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!-- ------------------CDN---------------- -->
        <!-- --------------------font-awesome---------------------- -->
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
            integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw=="
            crossorigin="anonymous"
            referrerpolicy="no-referrer"
            />
        <!-- --------------------font-awesome---------------------- -->

        <style>
            .note {
                text-align: center;
                height: 40px;
                background-color: whitesmoke;
                font-weight: bold;
                color: black;
            }
            .form-content {
/*                padding: 5%;*/
                border: 1px solid #ced4da;
                margin-bottom: 2%;
            }
            .form-control {
                border-radius: 1.5rem;
            }
            .btnSubmit {
                border: none;
                border-radius: 1.5rem;
                padding: 1%;
                width: 20%;
                cursor: pointer;
                background: #0062cc;
                color: #fff;
            }
            body {
                font-family: Arial, sans-serif;
                background-color: #f4f4f4;
            }

            .container.register-form {
                background-color: #fff;
                border-radius: 5px;
                padding: 20px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            }

            .form-group {
                margin-bottom: 20px;
            }

            .form-control {
                width: 100%;
                padding: 10px;
                border: 1px solid #ccc;
                border-radius: 3px;
                font-size: 16px;
            }

            .error {
                color: red;
            }

            .btnSubmit {
                background-color: #007bff;
                color: #fff;
                padding: 10px 20px;
                border: none;
                border-radius: 3px;
                font-size: 18px;
                cursor: pointer;
            }
            #OtpSend {
                font-family: cursive;
                margin-top: 30px;
            }

            .btnSubmit:hover {
                background-color: #0056b3;
            }
        </style>
    </head>
    <body>
        <div class="note">
            <p>Form P-13</p>
        </div>
        <div class="container register-form">
            <div class="form">
                <div class="note">

                    <p>Persnol Datail</p>
                </div>
                <form action="../CustomerAccountOpen" method="post">
                    <div class="form-content">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <span>First Name *</span>
                                    <input
                                        type="text"
                                        class="form-control"
                                        placeholder="Your First Name"
                                        id="firstName"
                                        value="" name="firstName"
                                        />
                                    <span class="error" id="firstNameError"></span>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <span>Last Name *</span>
                                    <input
                                        type="text"
                                        class="form-control"
                                        placeholder="Your Last Name"
                                        id="lastName"
                                        value="" name="lastName"
                                        />
                                    <span class="error" id="lastNameError"></span>
                                </div>
                            </div>
                        </div>

                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <span>Father Name *</span>
                                    <input
                                        type="text"
                                        class="form-control"
                                        placeholder="Your Father Name"
                                        id="firstName"
                                        name="fatherName"
                                        value=""
                                        />
                                    <span class="error" id="firstNameError"></span>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <span>Mother Name *</span>
                                    <input
                                        type="text"
                                        class="form-control"
                                        placeholder="Your Mother Name"
                                        id="lastName"
                                        name="motherName"
                                        value=""
                                        />
                                    <span class="error" id="lastNameError"></span>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <span>Date of Birth * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>

                                    <input type="date" id="dob"   name="dob" />

                                    <span class="error" id="DobError"></span>

                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <span>Gender * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>

                                    <input type="radio" id="male" name="gender" value="male" />
                                    <label for="male"
                                           >Male &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label
                                    >

                                    <input type="radio" id="female" name="gender" value="female" />
                                    <label for="female"
                                           >Female &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label
                                    >

                                    <input type="radio" id="other" name="gender" value="other" />
                                    <label for="other"
                                           >Other &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label
                                    >

                                    <span class="error" id="genderError"></span>
                                </div>
                            </div>

                            <div class="col-md-6">
                                <div class="form-group">
                                    <span>Uplod Photo * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>

                                    <input type="file" name="image" />

                                    <span class="error" id="FileError"></span>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <span>Occupation *</span>
                                    <select class="form-control" id="state" name="occupation">
                                        <option value="">Select Occupation</option>
                                        <option value="state1">Occupation 1</option>
                                        <option value="state2">Occupation 2</option>
                                        <!-- Add more state options here -->
                                    </select>
                                    <span class="error" id="stateError"></span>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <span>Maritail Status *</span>
                                    <select class="form-control" id="city" name="maritailStatus">
                                        <option value="">Select Maritail</option>
                                        <option value="city1">Maritail 1</option>
                                        <option value="city2">Maritail 2</option>
                                        <!-- Add more city options here -->
                                    </select>
                                    <span class="error" id="cityError"></span>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <span>Mobile Number *</span>
                                    <input
                                        type="text"
                                        class="form-control"
                                        placeholder="Phone Number"
                                        id="phoneNumber"
                                        value=""
                                        name="mobile"
                                        />
                                    <span class="error" id="phoneError"></span>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <span>Confirm Mobile Number *</span>
                                    <input
                                        type="text"
                                        class="form-control"
                                        placeholder="Phone Number"
                                        id="phoneNumber"
                                        value=""
                                        />
                                    <span class="error" id="phoneError"></span>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <span>Gmail *</span>
                                    <input
                                        type="text"
                                        class="form-control"
                                        placeholder="Gmail "
                                        id="phoneNumber"
                                        value=""
                                        name="gmail"
                                        />
                                    <span class="error" id="phoneError"></span>
                                </div>
                            </div>

                            <div class="col-md-6">
                                <div class="form-group">
                                    <span>Confirm Gmail *</span>
                                    <input
                                        type="text"
                                        class="form-control"
                                        placeholder="Gmail"
                                        id="phoneNumber"
                                        value=""
                                        />
                                    <span class="error" id="phoneError"></span>
                                </div>
                            </div>
                        </div>
                        <br /><br />
                        <div class="note">
                            <p>Document Datail</p>
                        </div>
                        <br /><br />
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <span>Aadhar Number *</span>
                                    <input
                                        type="text"
                                        class="form-control"
                                        placeholder="Aadhar Number"
                                        id="phoneNumber"
                                        value=""
                                        name="adhar"
                                        />
                                    <span class="error" id="phoneError"></span>
                                </div>
                            </div>

                            <div class="col-md-6">
                                <div class="form-group">
                                    <span>Confirm Aadhar Number *</span>
                                    <input
                                        type="text"
                                        class="form-control"
                                        placeholder="Aadhar Number"
                                        id="phoneNumber"
                                        value=""
                                        />
                                    <span class="error" id="phoneError"></span>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <span>Pan Number *</span>
                                    <input
                                        type="text"
                                        class="form-control"
                                        placeholder="Pan Number"
                                        id="phoneNumber"
                                        value=""
                                        name="pan"
                                        />
                                    <span class="error" id="phoneError"></span>
                                </div>
                            </div>

                            <div class="col-md-6">
                                <div class="form-group">
                                    <span>Confirm Pan Number *</span>
                                    <input
                                        type="text"
                                        class="form-control"
                                        placeholder="Pan Number"
                                        id="phoneNumber"
                                        value=""
                                        />
                                    <span class="error" id="phoneError"></span>
                                </div>
                            </div>
                        </div>

                        <br /><br />
                        <div class="note">
                            <p>Address Datail</p>
                        </div>
                        <br /><br />
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <span>Address *</span>
                                    <input
                                        type="text"
                                        class="form-control"
                                        placeholder="Street"
                                        id="phoneNumber"
                                        value=""
                                        name="address"
                                        />
                                    <span class="error" id="phoneError"></span>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <span>State *</span>
                                    <input
                                        type="text"
                                        class="form-control"
                                        placeholder="State"
                                        id="phoneNumber"
                                        value=""
                                        name="state"
                                        />

                                    <span class="error" id="stateError"></span>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <span>Distric *</span>
                                    <input
                                        type="text"
                                        class="form-control"
                                        placeholder="Distric"
                                        id="phoneNumber"
                                        value=""
                                        name="distric"
                                        />

                                    <span class="error" id="cityError"></span>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <span>City *</span>
                                    <input
                                        type="text"
                                        class="form-control"
                                        placeholder="City"
                                        id="phoneNumber"
                                        value=""
                                        name="city"
                                        />

                                    <span class="error" id="stateError"></span>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <span>Zip *</span>
                                    <input
                                        type="text"
                                        class="form-control"
                                        placeholder="Zip"
                                        id="phoneNumber"
                                        value=""
                                        name="pincode"
                                        />

                                    <span class="error" id="cityError"></span>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <span>Your Password *</span>
                                    <input
                                        type="password"
                                        class="form-control"
                                        placeholder="Your Password "
                                        id="password"
                                        value=""
                                        name="password"
                                        />
                                    <span class="error" id="passwordError"></span>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <span>Confirm Password *</span>
                                    <input
                                        type="password"
                                        class="form-control"
                                        placeholder="Confirm Password "
                                        id="confirmPassword"
                                        value=""
                                        />
                                    <span class="error" id="confirmPasswordError"></span>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <span>Fill OTP *</span>
                                    <input
                                        type="text"
                                        class="form-control"
                                        placeholder="Enter OTP "
                                        id="confirmotp"
                                        value=""
                                        name="mailotp"
                                        />
                                    <span class="error" id="confirmPasswordError"></span>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <button type="button" class="btn btn-primary" id="OtpSend">
                                    Send Otp
                                </button>
                            </div>
                        </div>
                        <!--                        <button type="button" class="btn btn-primary" id="submit">
                                                    Submit
                                                </button>-->
                        <input type="submit" value="Submit" class="btn btn-primary" id="submit" >
                    </div>
                </form>
            </div>
        </div>
        
        <script>

        </script>
    </body>
</html>
