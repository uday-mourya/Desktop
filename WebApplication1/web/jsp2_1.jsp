<%-- 
    Document   : jsp2.jsp
    Created on : Oct 15, 2023, 10:33:30 PM
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
            int w=2;
            if(w==1){
            
            %>
            <h3>Sunday</h3>
           <% }  %>
             <%
            if(w==2){
            %>
            <h3>Monday</h3>
           <% }  %>
             <%
            if(w==3){
            %>
            <h3>Tuesday</h3>
           <% }  %>
             <%
            if(w==4){
            %>
            <h3>Thursday</h3>
           <% }  %>
             <%
            if(w==5){
            %>
            <h3>Friday</h3>
           <% }  %>
             <%
            if(w==6){
            %>
            <h3>Saturday</h3>
           <% } else{ %>
           <h3>Invalid No</h3>
           <% } %>
    </body>
</html>
