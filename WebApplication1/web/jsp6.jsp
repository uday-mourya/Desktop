<%-- 
    Document   : jsp6.jsp
    Created on : Oct 16, 2023, 11:00:28 AM
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
            int year=2024;
            if(year%4==0&&year%100!=0||year%400==0){
        %>
        <h2>Year is Leap</h2>
        <%}else{%>
        <h2>Year is not Leap</h2>
        <%}%>
    </body>
</html>
