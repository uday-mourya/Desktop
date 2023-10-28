<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>JSP Page</title>
    </head>
    <body>
        <button id="button1" onclick="changeButtonName(1)">Factorial</button>
        <button id="button2" onclick="changeButtonName(2)">Fibonacci</button>
        <button id="button3" onclick="changeButtonName(3)">Cube</button>
        <button id="button4" onclick="changeButtonName(4)">Cartoon</button>
        <button id="button5" onclick="changeButtonName(5)">Voting</button>
        <button id="button6" onclick="changeButtonName(6)">LeapYear</button>
        <button id="button7" onclick="changeButtonName(7)">CheckEvenOdd</button>
        <button id="button8" onclick="changeButtonName(8)">Reverse</button>
        <button id="button9" onclick="changeButtonName(9)">PrimeNumber</button>
        <button id="button10" onclick="changeButtonName(10)">Calculator</button>
        <br /><br /><br />
        <div id="tekeInput">
            <form action="">
                <input type="text" id="value1" name="firstValue" />
                <span id="secondInput" style="display: none;"> <input type="text" id="value2" name="secondValue" /> </span>
                <input type="submit" id="ans" name="oldName" value="ans" />
                <div id="calc" style="display: none;">
                    <input type="submit" id="ans1" name="oldName" value="ans" />
                    <input type="submit" id="ans2" name="oldName" value="ans" />
                    <input type="submit" id="ans3" name="oldName" value="ans" />
                </div>
            </form>
        </div>
       
        <script>

            function changeButtonName(buttonNumber) {
                // Get the IDs of the buttons
                var button1 = document.getElementById("button1");
                var button2 = document.getElementById("button2");
                var button3 = document.getElementById("button3");
                var button4 = document.getElementById("button4");
                var button5 = document.getElementById("button5");
                var button6 = document.getElementById("button6");
                var button7 = document.getElementById("button7");
                var button8 = document.getElementById("button8");
                var button9 = document.getElementById("button9");
                var button10 = document.getElementById("button10");
                var secondInput = document.getElementById("secondInput");
                var calc = document.getElementById("calc");

                // Reset the names of all buttons
                button1.textContent = "Factorial";
                button2.textContent = "Fibonacci";
                button3.textContent = "Cube";
                button4.textContent = "Cartoon";
                button5.textContent = "Voting";
                button6.textContent = "LeapYear";
                button7.textContent = "CheckEvenOdd";
                button8.textContent = "Reverse";
                button9.textContent = "PrimeNumber";
                button10.textContent = "Calculator";

                // Change the name of the clicked button
                if (buttonNumber === 1) {
                    ans.textContent = "Factorial";
                    ans.name = "Factorial";
                    ans.value = "Factorial";
                    secondInput.style.display = "none";
                    calc.style.display = "none";
                    
                    showInput();
                } else if (buttonNumber === 2) {
                    ans.textContent = "Fibonacci";
                    ans.name = "Fibonacci";
                    ans.value = "Fibonacci";
                    showInput();
                } else if (buttonNumber === 3) {
                    ans.textContent = "Cube";
                    ans.name = "Cube";
                    ans.value = "Cube";
                    showInput();
                } else if (buttonNumber === 4) {
                    ans.textContent = "Cartoon";
                    ans.name = "Cartoon";
                    ans.value = "Cartoon";
                    showInput();
                } else if (buttonNumber === 5) {
                    ans.textContent = "Voting";
                    ans.name = "Voting";
                    ans.value = "Voting";
                    showInput();
                } else if (buttonNumber === 6) {
                    ans.textContent = "LeapYear";
                    ans.name = "LeapYear";
                    ans.value = "LeapYear";
                    showInput();
                } else if (buttonNumber === 7) {
                    ans.textContent = "CheckEvenOdd";
                    ans.name = "CheckEvenOdd";
                    ans.value = "CheckEvenOdd";
                    showInput();
                } else if (buttonNumber === 8) {
                    ans.textContent = "Reverse";
                    ans.name = "Reverse";
                    ans.value = "Reverse";
                    showInput();
                } else if (buttonNumber === 9) {
                    ans.textContent = "PrimeNumber";
                    ans.name = "PrimeNumber";
                    ans.value = "PrimeNumber";
                    showInput();
                } else if (buttonNumber === 10) {
                    ans.textContent = "Calculator";
                    ans.name = "Add";
                    ans1.name = "Sub";
                    ans2.name = "Multi";
                    ans3.name = "divi";
                    ans.value = "Add";
                    ans1.value = "Sub";
                    ans2.value = "Multi";
                    ans3.value = "divi";
                    secondInput.style.display = "inline";
                    calc.style.display = "inline";
                }
            }
            function showInput() {
                var tekeInput = document.getElementById("tekeInput");
                tekeInput.style.display = "inline";
            }
        </script>
    </body>
</html>
<% 
String s = request.getParameter("firstValue"); 
int b = 0;
if (s != null && !s.equals("")) { 
    int a = Integer.parseInt(s); 
        String s1 = request.getParameter("second"); 
        if(s1 != null && !s1.equals(""))
        {      
            b = Integer.parseInt(s1); 
        }
        
        if(request.getParameter("Cube") != null){
            int result = a*a*a;
            out.print(result);
        } else if (request.getParameter("Fibonacci") != null){ 
            int x=-1,y=1,result =0; 
            for(int i=1;i<=a;i++){ 
                result = x+y;
                x=y;
                y=result;
                out.print(result +" "); 
            }
        }else if(request.getParameter("Voting") != null){
            if(a<=18){ 
                out.print("Not eligival for voting"); 
            } else{ 
                out.print(" eligival for voting");
            } 
        } else if(request.getParameter("LeapYear") != null){ 
            if((a%100!=0&&a%4==0)||a%400==0){
                out.print("Leap Year"); 
            } else{ 
                out.print("Normal Year");
            }
        }else if(request.getParameter("CheckEvenOdd") != null){
            if(a%2==0){ 
                out.print("Even Number");
            } else{ 
                out.print("Odd Number");
            }
        }else if(request.getParameter("Reverse") != null){
            int result =0;
            while(a>0){ 
                result =(result*10)+(a%10); 
                a/=10; 
            }
            out.println(result);
        } else if(request.getParameter("PrimeNumber") != null){
            int result =0;
            for(int i=1;i<=a;i++){ 
                if(a%i==0){ 
                    result++;
                } 
            }
            if(result ==2){   
                out.println("prime number"); 
             }else{ 
                out.println("not a prime number"); 
            } 
        }else if (request.getParameter("Cartoon") != null){
            for(int i=1;i<=a;i++){
                for(int j=1;j<=i;j++){
                    out.print("* "); 
                } 
                out.print("<br>"); 
            }
        } else if (request.getParameter("factsub") != null){
            int fact =1;
            for(int i=1;i<=a;i++){
                fact*=i;
            }
            out.print(fact); 
        } else if (request.getParameter("Add") != null){
           
            out.print(a+b); 
        }else if (request.getParameter("Sub") != null){
           
            out.print(a-b); 
        } else if (request.getParameter("Multi") != null){
           
            out.print(a*b); 
        }
        else if (request.getParameter("divi") != null){
           
            out.print(a/b); 
        }
    }
%>