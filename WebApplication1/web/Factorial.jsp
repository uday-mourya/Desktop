<%-- 
    Document   : Factorial.jsp
    Created on : Oct 15, 2023, 11:38:55 AM
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
            int i=1,fact=1,n=5;
                for(i=1;i<=n;i++)
                {
                    fact=fact*i;
                }
        %>
        <h4>
            <%= "Factorial :"+fact %>
        </h4>
    </body>
</html>
