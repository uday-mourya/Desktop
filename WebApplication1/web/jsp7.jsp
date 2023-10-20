<%-- 
    Document   : jsp7.jsp
    Created on : Oct 16, 2023, 11:10:01 AM
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
     int a = 15;
         boolean even = a%2 == 0;
        
        
        if(even){
        %>
        <h2>this is even ...</h2>

        <%}else{ %>
        <h2>this is odd ...</h2>
        <%} %>
    </body>
</html>
