<%-- 
    Document   : jsp2.jsp
    Created on : Oct 15, 2023, 10:24:20 PM
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
        <%
            int n=100;
	       int i=1,t ;
	       while(i<=10)
               {
                    t=n*i;
        %>
        <span><%=n%>*<%=i%>=<%=t%><br></span>
         <%
              i++;
               }
         %>
    </body>
</html>
