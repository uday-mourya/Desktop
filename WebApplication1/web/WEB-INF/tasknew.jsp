<%-- 
    Document   : index
    Created on : Oct 18, 2023, 5:14:56 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    String operationType = request.getParameter("operationType");
    String result = "";

    if ("fact".equals(operationType)) {
        String numOne = request.getParameter("numOne");
        if (numOne != null && !numOne.trim().isEmpty()) {
            int n=Integer.parseInt(numOne);
            int fact=1;
            for(int i=1;i<=n;i++)
            {
                fact=fact*i;
            }
            result = "Result: " + fact;
        }
    }
    else if ("fibonaciii".equals(operationType)) {
        String num1 = request.getParameter("numOne");
        int n1 = 0, n2 = 1, n3, i, count = Integer.parseInt(num1);
            result=result+(n1 + "<br>" + n2);//printing 0 and 1    

            for (i = 2; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed    
            {
                n3 = n1 + n2;
                result=result+("<br>" + n3);
                n1 = n2;
                n2 = n3;
            }
        
    }
    else if ("square".equals(operationType)) {
        int num1 = Integer.parseInt(request.getParameter("numOne"));
        result=""+num1*num1;
        
    }
    else if ("add".equals(operationType)) {
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");

        if (num1 != null && !num1.trim().isEmpty() && num2 != null && !num2.trim().isEmpty()) {
            double number1 = Double.parseDouble(num1);
            double number2 = Double.parseDouble(num2);

            // Perform two-number operation (e.g., addition)
            result = "Addition " + (number1 + number2);
        }
    }
    else if ("sub".equals(operationType)) {
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");

        if (num1 != null && !num1.trim().isEmpty() && num2 != null && !num2.trim().isEmpty()) {
            double number1 = Double.parseDouble(num1);
            double number2 = Double.parseDouble(num2);

            // Perform two-number operation (e.g., addition)
            result = "Subtraction " + (number1 - number2);
        }
    }
    else if ("multiply".equals(operationType)) {
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");

        if (num1 != null && !num1.trim().isEmpty() && num2 != null && !num2.trim().isEmpty()) {
            double number1 = Double.parseDouble(num1);
            double number2 = Double.parseDouble(num2);

            // Perform two-number operation (e.g., addition)
            result = "Multiplication " + (number1 * number2);
        }
    }
    else if ("div".equals(operationType)) {
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");

        if (num1 != null && !num1.trim().isEmpty() && num2 != null && !num2.trim().isEmpty()) {
            double number1 = Double.parseDouble(num1);
            double number2 = Double.parseDouble(num2);

            // Perform two-number operation (e.g., addition)
            result = "Division " + (number1 / number2);
        }
    }
    else if ("mod".equals(operationType)) {
        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");

        if (num1 != null && !num1.trim().isEmpty() && num2 != null && !num2.trim().isEmpty()) {
            double number1 = Double.parseDouble(num1);
            double number2 = Double.parseDouble(num2);

            // Perform two-number operation (e.g., addition)
            result = "Modulus " + (number1 % number2);
        }
    }
%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Calculator</title>
        <style>
            <%
                String op = request.getParameter("operationType");
                try{
                if ((op.equals("null"))){ 

            %>
            #ddd{
                display:block;
                width:400px;
            }
            <%
                }
                else{
            %>
            #ddd{
                display:none;
                width:400px;
            }
            <%
                }
            }
            catch(Exception ex){

}
            %>
            #big{
                background: #444654;
                color: #fff;
                margin: auto;
                padding: 20px;
                border-radius: 20px;
                width:400px;
                position:relative;
            }

            button, input {
                padding: 10px;
                margin: 5px;
                font-size: 16px;
                cursor: pointer;
                border: 1px solid #ccc;
                background-color: #fff;
                border-radius: 5px;
            }
            body{
                display: flex;
                align-items: center;
            }
           
        </style>
    </head>
    <body>

        <div id="big">
            
            <%
             String op1 = request.getParameter("operationType");
            try{
            if(op1.equals("twoNumber"))
            {
            
            %>
            <center>
                <h2 style="background:black;border-radius: 50rem; padding: 10px;">Calculator</h2>
            </center>
            <%
        }
                }
                catch(Exception e){
                
                }
        %>

            <form action="index.jsp">
                <div id="ddd">
                    <button type="submit" name="operationType" value="oneNumber">One Number Operation</button>
                    <button type="submit" name="operationType" value="twoNumber">Calculator</button>
                </div>
                <button type="submit" name="operationType" value="null">Back</button>
            </form>
            <%
                String aaa = request.getParameter("operationType");
                if(aaa!=null){
            
                    if(aaa.equals("oneNumber")){
                 
            %>
            <form action="index.jsp">
                <div>
                    <input type="text" name="numOne" placeholder="Enter a number"><br>
                    <button type="submit" name="operationType" value="fact">Factorial</button>
                    <button type="submit" name="operationType" value="square">Square</button>
                    <button type="submit" name="operationType" value="fibonaciii">Fibonacii</button>
                </div>
            </form>
            <%
                }
                else if(aaa.equals("twoNumber")){
        
            %>
            <form action="index.jsp">
                <div>
                    <input type="text" name="num1" placeholder="Enter number 1">
                    <input type="text" name="num2" placeholder="Enter number 2"><br>
                    <button type="submit" name="operationType" value="add">Add</button>
                    <button type="submit" name="operationType" value="sub">Subtract</button>
                    <button type="submit" name="operationType" value="multiply">Multiply</button>
                    <button type="submit" name="operationType" value="div">Division</button>
                    <button type="submit" name="operationType" value="mod">Modulus</button>
                </div>
            </form>
            <%
                }
    }
            %>

            <div id="result" style="margin-left: 10px;padding: 20px;"><h1><%= result %></h1></div>


        </div>

    </body>
</html>