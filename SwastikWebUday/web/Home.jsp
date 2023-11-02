<%-- 
    Document   : Home
    Created on : Oct 31, 2023, 9:06:14 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="Home.css">
        <title>Responsive Sidebar with Selection List</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                margin: 0;
                padding: 0;
            }

            .container {
                display: flex;
            }

            .sidebar {
                background-color: #333;
                color: white;
                height: 100vh;
                width: 250px;
                padding-top: 60px;
                text-align: center;
            }

            .menu-toggle {
                font-size: 24px;
                cursor: pointer;
                padding: 20px;
                display: none;
            }

            .menu {
                /* padding: 10px; */
                text-align: center;
                /* background-color: black; */
            }

            .menu select {
                width: 100%;
                padding: 10px;
                font-size: 16px;
                margin-top: 10px;
                background-color:#333;
                color: aliceblue;
            }

            .content {
                flex: 1;
                padding: 20px;
            }

            @media (max-width: 768px) {
                .menu {
                    display: none;
                }

                .menu-toggle {
                    display: block;
                }

                .menu-toggle.active {
                    background-color: #444;
                }

                .sidebar.active {
                    width: 100px;
                }
            }
        </style>
    </head>

    <body>
        <div class="container">
            <div class="sidebar">
                <div class="menu-toggle" id="menu-toggle">
                    ☰ Menu
                </div>
                <div class="menu" id="menu">
                    <!-- <label for="options">Select an Option:</label> -->
                    <select id="options">
                        <option value="option1">My DashBoard</option>
                        <!-- <option value="option2">Option 2</option>
                        <option value="option3">Option 3</option> -->
                    </select>
                </div>
                <div class="menu" id="menu">
                    <!-- <label for="options">Select an Option:</label> -->
                    <select id="options">
                        <option value="option1"><a>All Services</a></option>
                        <option value="option2"><a>Option 2</a></option>
                        <option value="option3"><a>Option 3</a></option>
                    </select>
                </div>
                <div class="menu" id="menu">
                    <!-- <label for="options">Select an Option:</label> -->
                    <select id="options">
                        <option value="option1"><a>Customer Profile</a></option>
                        <option value="option2"><a>Option 2</a></option>
                        <option value="option3"><a>Option 3</a></option>
                    </select>
                </div>
                <div class="menu" id="menu">
                    <!-- <label for="options">Select an Option:</label> -->
                    <select id="options">
                        <option value="option1"><a>Reports</a></option>
                        <option value="option2"><a>Customer Transaction</a></option>
                        <option value="option3"><a>Daily Ledger</a></option>
                        <option value="option3"><a>EMI Report</a></option>
                        <option value="option3"><a>Civil Records</a></option>
                    </select>
                </div>
                <div class="menu" id="menu">
                    <!-- <label for="options">Select an Option:</label> -->
                    <select id="options">
                        <option value="option1"><a>Track Request</a></option>
                        <!-- <option value="option2"><a>Option 2</a></option>
                        <option value="option3"><a>Option 3</a></option> -->
                    </select>
                </div>
                <div class="menu" id="menu">
                    <!-- <label for="options">Select an Option:</label> -->
                    <select id="options">
                        <option value="option1"><a>CDM</a></option>
                        <!-- <option value="option2">Option 2</option>
                        <option value="option3">Option 3</option> -->
                    </select>
                </div>
                <div class="menu" id="menu">
                    <!-- <label for="options">Select an Option:</label> -->
                    <select id="options">
                        <option value="option1">Customer account Block</option>
                        <!-- <option value="option2">Option 2</option>
                        <option value="option3">Option 3</option> -->
                    </select>
                </div> 
                <div class="menu" id="menu">
                    <!-- <label for="options">Select an Option:</label> -->
                    <select id="options">
                        <option value="option1">Support</option>
                        <option value="option2">Option 2</option>
                        <option value="option3">Option 3</option>
                    </select>
                </div>
                <div class="menu" id="menu">
                    <!-- <label for="options">Select an Option:</label> -->
                    <select id="options">
                        <option value="option1">EKYC</option>
                        <option value="option2">Option 2</option>
                        <option value="option3">Option 3</option>
                    </select>
                </div>

                <div class="menu" id="menu">
                    <!-- <label for="options">Select an Option:</label> -->
                    <select id="options">
                        <option value="option1">Update Request</option>
                        <option value="option2">Option 2</option>
                        <option value="option3">Option 3</option>
                    </select>
                </div>


            </div>
            <!-- <div class="content">
                <h2>Main Content Goes Here</h2>
            </div> -->
        </div>

        <script src="script.js"></script>
    </body>

</html>
