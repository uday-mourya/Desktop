<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.util.logging.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page language="java" %>
<%@ page import="jakarta.servlet.*, jakarta.servlet.http.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>View Students</title>
</head>
<body>
    <%
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/server", "root", "udaysql@350");
            String sql = "select * from reginfo";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
    %>
    <br>
        <table cellspacing="0" cellpadding="5" width="300" border="1" align="left">
            <tr>
                <td>UserId</td>
                <td>Name</td>
                <td>Fname</td>
                <td>Email</td>
                <td>Password</td>
                <td>Contact</td>
                <td>Edit</td>
                <td>Delete</td>
            </tr>
            <%
                while (rs.next()) {
            %>
            <tr>
                <td><%= rs.getString("UserId") %></td>
                <td><%= rs.getString("name") %></td>
                <td><%= rs.getString("fname") %></td>
                <td><%= rs.getString("email") %></td>
                <td><%= rs.getString("password") %></td>
                <td><%= rs.getString("contact") %></td>
                <td><a href='Editor?UserId=<%= rs.getString("UserId") %>'>Edit</a></td>
                <td><a href='Delete?UserId=<%= rs.getString("UserId") %>'>Delete</a></td>
            </tr>
            <%
                }
                con.close();
            %>
        </table>
    <%
        } catch (ClassNotFoundException ex) {
            Logger.getLogger("ViewStudent").log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            out.println("Failed to retrieve data");
            Logger.getLogger("ViewStudent").log(Level.SEVERE, null, ex);
        }
    %>
</body>
</html>
