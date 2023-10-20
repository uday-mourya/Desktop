<%-- 
    Document   : newjsp1
    Created on : Oct 12, 2023, 10:07:46 PM
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
            int a=3,b=13;
            if(a==b){
        %>
        <h1>Both are Same</h1>
        <%}else{%>
        <h4>Both Are different</h4>  
           <%}%>
<!--        <h1>Both are Same</h1>-->
    </body>
</html>
