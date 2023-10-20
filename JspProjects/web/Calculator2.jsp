<%-- 
    Document   : Calculator22
    Created on : Oct 19, 2023, 10:43:52 AM
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
                <table border="1" cellspacing="0" height="150px" width="400px">
                    <tr>
                        <td align="center"><label>Enter First Number</label></td>
                        <td align="center"><input type="text" placeholder="Enter First Number" name="n1"></td>
                    </tr>
                    <tr>
                        <td align="center"><label>Enter First Number</label></td>
                        <td align="center"><input type="text"  placeholder="Enter Second Number" name="n2"></td></tr>
                    <tr>
                        <td colspan="2" align="center">
                            <input type="radio" value="Add" name="operation">Add
                            <input type="radio" value="substract" name="operation">Substract
                            <input type="radio" value="division" name="operation">Divide
                            <input type="radio" value="multiply" name="operation">Multiply
                            <input type="radio" value="modulus" name="operation">Modulus
<!--                            <input type="submit" value="Calculate">-->
                        </td>
                    </tr>
                    <tr>
                        <td  colspan="2" align="center">
                             <input type="submit" value="Calculate">
                              <input type="reset" value="reset">
                        </td>
                    </tr>
                </table> 
            </center>
        </form>
    </body>
    <%
 double a = 0.0;
 double b = 0.0;
 String A = request.getParameter("n1");
 String B = request.getParameter("n2");
 String operation = request.getParameter("operation");
 if (A != null && !A.isEmpty() &&B != null && !B.isEmpty()) {
     a = Double.parseDouble(A);
     b = Double.parseDouble(B);
        }
//      double c = a + b;
//      out.print("Result = " + c);
    if (operation != null) {
        if (operation.equals("Add")) 
        {
               double c = a + b;
               out.print("Result = " + c);
                   // Addition calculation
        } 
        else if (operation.equals("substract")) 
        {
                   double c = a - b;
               out.print("Result = " + c);
                   // Subtraction calculation
        } 
        else if (operation.equals("division")) 
        {
                    double c = a / b;
               out.print("Result = " + c);
                   // Multiplication calculation
        }
        else if (operation.equals("multiply")) 
        {
                   double c = a * b;
               out.print("Result = " + c);
                   // Division calculation
               } 
        else if (operation.equals("modulus")) {
                   double c = a % b;
               out.print("Result = " + c);
                   // Power calculation
               } 
       

 }
    %>
    
</html>
