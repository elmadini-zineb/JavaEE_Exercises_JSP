package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ListEmp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("        <h1>Affichage des Employer</h1>\n");
      out.write("        \n");
      out.write("        <table width=\"100%\" border=\"2\">\n");
      out.write("            <tr>\n");
      out.write("                <th width=\"25%\">Matricule</th>\n");
      out.write("                <th width=\"25%\">Nom</th>\n");
      out.write("                <th width=\"25%\">Prénom</th>\n");
      out.write("                <th width=\"25%\">Service</th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");
 try{
                Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
                Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/Etablissement","root","AZERTY");
                Statement stat = conn.createStatement();
                String sql="select * from Employe";
                ResultSet rs= stat.executeQuery(sql);
                while(rs.next())
                { 
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                <td>");
      out.print(rs.getString("matricule") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("nom") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("prenom") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("service") );
      out.write("</td>\n");
      out.write("                 </tr>\n");
      out.write("                ");
               }
             
      out.println(" </table>");         
                if(stat != null)
                  stat.close();
                  if(conn != null)
                  conn.close();
} catch(Exception e){
out.print(e);}
                


                
      out.write("\n");
      out.write("           \n");
      out.write("        \n");
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
