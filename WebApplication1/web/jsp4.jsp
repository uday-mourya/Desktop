<%-- 
    Document   : jsp4.jsp
    Created on : Oct 15, 2023, 10:44:44 AM
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
        <%int age=20; %>
        <% if(age <= 0){%>
        <h2>"Invalid age ...</h2>
        <%} %>
        <% if(age >= 18){%>
        <h2>This is person valid for vote </h2>
        <%}else{%>
        <h2>This is person not valid for vote</h2>
        <%} %>
    </body>
</html>
