<%-- 
    Document   : jsp1
    Created on : Oct 15, 2023, 10:18:33 PM
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
            int a=5;
            for(int i=1; i<=a; i++)
            {
                for(int j=1; j<=i; j++)
                {
        %>   
                <span>* &nbsp; &nbsp;</span>
        <%
                }
        %>
                <br><br>
        <%
            }
        %>
        <h1>Congratulations</h1> 
    </body>
</html>
