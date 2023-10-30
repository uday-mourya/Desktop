<%-- 
    Document   : Editor
    Created on : Oct 29, 2023, 7:20:03 PM
    Author     : dell
--%>

<%-- 
    Document   : Editor
    Created on : Oct 29, 2023, 7:20:03 PM
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
        <title>Servlet Editor</title>
    </head>
    <script>
        function showAlert(message) {
            alert(message);
        }
    </script>
    <body>
        <%
            if (request.getMethod().equals("POST")) {
                String userId = request.getParameter("userid");
                String name = request.getParameter("name");
                String fname = request.getParameter("fname");
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                String contact = request.getParameter("contact");

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/server", "root", "udaysql@350");
                    PreparedStatement pst = con.prepareStatement("UPDATE reginfo SET Name = ?, Fname = ?, Email = ?, Password = ?, Contact = ? WHERE UserId = ?");
                    pst.setString(1, name);
                    pst.setString(2, fname);
                    pst.setString(3, email);
                    pst.setString(4, password);
                    pst.setString(5, contact);
                    pst.setString(6, userId);

                    int rowsUpdated = pst.executeUpdate();

                    if (rowsUpdated > 0) {
        %>
        <!--                    <div>User details updated successfully.</div>-->
        <script>
            showAlert("User details updated successfully."); // Call JavaScript function on successful deletion
        </script>

        <%
                    } else {
        %>
        <div>Failed to update user details.</div>
        <%
                    }
                } catch (ClassNotFoundException | SQLException ex) {
                    out.println("An error occurred: " + ex.getMessage());
                    ex.printStackTrace();
                }
            } else {
                String uid = request.getParameter("UserId");
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/server", "root", "udaysql@350");
                    PreparedStatement pst = con.prepareStatement("SELECT * FROM reginfo WHERE UserId = ?");
                    pst.setString(1, uid);
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
        %>
        <form method='POST'>
            <table>
                <tr><td>UserId</td><td><input type='text' name='userid' id='userid' value='<%= rs.getString("UserId") %>' readonly/></td></tr>
                <tr><td>Name</td><td><input type='text' name='name' id='name' value='<%= rs.getString("Name") %>'/></td></tr>
                <tr><td>Fname</td><td><input type='text' name='fname' id='fname' value='<%= rs.getString("Fname") %>'/></td></tr>
                <tr><td>Email</td><td><input type='text' name='email' id='email' value='<%= rs.getString("Email") %>'/></td></tr>
                <tr><td>Password</td><td><input type='text' name='password' id='password' value='<%= rs.getString("Password") %>'/></td></tr>
                <tr><td>Contact</td><td><input type='text' name='contact' id='contact' value='<%= rs.getString("Contact") %>'/></td></tr>
                <tr><td colspan='2'><input type='submit' value='Edit'/></td></tr>
            </table>
        </form>
        <%
                    }
                } catch (ClassNotFoundException | SQLException ex) {
                    out.println("An error occurred: " + ex.getMessage());
                    ex.printStackTrace();
                }
            }
        %>
    </body>
</html>
