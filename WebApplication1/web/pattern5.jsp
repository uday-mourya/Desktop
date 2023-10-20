<%-- 
    Document   : pattern5.jsp
    Created on : Oct 15, 2023, 10:49:05 AM
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
            int n=5;
            for(int i=1;i<=n;i++){
                 for(int j=1;j<=i;j++){
                 if(i%2==0){
        %>
        
        <span>0</span>
        <%}else{%>
         <span>1</span>
        <%}%>
        <%}%>
        
        <br>
        <%}%>
    </body>
</html>
