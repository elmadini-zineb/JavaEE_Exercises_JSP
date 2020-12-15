<%-- 
    Document   : Factoriel
    Created on : 12 déc. 2020, 13:46:00
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
	<h1>Hello World!</h1>
	<h1>Calcul du	Factoriel de nombres</h1>
	<%!
	int	Factoriel[]	=	new	int[20];
	int	nombres[]	=	new	int[20];
	
	int	i;%>
	<%	for(i=0;i<20;i++){
	nombres[i]=i+1;
	}%>
	<%	Factoriel[0]=1;
	for(int	i=1;i<20;i++){
	Factoriel[i]	=i*Factoriel[i-1];
        
	}
        out.write(" <table border=2 >");
	for(int	i=0;	i<20;	i++){ 
        %>
        
        <td><%=Factoriel[i]%></td>
	<%}%>
</table>
</body>
</html>
