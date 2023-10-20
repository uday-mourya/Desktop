<%-- 
    Document   : jsp8.jsp
    Created on : Oct 15, 2023, 11:16:08 AM
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
        int num = 20;

        if (num < 0) {
        %>
        <p><%= num %> is a Negative number</p>
        <%
        } else if (num == 0) {
        %>
        <p><%= num %> is Zero</p>
        <%
        } else {
        %>
        <p><%= num %> is Positive</p>
        <%
        }
        %>
    </body>
</html>
