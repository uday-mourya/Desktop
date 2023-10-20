<%-- 
    Document   : pattern4.jsp
    Created on : Oct 15, 2023, 8:19:48 PM
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
        <%for (int i=1;i<=5;i++){%>
        <%for(int j=1;j<=i;j++){%>
        <span> # </span>
        <%}%>
        <br>
        <%}%>
    </body>
</html>
