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
    <style>
        .container{
            height:400px;
            width: 600px;
            background-color:lightseagreen;
            border: 3px solid lawngreen;
            margin-top:20px;
            margin-left:300px;
            border-radius: 10px;
        }
        button{
            margin-left: 20px;
            height:30px;
            width:120px;
            margin-top: 20px;
            background-color: black;
            color:dodgerblue;
            border-radius: 10px;
        }
    </style> 
    <body>
    <center> <h1>Uday- Mourya</h1></center>
    <div class="container">
        <button onclick="factorial()" id="Fact" value="Factorial">Factorial</button>
        <button onclick="power()" id="Power" value="Power">Power</button>
        <button onclick="tab1()"  id="Table" value="tab">Table</button>
        <button onclick="square1()" id="Square" value="square">Square</button>
        <button onclick="cube1()" id="Cube" value="square">Cube</button>
        <button onclick="leapyear()" id="LeapYear" value="LeapYear">LeapYear</button>
        <button onclick="checkEvenOdd()" id="CheckEvenOdd" value="CheckEvenOdd">CheckEvenOdd</button>
        <button onclick="voting()" id="Voting" value="Voting">Voting</button>
        <button onclick="reverse()" id="Reverse" value="Reverse">Reverse</button>
        <button onclick="primeNumber()" id="Primenumber" value="PrimeNumber">PrimeNumber</button>
        <button onclick="pattern()" id="Pattern11" value="Pattern11">PAttern1</button>
        <button onclick="pattern2()" id="Pattern12" value="Pattern12">PAttern2</button>
        <button onclick="pattern3()" id="Pattern13" value="Pattern13">PAttern3</button>
        <button onclick="pattern4()" id="Pattern14" value="Pattern14">PAttern4</button>
        <button onclick="pattern5()" id="Pattern15" value="Pattern15">PAttern5</button>
        <button onclick="pattern6()" id="Pattern16" value="Pattern16">PAttern5</button>
        <button onclick="pattern7()" id="Pattern17" value="Pattern17">PAttern7</button>
        <button onclick="pattern8()" id="Pattern18" value="Pattern18">PAttern8</button>
        <button onclick="pattern9()" id="Pattern19" value="Pattern19">PAttern9</button>
         <button onclick="check()" id="Check" value="PrimeNumber">Check99-+</button>
         <button onclick="average()" id="Average" value="PrimeNumber">ThreeAverage</button>

    </div>

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
    <div id="LeapYear1" style="display: none">
        <form action="">
            <input type="text" id="valuen1" name="n1"/>
            <!-- <input type="text" id="valuen2" name="second" /> -->
            <input type="submit" value="LeapYear" name="operation" />
        </form>
    </div>
    <div id="CheckEvenOdd1" style="display: none">
        <form action="">
            <input type="text" id="valuen1" name="n1" />
            <!-- <input type="text" id="valuen2" name="second" /> -->
            <input type="submit" value="checkEvenOdd" name="operation" />
        </form>
    </div>
    <div id="Voting1" style="display: none">
        <form action="">
            <input type="text" id="valuen1" name="n1" />
            <!-- <input type="text" id="valuen2" name="second" /> -->
            <input type="submit" value="voting" name="operation" />
        </form> 
    </div>
    <div id="Reverse1" style="display: none">
        <form action="">
            <input type="text" id="valuen1" name="n1" />
            <!-- <input type="text" id="valuen2" name="second" /> -->
            <input type="submit" value="reverse" name="operation" />
        </form>
    </div>    
    <div id="PrimeNumber1" style="display: none">
        <form action="">
            <input type="text" id="valuen1" name="n1" />
            <!--                <input type="text" id="valuen2" name="second" />-->
            <input type="submit" value="primeNumber" name="operation" />
        </form>
    </div>

    <div id="Pattern1" style="display: none">
        <form action="">
            <input type="text" id="valuen1" name="n1" />
            <!-- <input type="text" id="valuen2" name="second" /> -->
            <input type="submit" value="Pattern" name="operation" />
        </form>
    </div>

    <div id="Pattern2" style="display: none">
        <form action="">
            <input type="text" id="valuen1" name="n1" />
            <!-- <input type="text" id="valuen2" name="second" /> -->
            <input type="submit" value="Pattern2" name="operation" />
        </form>
    </div>
    <div id="Pattern3" style="display: none">
        <form action="">
            <input type="text" id="valuen1" name="n1" />
            <!-- <input type="text" id="valuen2" name="second" /> -->
            <input type="submit" value="Pattern3" name="operation" />
        </form>
    </div>
    <div id="Pattern4" style="display: none">
        <form action="">
            <input type="text" id="valuen1" name="n1" />
            <!-- <input type="text" id="valuen2" name="second" /> -->
            <input type="submit" value="Pattern4" name="operation" />
        </form>
    </div>
    <div id="Pattern5" style="display: none">
        <form action="">
            <input type="text" id="valuen1" name="n1" />
            <!-- <input type="text" id="valuen2" name="second" /> -->
            <input type="submit" value="Pattern5" name="operation" />
        </form>
    </div>
    <div id="Pattern6" style="display: none">
        <form action="">
            <input type="text" id="valuen1" name="n1" />
            <!-- <input type="text" id="valuen2" name="second" /> -->
            <input type="submit" value="Pattern6" name="operation" />
        </form>
    </div>
    <div id="Pattern7" style="display: none">
        <form action="">
            <input type="text" id="valuen1" name="n1" />
            <!-- <input type="text" id="valuen2" name="second" /> -->
            <input type="submit" value="Pattern7" name="operation" />
        </form>
    </div>
    <div id="Pattern8" style="display: none">
        <form action="">
            <input type="text" id="valuen1" name="n1" />
            <!-- <input type="text" id="valuen2" name="second" /> -->
            <input type="submit" value="Pattern8" name="operation" />
        </form>
    </div>
    <div id="Pattern9" style="display: none">
        <form action="">
            <input type="text" id="valuen1" name="n1" />
            <!-- <input type="text" id="valuen2" name="second" /> -->
            <input type="submit" value="Pattern9" name="operation" />
        </form>
    </div>
    <div id="check1" style="display: none">
        <form action="">
            <input type="text" id="valuen1" name="n1" />
            <!-- <input type="text" id="valuen2" name="second" /> -->
            <input type="submit" value="Check" name="operation" />
        </form>
    </div>
     <div id="average1" style="display: none">
        <form action="">
            <input type="text" id="valuen1" name="n1" />
            <input type="text" id="valuen2" name="n2" />
             <input type="text" id="valuen2" name="n3" />
            <input type="submit" value="average" name="operation" />
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

        function leapyear() {

            document.getElementById('LeapYear1').style.display = "inline";
            document.getElementById('power').style.display = "none";
            document.getElementById('fact').style.display = "none";
            document.getElementById('table').style.display = "none";
            document.getElementById('square').style.display = "none";
            document.getElementById('cube').style.display = "none";
        }
        function checkEvenOdd() {

            document.getElementById('CheckEvenOdd1').style.display = "inline";
            document.getElementById('power').style.display = "none";
            document.getElementById('fact').style.display = "none";
            document.getElementById('table').style.display = "none";
            document.getElementById('square').style.display = "none";
            document.getElementById('cube').style.display = "none";
            document.getElementById('LeapYear1').style.display = "none";
        }
        function voting() {

            document.getElementById('Voting1').style.display = "inline";
            document.getElementById('power').style.display = "none";
            document.getElementById('fact').style.display = "none";
            document.getElementById('table').style.display = "none";
            document.getElementById('square').style.display = "none";
            document.getElementById('cube').style.display = "none";
            document.getElementById('LeapYear1').style.display = "none";
            document.getElementById('CheckEvenOdd1').style.display = "none";
        }
        function reverse() {

            document.getElementById('Reverse1').style.display = "inline";
            document.getElementById('power').style.display = "none";
            document.getElementById('fact').style.display = "none";
            document.getElementById('table').style.display = "none";
            document.getElementById('square').style.display = "none";
            document.getElementById('cube').style.display = "none";
            document.getElementById('LeapYear1').style.display = "none";
            document.getElementById('CheckEvenOdd1').style.display = "none";
            document.getElementById('Voting1').style.display = "none";
        }
        function primeNumber() {

            document.getElementById('PrimeNumber1').style.display = "inline";
            document.getElementById('power').style.display = "none";
            document.getElementById('fact').style.display = "none";
            document.getElementById('table').style.display = "none";
            document.getElementById('square').style.display = "none";
            document.getElementById('cube').style.display = "none";
            document.getElementById('LeapYear1').style.display = "none";
            document.getElementById('CheckEvenOdd1').style.display = "none";
            document.getElementById('Voting1').style.display = "none";
            document.getElementById('Reverse1').style.display = "none";
        }
        function pattern() {

            document.getElementById('Pattern1').style.display = "inline";
            document.getElementById('power').style.display = "none";
            document.getElementById('fact').style.display = "none";
            document.getElementById('table').style.display = "none";
            document.getElementById('square').style.display = "none";
            document.getElementById('cube').style.display = "none";
            document.getElementById('LeapYear1').style.display = "none";
            document.getElementById('CheckEvenOdd1').style.display = "none";
            document.getElementById('Voting1').style.display = "none";
            document.getElementById('Reverse1').style.display = "none";
            document.getElementById('PrimeNumber1').style.display = "none";
        }
        function pattern2() {

            document.getElementById('Pattern2').style.display = "inline";
            document.getElementById('power').style.display = "none";
            document.getElementById('fact').style.display = "none";
            document.getElementById('table').style.display = "none";
            document.getElementById('square').style.display = "none";
            document.getElementById('cube').style.display = "none";
            document.getElementById('LeapYear1').style.display = "none";
            document.getElementById('CheckEvenOdd1').style.display = "none";
            document.getElementById('Voting1').style.display = "none";
            document.getElementById('Reverse1').style.display = "none";
            document.getElementById('PrimeNumber1').style.display = "none";
            document.getElementById('Pattern1').style.display = "none";
        }
        function pattern3() {

            document.getElementById('Pattern3').style.display = "inline";
            document.getElementById('power').style.display = "none";
            document.getElementById('fact').style.display = "none";
            document.getElementById('table').style.display = "none";
            document.getElementById('square').style.display = "none";
            document.getElementById('cube').style.display = "none";
            document.getElementById('LeapYear1').style.display = "none";
            document.getElementById('CheckEvenOdd1').style.display = "none";
            document.getElementById('Voting1').style.display = "none";
            document.getElementById('Reverse1').style.display = "none";
            document.getElementById('PrimeNumber1').style.display = "none";
            document.getElementById('Pattern1').style.display = "none";
            document.getElementById('Pattern2').style.display = "none";
        }
        function pattern3() {

            document.getElementById('Pattern3').style.display = "inline";
            document.getElementById('power').style.display = "none";
            document.getElementById('fact').style.display = "none";
            document.getElementById('table').style.display = "none";
            document.getElementById('square').style.display = "none";
            document.getElementById('cube').style.display = "none";
            document.getElementById('LeapYear1').style.display = "none";
            document.getElementById('CheckEvenOdd1').style.display = "none";
            document.getElementById('Voting1').style.display = "none";
            document.getElementById('Reverse1').style.display = "none";
            document.getElementById('PrimeNumber1').style.display = "none";
            document.getElementById('Pattern1').style.display = "none";
            document.getElementById('Pattern2').style.display = "none";
        }
        function pattern4() {

            document.getElementById('Pattern4').style.display = "inline";
            document.getElementById('power').style.display = "none";
            document.getElementById('fact').style.display = "none";
            document.getElementById('table').style.display = "none";
            document.getElementById('square').style.display = "none";
            document.getElementById('cube').style.display = "none";
            document.getElementById('LeapYear1').style.display = "none";
            document.getElementById('CheckEvenOdd1').style.display = "none";
            document.getElementById('Voting1').style.display = "none";
            document.getElementById('Reverse1').style.display = "none";
            document.getElementById('PrimeNumber1').style.display = "none";
            document.getElementById('Pattern1').style.display = "none";
            document.getElementById('Pattern2').style.display = "none";
            document.getElementById('Pattern3').style.display = "none";
        }

        function pattern5() {

            document.getElementById('Pattern5').style.display = "inline";
            document.getElementById('power').style.display = "none";
            document.getElementById('fact').style.display = "none";
            document.getElementById('table').style.display = "none";
            document.getElementById('square').style.display = "none";
            document.getElementById('cube').style.display = "none";
            document.getElementById('LeapYear1').style.display = "none";
            document.getElementById('CheckEvenOdd1').style.display = "none";
            document.getElementById('Voting1').style.display = "none";
            document.getElementById('Reverse1').style.display = "none";
            document.getElementById('PrimeNumber1').style.display = "none";
            document.getElementById('Pattern1').style.display = "none";
            document.getElementById('Pattern2').style.display = "none";
            document.getElementById('Pattern3').style.display = "none";
            document.getElementById('Pattern4').style.display = "none";
        }
        function pattern6() {

            document.getElementById('Pattern6').style.display = "inline";
            document.getElementById('power').style.display = "none";
            document.getElementById('fact').style.display = "none";
            document.getElementById('table').style.display = "none";
            document.getElementById('square').style.display = "none";
            document.getElementById('cube').style.display = "none";
            document.getElementById('LeapYear1').style.display = "none";
            document.getElementById('CheckEvenOdd1').style.display = "none";
            document.getElementById('Voting1').style.display = "none";
            document.getElementById('Reverse1').style.display = "none";
            document.getElementById('PrimeNumber1').style.display = "none";
            document.getElementById('Pattern1').style.display = "none";
            document.getElementById('Pattern2').style.display = "none";
            document.getElementById('Pattern3').style.display = "none";
            document.getElementById('Pattern4').style.display = "none";
            document.getElementById('Pattern5').style.display = "none";
        }
        function pattern7() {

            document.getElementById('Pattern7').style.display = "inline";
            document.getElementById('power').style.display = "none";
            document.getElementById('fact').style.display = "none";
            document.getElementById('table').style.display = "none";
            document.getElementById('square').style.display = "none";
            document.getElementById('cube').style.display = "none";
            document.getElementById('LeapYear1').style.display = "none";
            document.getElementById('CheckEvenOdd1').style.display = "none";
            document.getElementById('Voting1').style.display = "none";
            document.getElementById('Reverse1').style.display = "none";
            document.getElementById('PrimeNumber1').style.display = "none";
            document.getElementById('Pattern1').style.display = "none";
            document.getElementById('Pattern2').style.display = "none";
            document.getElementById('Pattern3').style.display = "none";
            document.getElementById('Pattern4').style.display = "none";
            document.getElementById('Pattern5').style.display = "none";
            document.getElementById('Pattern6').style.display = "none";
        }
         function pattern8() {

            document.getElementById('Pattern8').style.display = "inline";
            document.getElementById('power').style.display = "none";
            document.getElementById('fact').style.display = "none";
            document.getElementById('table').style.display = "none";
            document.getElementById('square').style.display = "none";
            document.getElementById('cube').style.display = "none";
            document.getElementById('LeapYear1').style.display = "none";
            document.getElementById('CheckEvenOdd1').style.display = "none";
            document.getElementById('Voting1').style.display = "none";
            document.getElementById('Reverse1').style.display = "none";
            document.getElementById('PrimeNumber1').style.display = "none";
            document.getElementById('Pattern1').style.display = "none";
            document.getElementById('Pattern2').style.display = "none";
            document.getElementById('Pattern3').style.display = "none";
            document.getElementById('Pattern4').style.display = "none";
            document.getElementById('Pattern5').style.display = "none";
            document.getElementById('Pattern6').style.display = "none";
            document.getElementById('Pattern7').style.display = "none";
        }
        
         function pattern9() {

            document.getElementById('Pattern9').style.display = "inline";
            document.getElementById('power').style.display = "none";
            document.getElementById('fact').style.display = "none";
            document.getElementById('table').style.display = "none";
            document.getElementById('square').style.display = "none";
            document.getElementById('cube').style.display = "none";
            document.getElementById('LeapYear1').style.display = "none";
            document.getElementById('CheckEvenOdd1').style.display = "none";
            document.getElementById('Voting1').style.display = "none";
            document.getElementById('Reverse1').style.display = "none";
            document.getElementById('PrimeNumber1').style.display = "none";
            document.getElementById('Pattern1').style.display = "none";
            document.getElementById('Pattern2').style.display = "none";
            document.getElementById('Pattern3').style.display = "none";
            document.getElementById('Pattern4').style.display = "none";
            document.getElementById('Pattern5').style.display = "none";
            document.getElementById('Pattern6').style.display = "none";
            document.getElementById('Pattern7').style.display = "none";
             document.getElementById('Pattern8').style.display = "none";
        }
        function check() {

            document.getElementById('check1').style.display = "inline";
            document.getElementById('power').style.display = "none";
            document.getElementById('fact').style.display = "none";
            document.getElementById('table').style.display = "none";
            document.getElementById('square').style.display = "none";
            document.getElementById('cube').style.display = "none";
            document.getElementById('LeapYear1').style.display = "none";
            document.getElementById('CheckEvenOdd1').style.display = "none";
            document.getElementById('Voting1').style.display = "none";
            document.getElementById('Reverse1').style.display = "none";
            document.getElementById('PrimeNumber1').style.display = "none";
            document.getElementById('Pattern1').style.display = "none";
            document.getElementById('Pattern2').style.display = "none";
            document.getElementById('Pattern3').style.display = "none";
            document.getElementById('Pattern4').style.display = "none";
            document.getElementById('Pattern5').style.display = "none";
            document.getElementById('Pattern6').style.display = "none";
            document.getElementById('Pattern7').style.display = "none";
             document.getElementById('Pattern8').style.display = "none";
             document.getElementById('Pattern9').style.display = "none";
        }
        function average() {

            document.getElementById('average1').style.display = "inline";
            document.getElementById('power').style.display = "none";
            document.getElementById('fact').style.display = "none";
            document.getElementById('table').style.display = "none";
            document.getElementById('square').style.display = "none";
            document.getElementById('cube').style.display = "none";
            document.getElementById('LeapYear1').style.display = "none";
            document.getElementById('CheckEvenOdd1').style.display = "none";
            document.getElementById('Voting1').style.display = "none";
            document.getElementById('Reverse1').style.display = "none";
            document.getElementById('PrimeNumber1').style.display = "none";
            document.getElementById('Pattern1').style.display = "none";
            document.getElementById('Pattern2').style.display = "none";
            document.getElementById('Pattern3').style.display = "none";
            document.getElementById('Pattern4').style.display = "none";
            document.getElementById('Pattern5').style.display = "none";
            document.getElementById('Pattern6').style.display = "none";
            document.getElementById('Pattern7').style.display = "none";
             document.getElementById('Pattern8').style.display = "none";
             document.getElementById('Pattern9').style.display = "none";
             document.getElementById('check1').style.display = "none";
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
       String num3Str = request.getParameter("n2");
       String operation = request.getParameter("operation");
        
       int num1 = 0;
       int num2 = 0;
       int num3 = 0;
       int result = 0;
        
       if (num1Str != null && !num1Str.isEmpty()) {
           num1 = Integer.parseInt(num1Str);
       }
        
       if (num2Str != null && !num2Str.isEmpty()) {
           num2 = Integer.parseInt(num2Str);
       }
       if (num3Str != null && !num3Str.isEmpty()) {
           num3 = Integer.parseInt(num3Str);
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
             else if(operation.equals("LeapYear")){ 
           if((num1%100!=0&&num1%4==0)||num1%400==0){
               out.print("Leap Year"); 
           } else{ 
               out.print("Normal Year");
           }
       }
          else if(operation.equals("checkEvenOdd")){ 
           if(num1%2==0){ 
                out.print("Even Number");
            } else{ 
                out.print("Odd Number");
            }
       }
       else if(operation.equals("voting")){ 
           if(num1<=18){ 
                out.print("Not eligible for voting"); 
            } else{ 
                out.print(" eligible for voting");
            } 
       }
       else if(operation.equals("reverse")){ 
           int res =0;
            while(num1>0){ 
                res =(res*10)+(num1%10); 
                num1/=10; 
            }
            out.println("Result ="+res); 
       }
       else if(operation.equals("primeNumber")){ 
           int res =0;
            for(int i=1;i<=num1;i++){ 
                if(num1%i==0){ 
                    res++;
                } 
            }
            if(res ==2){   
                out.println("prime number"); 
             }else{ 
                out.println("not a prime number"); 
            } 
            
        }    
        else if(operation.equals("Pattern")){ 
          for(int i=1;i<=num1;i++){
                for(int j=1;j<=i;j++){
                    out.print("* "); 
                } 
                out.print("<br>"); 
            }
    }  
    else if(operation.equals("Pattern2")){ 
          for(int i=num1;i>=1;i--){
                for(int j=1;j<=i;j++){
                    out.print("* "); 
                } 
                out.print("<br>"); 
            }
    } 
     else if(operation.equals("Pattern3")){ 
          for(int i=num1;i>=1;i--){
                for(int j=1;j<=i;j++){
                    out.print(i); 
                } 
                out.print("<br>"); 
            }
    } 
    else if(operation.equals("Pattern4")){ 
          for(int i=num1;i>=1;i--){
                for(int j=1;j<=i;j++){
                    out.print(j+"&nbsp;"); 
                } 
                out.print("<br>"); 
            }
    } 
    else if(operation.equals("Pattern5")){ 
          for(int i=1;i<=num1;i++){
                for(int j=1;j<=i;j++){
                    out.print(i+"&nbsp;&nbsp;"); 
                } 
                out.print("<br>"); 
            }
    } 
    else if(operation.equals("Pattern6")){ 
          for(int i=1;i<=num1;i++){
                for(int j=1;j<=i;j++){
                    out.print(j+"&nbsp;&nbsp;"); 
                } 
                out.print("<br>"); 
            }
    }
    else if(operation.equals("Pattern7")){ 
          for(int i=1;i<=num1;i++){
                for(int j=1;j<=num1;j++){
                    out.print("#&nbsp;&nbsp"); 
                } 
                out.print("<br>"); 
            }
    }
    else if(operation.equals("Pattern8")){ 
          for(int i=1;i<=num1;i++){
                for(int j=1;j<=num1;j++){
                    out.print(i+"&nbsp;&nbsp"); 
                } 
                out.print("<br>"); 
            }
    }
     else if(operation.equals("Pattern9")){ 
          for(int i=1;i<=num1;i++){
                for(int j=1;j<=num1;j++){
                    out.print(j+"&nbsp;&nbsp"); 
                } 
                out.print("<br>"); 
            }
    }
     else if(operation.equals("Check")){ 
           if((num1<0)){
               out.print("Negative Number"); 
           } else{ 
               out.print("Positive Number");
           }
       }
       else if(operation.equals("average")){ 
           int res=(num1+num2+num3)/3;
           out.println("Average="+res);
       }
    }        
%>

