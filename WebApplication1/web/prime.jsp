<%-- 
    Document   : prime.jsp
    Created on : Oct 16, 2023, 10:10:50 AM
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
            int n=153;
            int c=0;
            for(int i=1;i<=n;i++){
                if(n%i==0)
                    c++;
            }
        %>
        <%if(c==2){%>
        <h1>Number is Prime<h1>
                <%}else{%>
                <h1>Number is not Prime</h1>
                <%}%>
    </body>
</html>
