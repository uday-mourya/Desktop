<%-- 
    Document   : pattern7.jsp
  Created on : Oct 15, 2023, 8:30:48 PM
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
            int i,j,n=5;
                for(i=1 ; i<=n ; i++)
                {
		    for(j=1 ; j<=i ; j++)
	   	    {%>
			   <%=("* ")%>
		    <%}%>
			  <%=("<br>")%>
                <%}%>
                <%
                for(i=1 ; i<=n ; i++)
                {
		    for(j=n ; j>i ; j--)
		    {%>
			   <%=("* ")%>
		    <%}%>
			<%=("<br>")%>
               <% }%>
    </body>
</html>
