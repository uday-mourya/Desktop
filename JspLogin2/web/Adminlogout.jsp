
<%-- 
    Document   : Logout
    Created on : 26-Oct-2023, 12:40:15 am
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>-->
<%
//       try (PrintWriter out = response.getWriter()) {
//            HttpSession session=request.getSession();
            session.setAttribute("email",null);
            session.invalidate();
            response.sendRedirect("Adminlogin.jsp");
            
     %>
