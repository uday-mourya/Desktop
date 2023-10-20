<%-- 
    Document   : Task11.jsp
    Created on : Oct 19, 2023, 6:21:26 AM
    Author     : dell
--%>

<%-- Factorial and Power Calculation JSP --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Factorial and Power Calculator</title>
    <script>
        function toggleFactorial() {
            var factorialButton = document.getElementById("factorialButton");
            var numberInput = document.getElementById("numberInput");

            factorialButton.disabled = !factorialButton.disabled;
            numberInput.disabled = !numberInput.disabled;
        }

        function togglePower() {
            var powerButton = document.getElementById("powerButton");
            powerButton.disabled = !powerButton.disabled;
        }
    </script>
</head>
<body>
    <h2>Factorial and Power Calculator</h2>

    <form method="post" action="">
        <label for="numberInput">Enter a number:</label>
        <input type="number" id="numberInput" name="number" required>
        <br>

        <button type="button" id="factorialButton" onclick="calculateFactorial()">Calculate Factorial</button>
        <button type="button" id="powerButton" onclick="calculatePower()">Calculate Power</button>

        <p id="result"></p>
    </form>

    <script>
        function calculateFactorial() {
            var number = parseInt(document.getElementById("numberInput").value);
            if (!isNaN(number)) {
                var result = 1;
                for (var i = 2; i <= number; i++) {
                    result *= i;
                }
                document.getElementById("result").innerHTML = "Factorial: " + result;
            }
        }

        function calculatePower() {
            var number = parseInt(document.getElementById("numberInput").value);
            if (!isNaN(number)) {
                var power = Math.pow(number, 2); // You can change 2 to the desired power.
                document.getElementById("result").innerHTML = "Power: " + power;
            }
        }
    </script>
</body>
</html>

