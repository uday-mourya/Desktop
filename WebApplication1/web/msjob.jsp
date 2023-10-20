<%-- 
    Document   : msjob
    Created on : Oct 19, 2023, 11:33:47 AM
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
          <h1>Simple Calculator</h1>
    
    <form method="post">
        Enter Number 1: <input type="text" id="inputField1" name="num1"><br>
        Enter Number 2: <input type="text" id="inputField2" name="num2"><br>
      
        <input type="radio" name="operation" value="add"> Add
        <input type="radio" name="operation" value="subtract"> Subtract
        <input type="radio" name="operation" value="multiply"> Multiply
        <input type="radio" name="operation" value="divide"> Divide
        <input type="radio" name="operation" value="power"> Power
        <input type="radio" name="operation" value="Fact"> Fact
        <input type="submit" value="Calculate">
    </form>
    
    <%
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        String operation = request.getParameter("operation");
        
        double num1 = 0.0;
        double num2 = 0.0;
        double result = 0.0;
        
        if (num1Str != null && !num1Str.isEmpty()) {
            num1 = Double.parseDouble(num1Str);
        }
        
        if (num2Str != null && !num2Str.isEmpty()) {
            num2 = Double.parseDouble(num2Str);
        }
        
        if (operation != null) {
            if (operation.equals("add")) {
                result = num1 + num2;
            } else if (operation.equals("subtract")) {
                result = num1 - num2;
            } else if (operation.equals("multiply")) {
                result = num1 * num2;
            } else if (operation.equals("divide") && num2 != 0) {
                result = num1 / num2;
            }
            else if (operation.equals("power")){
                 result = Math.pow(num1, num2);
        }
        else if(operation.equals("Fact")){
          if (num1 >= 0 && num1 == (int)num1) {
                int factorial = 1;
                for (int i = 1; i <= (int)num1; i++) {
                    factorial *= i;
                }
                result = factorial;
            }
        }
        }
    %>
    <p>Result: <%= result %></p>
   
    </body>
</html>
