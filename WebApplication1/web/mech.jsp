<%-- 
    Document   : mech
    Created on : Oct 19, 2023, 8:04:00 AM
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
        <h1>Hello World!</h1>
        <%
  double a = 0.0;
  double b = 0.0;
  String A = request.getParameter("n1");
  String B = request.getParameter("n2");
  if (A != null && !A.isEmpty() &&B != null && !B.isEmpty()) {
      a = Double.parseDouble(A);
      b = Double.parseDouble(B);
      double c = a + b;
      out.print("Result = " + c);
  }
        %>
    </body>
</html>
