<%-- 
    Document   : Exercice1
    Created on : 12 déc. 2020, 10:22:40
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
while  (!trouve &&  i < articlesEnInventaire.length)	   
                        {%>
							<head>
								<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
								<title>JSP Page</title>
							</head>
							<body>
						<%!	String[]a
<!DOCTYPE html>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HTML Page</title>
    </head>
    <body>

    	<HTML>
<%!	String[]articlesEnInventaire={"qcm123","ads234","qwerty456","azerty567","cap789","down345","top765","jungle432","fire8 ","hi234"};	   	   	   	   	   	   	   	   	   	   	   	   	   String	   articlesCherches	   =	   "down345";
		boolean	   trouve = false;
		int trouveIndex  = -1; %>
		<H1>Recherche de <%=articlesCherches%> au niveau de la base:</H1>

		<UL>
			<% int i=0;
			rticlesEnInventaire={"qcm123","ads234","qwerty456","azerty567","cap789","down345","top765","jungle432","fire8 ","hi234"};	   	   	   	   	   	   	   	   	   	   	   	   	   String	   articlesCherches	   =	   "down345";
								boolean	   trouve = false;
								int trouveIndex  = -1; %>
								<H1>Recherche de <%=articlesCherches%> au niveau de la base:</H1>
								
			<LI>	   Recherche index <%=i%> <%= articlesEnInventaire[i]%>
				<%	  
                                  if (articlesEnInventaire[i] == articlesCherches)	   
                                  {
				  trouve = true;
				  trouveIndex = i;
				  }
				    i++;
		         }  %>
			</UL>
			<H2>
			<%	   if (trouve) {   %>
			Trouvé à index = <%=trouveIndex%>
			<%	   }	   else	   {%>
			Désolé,	   <%=articlesCherches%> ne se trouve pas dans la base
			<%	   }%>
			</H2>
    </body>
</html>
