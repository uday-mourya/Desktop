<%-- 
    Document   : Transactionhistory
    Created on : Nov 27, 2023, 7:22:44 PM
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
    <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet" />
    <link href="assets/vendor/quill/quill.snow.css" rel="stylesheet" />
    <link href="assets/vendor/quill/quill.bubble.css" rel="stylesheet" />
    <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet" />
    <link href="assets/vendor/simple-datatables/style.css" rel="stylesheet" />

    <!-- Template Main CSS File -->
    <link href="assets/css/style.css" rel="stylesheet" />

    <!-- link css -->
    <style>
      body {
        font-family: "Lato", sans-serif;
      }

      h1 {
        margin-top: 0px;
        margin-bottom: 5px;
      }

      label {
        color: #333;
      }

      .btn-send {
        font-weight: 300;
        text-transform: uppercase;
        letter-spacing: 0.2em;
        width: 100%;
        margin-left: 3px;
      }
      .help-block.with-errors {
        color: #ff5050;
        margin-top: 5px;
      }

      .card {
        margin-left: 10px;
        margin-right: 10px;
      }
    </style>
  </head>

  <body>
     <!-- ======= Header ======= -->
    <%@include file="navbar2.jsp" %>
    
    <!-- End Sidebar-->
    
    
    <main id="main" class="main">
      <div class="pagetitle">
        <nav>
          <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="index.html">Home</a></li>
            <li class="breadcrumb-item">Reports</li>
            <li class="breadcrumb-item active">Transaction History</li>
          </ol>
        </nav>
        <h4>Transaction History</h4>
      </div>
      <!-- End Page Title -->
      <div class="row p-4">
        <div class="col-md-5">
            <input type="date" class="form-control" placeholder="starting date" aria-label="Starting date">
        </div>
        <div class="col-md-5">
            <input type="date" class="form-control" placeholder="current date" aria-label="Current date">
        </div>
        <div class="col-md-2">
            <button type="button" class="btn btn-primary">Search</button>
        </div>
    </div>
    
      <section class="section">
        <table class="table table-striped table-hover border">
          <thead class="bg-light">
          <tr>
            <h4 class="text-center my-3 mb-4">Transaction History</h4>
          </tr>
            <tr>
              <th>Transaction Date</th>
              <th>Transaction ID</th>
              <th>Service</th>
              <th>Ammount</th>
              <th>Status</th>
            </tr>
            
            <tr>
              <td>13/10/2022</td>
              <td>#47747</td>
              <td>Neft/Rtgs</td>
              <td>2000 RS</td>
              <td>Done</td>
            </tr>
            <tr>
              <td>13/10/2022</td>
              <td>#47747</td>
              <td>Neft/Rtgs</td>
              <td>2000 RS</td>
              <td>Done</td>
            </tr>
            <tr>
              <td>13/10/2022</td>
              <td>#47747</td>
              <td>Neft/Rtgs</td>
              <td>2000 RS</td>
              <td>Done</td>
            </tr>
            <tr>
              <td>13/10/2022</td>
              <td>#47747</td>
              <td>Neft/Rtgs</td>
              <td>2000 RS</td>
              <td>Done</td>
            </tr>
          </thead>
        </table>
      </section>
    </main>
    <!-- End #main -->
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
  </body>
</html>
