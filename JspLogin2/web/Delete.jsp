<%-- 
    Document   : Delete
    Created on : Oct 29, 2023, 7:30:57 PM
    Author     : dell
--%>

<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.util.logging.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Servlet Delete</title>
    <script>
        function showAlert(message) {
            alert(message);
        }
    </script>
</head>
<body>
    <%
        String uid = request.getParameter("UserId");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/server", "root", "udaysql@350");
            PreparedStatement pst = con.prepareStatement("DELETE FROM reginfo WHERE UserId = ?");
            pst.setString(1, uid);
            int count = pst.executeUpdate();
            if (count > 0) {
    %>
                
                <script>
                    showAlert("RECORD DELETED SUCCESSFULLY"); // Call JavaScript function on successful deletion
                </script>
    <%
            } else {
    %>
                <p>Not deleted successfully</p>
    <%
            }
        } catch (ClassNotFoundException | SQLException ex) {
            out.println("An error occurred: " + ex.getMessage());
        }
    %>
</body>
</html>
