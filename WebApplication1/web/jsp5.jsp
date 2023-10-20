<%-- 
    Document   : jsp5.jsp
    Created on : Oct 16, 2023, 10:53:43 AM
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
            int a=100,b=5,c=7;
            if(a>b)
            {
                if(a>c){
        %>
        <h2>A is big</h2>
        <%}else{%>
        <h2>C is big</h2>
        <%}%>
        <%}else if(b>c){%>
        <h2>B is big</h2>
        <%}else{%>
        <h2>C os big</h2>
        <%}%>
    </body>
</html>
