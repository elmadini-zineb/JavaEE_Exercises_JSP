<%-- 
    Document   : Exercice5
    Created on : 12 déc. 2020, 14:01:51
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%	if	(Math.random()	>.5)	{	%>
		<jsp:forward	page="Fibonacci.jsp"/>
<%	}else	{	%>
                <jsp:forward	page="Factoriel.jsp"/>
<%	}	%>
				</body>
</html>
