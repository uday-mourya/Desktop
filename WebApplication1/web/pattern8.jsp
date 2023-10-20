<%-- 
    Document   : pattern8.jsp
    Created on : Oct 15, 2023, 8:36:48 PM
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
            int i,j;
                 for(i=1 ; i<=5 ; i++)
                 {
			
                    for(j=1 ; j<=(2*i) ; j++)
                        {%>
        <%=("* ")%>
        <%}%>
        <%=("<br>")%>
        <%}%>
    </body>
</html>
