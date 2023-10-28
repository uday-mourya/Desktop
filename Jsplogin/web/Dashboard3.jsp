<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.io.*,java.util.*" %>

<%
try {
    // Establish a database connection (assuming you have a JDBC connection URL)
    String jdbcUrl = "jdbc:mysql://localhost:3306/server";
    String dbUser = "root";
    String dbPassword = "udaysql@350";
    Connection conn = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);

    // Create a SQL query
    String sqlQuery = "SELECT * FROM reginfo";
    Statement stmt = conn.createStatement();

    // Execute the query and obtain a ResultSet
    ResultSet rs = stmt.executeQuery(sqlQuery);

    // Process the ResultSet (e.g., retrieve and display data)
    while (rs.next()) {
        String name = rs.getString("Name");

        out.println("Name: " + name);
    }

    // Close the ResultSet, Statement, and Connection
    rs.close();
    stmt.close();
    conn.close();
} catch (Exception e) {
    // Handle any exceptions here
    e.printStackTrace();
    out.println("An error occurred. Please try again later.");
}
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <div id="container">
        <div id="header">
            <center><h1>WELCOME <%= name %></h1></center>
        </div>
        <div id="nav">
            <ul>
                <li><a href="Dashboard2.jsp">Home</a></li>
                <li><a href="Dashboard2.jsp">About Us</a></li>
                <li><a href="Dashboard2.jsp">Gallery</a></li>
                <li><a href="profile.jsp">Profile</a></li>
                <li><a href="Updatepass.jsp">Update Password</a></li>
                <li><a href="Logout.jsp">Logout</a></li>
            </ul>
        </div>
    </div>
</body>
</html>
