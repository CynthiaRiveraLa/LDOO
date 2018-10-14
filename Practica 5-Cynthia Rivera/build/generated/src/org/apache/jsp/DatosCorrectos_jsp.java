package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Usuario;

public final class DatosCorrectos_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');


    Usuario x1 = (Usuario)request.getSession().getAttribute("persona1"); 




      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Datos recibidos</title>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"https://img00.deviantart.net/c251/i/2016/152/c/4/itachi_uchiha__naruto__minimalist_wallpaper_by_slezzy7-da4kc3c.png\">\n");
      out.write("        <h1>Datos Correctos</h1>\n");
      out.write("        <p><b>Nombre:</b> ");
      out.print( x1.getNombre());
      out.write(" </p>\n");
      out.write("        <p><b>Apellidos:</b> ");
      out.print( x1.getApellidos());
      out.write("</p>\n");
      out.write("        <p><b>Edad:</b> ");
      out.print( x1.getEdad());
      out.write("</p>\n");
      out.write("        <p><b>Correo:</b> ");
      out.print( x1.getCorreo());
      out.write("</p>\n");
      out.write("        <p><b>Contraseña:</b> ");
      out.print( x1.getContrasenia());
      out.write("</p>\n");
      out.write("        <p><b>Año:</b> ");
      out.print( x1.getAnio());
      out.write("</p>\n");
      out.write("        <p><b>Mes:</b> ");
      out.print( x1.getMes());
      out.write("</p>\n");
      out.write("        <p><b>Dia:</b> ");
      out.print( x1.getDia());
      out.write("</p>\n");
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
