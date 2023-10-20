<%-- 
    Document   : jsp3.jsp
    Created on : Oct 15, 2023, 10:36:53 AM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        int age = 19;

        if (age <= 0) {
        %>
        <p>Invalid age !!!</p>
        <%
        } else {
            if (age < 13) {
        %>
        <p>Child age</p>
        <%
            } else if (age < 20) {
        %>
        <p>Teen age</p>
        <%
            } else if (age < 60) {
        %>
        <p>Young age</p>
        <%
            } else {
        %>
        <p>Old age</p>
        <%
            }
        }
        %>
    </body>
</html>
