<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        #form{
            border: 3px solid burlywood;
            height: 300px;
            width: 300px;
        }
/*        table,tr,td,input{
                    border: 2px;
                    background-color: rosybrown;
        }*/
    </style>
    <body>
    <%
        String operation = request.getParameter("r1");
 String num = request.getParameter("num1");
 String numb = request.getParameter("num2");

 

 if(num!=null && numb!=null && num!= "" && numb!=""){
 int num1=Integer.parseInt(num);
 int num2=Integer.parseInt(numb);
 if(operation.equals("Add")){
 int add=num1+num2;
 out.println("Addition is: "+add);
 }
 
 else if(operation.equals("Sub")){

 int sub=num1-num2;
 out.println("Substraction is: "+sub);
 }
 else if(operation.equals("mul")){
 int mul=num1*num2;
 out.println("multiplication is: "+mul);
 } 
 else if(operation.equals("div"))
 {
 int div = num1/num2;
 if(num1>=num2)
 out.println("division is: "+div);
 else
 out.println("The division cannot be performed");
 }
    }
%>
 
        <center>
            <form action="" METHOD="POST" id="form">
                <br> <br>

<label for="num1"><b>Number 1</b></label>
<input type="text" name ="num1"><br><br>
<label for = "num2"><b>Number 2</b></label>
<input type="text" name="num2"><br><br>
<table>
    <tr>
        <td>
            <input type ="radio" name = "r1" value="Add">Add
        </td>
    <tr>
        <td>
            <input type = "radio" name = "r1" value="Sub">Sub<br>
        </td>
    </tr>
    <tr>
        <td>
 
            <input type="radio" name="r1" value ="mul">Multiplication
        </td>
    </tr>
    <tr>
        <td>

            <input type = "radio" name="r1" value="div">Division<br><br>
        </td>
    </tr>
    
</table>

<input type="submit" value="submit">
<input type="reset" value="clear">
</center>
</form>
 
    </body>
    
</html>  