<%-- 
    Document   : Task11
    Created on : Oct 18, 2023, 8:58:12 PM
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
        <!--        <button><a href=""><h1 style="color:red">Hello World!</h1></a></button>-->
<!--        <form action="">
            <center>
                <table border="1">
                        <tr><td><input type="text" name="n1"></td></tr>
                        <tr><td><input type="text" name="n2"></td></tr>
                <tr>
                    <td><input type="submit" value="Add" name></td>
                    <td><input type="submit" value="Add"></td>
                    <td><input type="submit" value="Add"></td>
                    <td><input type="submit" value="Add"></td>
                    <td><input type="submit" value="Add"></td>
                </tr>
            </table> 
            </center>
        </form>-->
    </body>
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
</html>
