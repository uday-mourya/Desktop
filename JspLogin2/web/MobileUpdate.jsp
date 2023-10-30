<%-- 
    Document   : MobileUpdate
    Created on : Oct 29, 2023, 11:39:11 PM
    Author     : dell
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Delete Record</title>
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
         <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
         <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
          <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
</head>
<style>
            body {
  background: #BA68C8;
}

.form-control:focus {
  box-shadow: none;
  border-color: #BA68C8;
}

.profile-button {
  background: #BA68C8;
  box-shadow: none;
  border: none;
}

.profile-button:hover {
  background: #682773;
}

.profile-button:focus {
  background: #682773;
  box-shadow: none;
}

.profile-button:active {
  background: #682773;
  box-shadow: none;
}

.back:hover {
  color: #682773;
  cursor: pointer;
}
        </style>
<body>
    <h2>Delete Record</h2>
    <form method="post">
<!--        Enter ID to delete: <input type="number" name="id" required>
        <input type="submit" value="Delete">-->
 <div class="container rounded bg-white mt-5">
        <div class="row">
        
            <div class="col-md-6">
                <div class="p-3 py-5">
                    <div class="d-flex justify-content-between align-items-center mb-3">
                        <div class="d-flex flex-row align-items-center back"><i class="fa fa-long-arrow-left mr-1 mb-1"></i>
                           <a href="Dashboard33.jsp" ><h6>Back to home</h6></a>
                        </div>
                        
                    </div>
                    <div class="row mt-2">
                        <div class="col-md-3">Enter ID </div>
                        <div class="col-md-6"><input type="text" class="form-control"  name="id" ></div>
                    </div>
                     <div class="row mt-2">
                        <div class="col-md-3">Enter New Mobile Number</div>
                        <div class="col-md-6"><input type="text" class="form-control"  name="mobile" ></div>
                    </div>
                 
<!--                    <div class="mt-5 text-right"><button class="btn btn-primary profile-button" type="button">Save Profile</button></div>-->
                    <div class="row mt-5">
                            <div class="mt-5 text-left"><input type="submit" value="Update"></div>
<!--                            <div class="col-md-4"><a  href="Updatepassword.jsp" ><h6>Update Password</h6></a></div>
                        
                          -->
                    </div>
                </div>
            </div>
        </div>
    </div>
    </form>
    <%
    String id = request.getParameter("id");
     String mobile = request.getParameter("mobile");
    if (id != null && !id.isEmpty()) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/server", "root", "udaysql@350");

            String sql ="update reginfo set Contact = ? where UserId = ?";
            PreparedStatement pst = con.prepareStatement(sql);
             pst.setString(1,mobile);
            pst.setString(2, id);

            int count = pst.executeUpdate();
            con.close();

            if (count > 0) {
    %>
                <p>Record with ID <%= id %> Mobile Number updated successfully.</p>
    <%
            } else {
    %>
                <p>Record with ID <%= id %> not found or not deleted successfully.</p>
    <%
            }
        } catch (ClassNotFoundException | SQLException ex) {
            out.println("An error occurred: " + ex.getMessage());
        }
    }
    %>
</body>
</html>

