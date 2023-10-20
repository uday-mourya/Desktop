<%-- 
    Document   : pattern55.jsp
    Created on : Oct 16, 2023, 12:23:01 PM
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
        
        <span>1</span>
        <%}else{%>
         <span>0</span>
        <%}%>
        <%}%>
        
        <br>
        <%}%>
    </body>
</html>
