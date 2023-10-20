<%-- 
    Document   : Taskkk
    Created on : Oct 19, 2023, 7:28:18?AM
    Author     : dell
--%>
<!DOCTYPE html>
<html>
<head>
    <title>Enable/Disable Input Fields</title>
</head>
<body>
<!--    <h1>Enable/Disable Input Fields</h1>
    <input type="text" id="inputField1" name="n1" placeholder="Input Field 1">
    <input type="text" id="inputField2" name="n2" placeholder="Input Field 2">
    <br>
    <button id="factButton" onclick="enableFact()">Fact</button>
    <button id="powerButton" onclick="enablePower()">Power</button>-->
    <form action="">
            <center>
                 <label for="inputField1">Enter a number:</label>
                <input type="text" id="inputField1" name="n1"></td></tr>
                <br><br>
                 <label for="inputField2">Enter a number:</label>
                <input type="text" id="inputField2" name="n2"></td></tr>
              
                <br><br>   
<!--                <button type="button"  id="factButton" onclick="enableFact()" value="fact">Factorial</button>
                <button type="button"  id="powerButton" onclick="enablePower()" value="fact">Power</button>  -->


                    <td><input type="submit" id="factButton" onclick="enableFact()" value="fact"></td>
                    <td><input type="submit"  id="powerButton" onclick="enablePower()" value="power"></td>
                    
       
<!--                    <td><input type="submit" value="Add"></td>
                    <td><input type="submit" value="Add"></td>
                    <td><input type="submit" value="Add"></td>-->
                
            </center>
        </form>
    <script>
        function enableFact() {
            // Enable Input Field 1 and disable Input Field 2
            
            
            document.getElementById('inputField1').disabled = false;
            document.getElementById('inputField2').disabled = true;

            // Disable the Fact button and enable the Power button
            document.getElementById('factButton').disabled = false;
            document.getElementById('powerButton').disabled = true;
   %>
        }

        function enablePower() {
            // Enable both input fields
            document.getElementById('inputField1').disabled = false;
            document.getElementById('inputField2').disabled = false;

            // Disable the Power button and enable the Fact button
            document.getElementById('factButton').disabled = true;
            document.getElementById('powerButton').disabled = false;
        }
    </script>
</body>

</html>