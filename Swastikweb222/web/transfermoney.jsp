<%-- 
    Document   : transfermoney
    Created on : Nov 27, 2023, 7:01:15 PM
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
  
    <link
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
      rel="stylesheet"
    />
  </head>

  <!-- responsive link -->

  <link
    href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css"
    rel="stylesheet"
  />
  <!-- form link -->


  <!-- <link
    rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
  /> -->

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
body{
  text-decoration: none;
}
  </style>
</head>
  <body>
   <!-- ======= Header ======= -->
   <%@include file="navbar2.jsp" %>
   <!--navbar-end-->
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
      <section class="section">
        <table class="table table-striped table-hover border">
          <thead class="bg-light">
          <tr>
            <h4 class="text-center my-3 mb-4">Transfer Money</h4>
          </tr>
            <tr>
              <th>Beneficiary Name</th>
              <th>Bank Name</th>
              <th>Account Number</th>
              <th>IFSC Code</th>
              
            </tr>
            <tr>
              
              <td>
                <div class="d-flex align-items-center">
                  <a href="transfermoney2.jsp">
                  <img
                    src="https://mdbootstrap.com/img/new/avatars/8.jpg"
                    alt=""
                    style="width: 45px; height: 45px"
                    class="rounded-circle"
                  />
                  </a>
                  <div class="ms-3">
                    <p class="fw-bold mb-1">name</p>
                    <p class="text-muted mb-0"></p>
                  </div>
                </div>
              </td>
              <td>
                <p class="fw-normal mb-1">xyz</p>
              </td>

              <td>028410102665</td>
              <td>
                SBIN0001200
              </td>
              
            </tr>

            
            <tr>
              <td>
                <div class="d-flex align-items-center">
                  <a href="transfermoney2.jsp"></a>
                  <img
                    src="https://mdbootstrap.com/img/new/avatars/8.jpg"
                    alt=""
                    style="width: 45px; height: 45px"
                    class="rounded-circle"
                  />
                </a>
                  <div class="ms-3">
                    <p class="fw-bold mb-1">name</p>
                    <p class="text-muted mb-0"></p>
                  </div>
                </div>
              </td>
              <td>
                <p class="fw-normal mb-1">xyz</p>
              </td>

              <td>028410102665</td>
              <td>
                SBIN0001200
              </td>
            </tr>
            <tr>
              <td>
                <div class="d-flex align-items-center">
                    
                  <img
                    src="https://mdbootstrap.com/img/new/avatars/8.jpg"
                    alt=""
                    style="width: 45px; height: 45px"
                    class="rounded-circle"
                  />
                  <div class="ms-3">
                    <p class="fw-bold mb-1">name</p>
                    <p class="text-muted mb-0"></p>
                  </div>
                </div>
              </td>
              <td>
                <p class="fw-normal mb-1">xyz</p>
              </td>

              <td>028410102665</td>
              <td>
                SBIN0001200
              </td>
            </tr>
            <tr>
              <td>
                <div class="d-flex align-items-center">
                  <a href="transfermoney2.jsp">
                  <img
                    src="https://mdbootstrap.com/img/new/avatars/8.jpg"
                    alt=""
                    style="width: 45px; height: 45px"
                    class="rounded-circle"
                  />
                </a>
                  <div class="ms-3">
                    <p class="fw-bold mb-1">name</p>
                    <p class="text-muted mb-0"></p>
                  </div>
                </div>
              </td>
              <td>
                <p class="fw-normal mb-1">xyz</p>
              </td>

              <td>028410102665</td>
              <td>
                SBIN0001200
              </td>
            </tr>
            <tr>
              <td>
                <div class="d-flex align-items-center">
                  <a href="transfermoney2.jsp">
                  <img
                    src="https://mdbootstrap.com/img/new/avatars/8.jpg"
                    alt=""
                    style="width: 45px; height: 45px"
                    class="rounded-circle"
                  />
                </a>
                  <div class="ms-3">
                    <p class="fw-bold mb-1">name</p>
                    <p class="text-muted mb-0"></p>
                  </div>
                </div>
              </td>
              <td>
                <p class="fw-normal mb-1">xyz</p>
              </td>

              <td>028410102665</td>
              <td>
                SBIN0001200
              </td>
            </tr>
            <tr class="mx-3">
              <td colspan="4" class="text-center">
                <a href="Addbeneficiary.jsp" class="btn btn-primary">Add Beneficiary</a>
              </td>
            </tr>
          </thead>
         
        </table>
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
  </body>
</html>
