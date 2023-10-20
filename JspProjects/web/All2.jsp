<%-- 
    Document   : All2
    Created on : Oct 20, 2023, 9:12:09 PM
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
        <h1>Uday-Mourya</h1>
        <button id="pow1" onclick="powerf()">Power</button>
        <button id="fact" onclick="factf()">Factorial</button>
        <div id="power" style="display: none">
            <input type="text" name="n1">
            <input type="text" name="n2">
            <input type="submit" value="Power" name="op">
        </div>
        <div id="fact" style="display: none">
            <input type="text" name="n1">
            <input type="submit" value="Fact" name="op">
        </div>

        <script>
            function powerf(){
                document.getElementById('power').style.display = "inline";
                document.getElementById('fact').style.display = "none";
            }
            function factf(){
                document.getElementById('fact').style.display = "inline";
                document.getElementById('power').style.display = "none";
            }
        </script>    
    </body>
</html>
