package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Exercice1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

	String[]articlesEnInventaire={"qcm123","ads234","qwerty456","azerty567","cap789","down345","top765","jungle432","fire8 ","hi234"};	   	   	   	   	   	   	   	   	   	   	   	   	   String	   articlesCherches	   =	   "down345";
		boolean	   trouve = false;
		int trouveIndex  = -1; 
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\t\t<H1>Recherche de ");
      out.print(articlesCherches);
      out.write(" au niveau de la base:</H1>\n");
      out.write("\t\t\n");
      out.write("\t\t<UL>\n");
      out.write("\t\t\t");
 int i=0;
			while  (!trouve &&  i < articlesEnInventaire.length)	   
                        {
      out.write("\n");
      out.write("\t\t\t<LI>\t   Recherche index ");
      out.print(i);
      out.write(' ');
      out.print( articlesEnInventaire[i]);
      out.write("\n");
      out.write("\t\t\t\t");
	  
                                  if (articlesEnInventaire[i] == articlesCherches)	   
                                  {
				  trouve = true;
				  trouveIndex = i;
				  }
				    i++;
		         }  
      out.write("\n");
      out.write("\t\t\t</UL>\n");
      out.write("\t\t\t<H2>\n");
      out.write("\t\t\t");
	   if (trouve) {   
      out.write("\n");
      out.write("\t\t\tTrouvé à index = ");
      out.print(trouveIndex);
      out.write("\n");
      out.write("\t\t\t");
	   }	   else	   {
      out.write("\n");
      out.write("\t\t\tDésolé,\t   ");
      out.print(articlesCherches);
      out.write(" ne se trouve pas dans la base\n");
      out.write("\t\t\t");
	   }
      out.write("\n");
      out.write("\t\t\t</H2>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
