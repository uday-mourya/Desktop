<%-- 
    Document   : jsp9.jsp
    Created on : Oct 15, 2023, 11:24:10 AM
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
            int a=21;
            if(a>=21 && a<=100){
         %>
         <h3>Eligable For Vote</h3>
         <% } else {%>
         <h3>Not Eligable For Vote</h3>
         <% } %>
    </body>
</html>
