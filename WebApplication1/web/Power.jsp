<%-- 
    Document   : Power.jsp
    Created on : Oct 15, 2023, 11:39:21 AM
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
            int i=1,power=1,a=2,b=5;
                for(i=1;i<=b;i++)
                {
                    power=power*a;
                }
        %>
        <h4>
            <%= "Power:"+power %>
        </h4>
    </body>
</html>
