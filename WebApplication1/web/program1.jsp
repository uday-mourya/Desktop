<%-- 
    Document   : program1
    Created on : Oct 20, 2023, 2:17:03 PM
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
        <button onclick="factorial()" value="Factorial">Factorial</button>
        <button onclick="power()" value="Power">Power</button>
        <button onclick="tab1()" value="tab">Table</button>
        <button onclick="square1()" value="square">Square</button>
        <button onclick="cube1()" value="square">Cube</button>
        
        
        <div  id="fact" style="display: none">
            <form action="">
                <input type="text" id="valuen1" name="n1" />
                <input type="submit" value="Fact" name="operation" />
            </form> 
        </div>
        <div id="power" style="display: none">
            <form action="">
                <input type="text" id="valuen1" name="n1" />
                <input type="text" id="valuen2" name="n2" />
                <input type="submit" value="Power" name="operation" />
            </form>
        </div>
        <div  id="table" style="display: none">
            <form action="">
                <input type="text" id="valuen1" name="n1" />
                <input type="submit" value="table" name="operation" />
            </form> 
        </div>
         <div  id="square" style="display: none">
            <form action="">
                <input type="text" id="valuen1" name="n1" />
                <input type="submit" value="squa" name="operation" />
            </form> 
        </div>
        <div  id="cube" style="display: none">
            <form action="">
                <input type="text" id="valuen1" name="n1" />
                <input type="submit" value="Cub" name="operation" />
            </form> 
        </div>
<script>
    function factorial() {
        document.getElementById('fact').style.display = "inline";
        document.getElementById('power').style.display = "none";
        document.getElementById('table').style.display = "none";
    }
    function power() {
        document.getElementById('power').style.display = "inline";
        document.getElementById('fact').style.display = "none";
        document.getElementById('table').style.display = "none";
    }
    function tab1() {
        document.getElementById('table').style.display = "inline";
        document.getElementById('power').style.display = "none";
        document.getElementById('fact').style.display = "none";
    }
     function square1() {
        document.getElementById('square').style.display = "inline";
        document.getElementById('power').style.display = "none";
        document.getElementById('fact').style.display = "none";
        document.getElementById('table').style.display = "none";
    }
    function cube1() {
        document.getElementById('cube').style.display = "inline";
        document.getElementById('power').style.display = "none";
        document.getElementById('fact').style.display = "none";
        document.getElementById('table').style.display = "none";
         document.getElementById('square').style.display = "none";
    }
</script>  
    </body>
</html>
 <%
// double a = 0.0;
// double b = 0.0;
// double result = 0.0;
// String A = request.getParameter("n1");
// String B = request.getParameter("n2");
// String operation = request.getParameter("operation");
// if (A != null && !A.isEmpty() || B != null && !B.isEmpty()) {
//     a = Double.parseDouble(A);
//     b = Double.parseDouble(B);
//        }
        String num1Str = request.getParameter("n1");
        String num2Str = request.getParameter("n2");
        String operation = request.getParameter("operation");
        
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        
        if (num1Str != null && !num1Str.isEmpty()) {
            num1 = Integer.parseInt(num1Str);
        }
        
        if (num2Str != null && !num2Str.isEmpty()) {
            num2 = Integer.parseInt(num2Str);
        }
    if (operation != null) {
        if (operation.equals("Power")) 
        {
              int pow =1;
            for(int i=1;i<=num2;i++){
                pow*=num1;
            } 
            out.print("power = " +pow);
                   // Addition calculation
        } 
        else if (operation.equals("Fact")){
            int fact =1;
            for(int i=1;i<=num1;i++){
                fact*=i;
            }
             out.print("Factorial = " +fact);
            }
            
            
            else if (operation.equals("table")){
            int res =1;
            for(int i=1;i<=10;i++){
                res=num1*i;
                out.print("<br>");
                out.print(num1+" X "+i+ "=" +res+"<br>");
            }
             
            }
            else if (operation.equals("squa")){
               
            int res=num1*num1;
            
             out.print("Square = "+res);
            }
             else if (operation.equals("Cub")){
               
            int res=num1*num1*num1;
            
             out.print("Cube = "+res);
            }
             
     }        
    %>

