<%-- 
    Document   : Task
    Created on : Oct 18, 2023, 9:10:26 PM
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
        <form action="">
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
        </form>
    </body>
    <%!
            double a = 0.0;
   double b = 0.0;
           String email = request.getParameter("email");
           String pass = request.getParameter("pass");
           a = Double.parseDouble(A);
       b = Double.parseDouble(B);
       double c = a + b;
       
    %>
    <%=
        out.print("Result = " + c);
    %>
</body>
</html>
