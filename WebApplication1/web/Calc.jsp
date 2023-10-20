<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dynamic Calculator</title>
    <script>
        function toggleFields() {
            var operation = document.getElementById("operation").value;
            var num2Field = document.getElementById("num2Field");
            var num1Label = document.getElementById("num1Label");

            if (operation === "factorial") {
                num2Field.style.display = "none";
                num1Label.textContent = "Enter Number:";
            } else if (operation === "power") {
                num2Field.style.display = "block";
                num1Label.textContent = "Base Number:";
            }
        }
    </script>
</head>
<body>
    <h1>Dynamic Calculator</h1>
    
    <form action="calculator.jsp" method="post">
        Enter Number 1: <input type="text" name="num1" id="num1"><br>
        <div id="num2Field" style="display: none;">
            Enter Number 2: <input type="text" name="num2">
        </div>
        <label id="num1Label">Enter Number:</label>
        Select Operation:
        <select name="operation" id="operation" onchange="toggleFields()">
            <option value="add">Add</option>
            <option value="subtract">Subtract</option>
            <option value="multiply">Multiply</option>
            <option value="divide">Divide</option>
            <option value="power">Power</option>
            <option value="factorial">Factorial</option>
        </select><br>
        <input type="submit" value="Calculate">
    </form>
    
    <%
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        String operation = request.getParameter("operation");
        
        if (num1Str != null) {
            try {
                double num1 = Double.parseDouble(num1Str);
                double num2 = 0.0;
                double result = 0.0;
                
                if (operation.equals("add")) {
                    // Addition calculation
                } else if (operation.equals("subtract")) {
                    // Subtraction calculation
                } else if (operation.equals("multiply")) {
                    // Multiplication calculation
                } else if (operation.equals("divide")) {
                    // Division calculation
                } else if (operation.equals("power")) {
                    num2 = Double.parseDouble(num2Str);
                    // Power calculation
                } else if (operation.equals("factorial")) {
                    // Factorial calculation
                }
    %>
                <p>Result: <%= result %></p>
    <%
            } catch (NumberFormatException e) {
    %>
                <p>Please enter valid numbers.</p>
    <%
            }
        }
    %>
</body>
</html>
