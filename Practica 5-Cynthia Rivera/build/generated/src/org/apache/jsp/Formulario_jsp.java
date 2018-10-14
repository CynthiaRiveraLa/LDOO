package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Formulario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Formulario</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"http://www.desktop-screens.com/data/out/74/3161149-minimalism-wallpapers.jpg\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: peachpuff;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       <center>\n");
      out.write("           <form action=\"procesar.do\" method=\"post\"> <strong>\n");
      out.write("\t\n");
      out.write("                    <h1> FORMULARIO </h1>\n");
      out.write("\t\t\n");
      out.write("            <p><br>Nombre:</br> <input type=\"text\" name=\"nombree\" size=\"40\" /></p>                            \n");
      out.write("            <p><br>Apellidos:</br> <input type=\"text\" name=\"apellidoss\" size=\"40\" placeholder=\"Escriba sus dos apellidos\" /></p>\n");
      out.write("            \n");
      out.write("            <br>Edad:</br> <input type=\"text\" name=\"edadd\">\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <label for=\"email\"><br>Direccion de Correo Electronico:</br></label>\n");
      out.write("            <input type=\"email\" placeholder=\"ejemplo@hola.com\" name=\"email\" id=\"email\">\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <label for=\"pass\"><br>Password:</br></label>\n");
      out.write("            <input type=\"password\" name=\"pass\" id=\"pass\">\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <p><br>Año de nacimiento:</br> <input type=\"number\" name=\"anio\" min=\"1940\" max=\"2018\" /></p>\n");
      out.write("            <p><b>Mes:</br> <input type=\"number\" name=\"mess\" min=\"01\" max=\"12\"></p>\n");
      out.write("            <p><b>Dia:</br> <input type=\"number\" name=\"diaa\" min=\"01\" max=\"31\"></p>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <input type = \"submit\" onclick  value = \"Enviar\"> \n");
      out.write("            <input type = \"reset\" value = \"Borrar todo\">\n");
      out.write("\t\t</strong></form> \n");
      out.write("       </center>\n");
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
