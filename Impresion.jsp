<%-- 
    Document   : Impresion
    Created on : 03-oct-2018, 11:42:07
    Author     : eliza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario</title>
        <style>
            body{
                background-color: lavenderblush;
                text-align:center;
                font-size: 150%;
            }
   
            
        </style>
        
        
    </head>
    <body>
       
      <%
String nombre = request.getParameter("nombre");
String apellidos = request.getParameter("apellidos");
String correo = request.getParameter("correo");
String contraseña = request.getParameter("contrasena");
String fecha= request.getParameter("nacimiento");

out.println("Nombre:"+nombre);
out.print("<br/>");
out.print("<br/>");
out.println("Apellidos:"+apellidos);
out.print("<br/>");
out.print("<br/>");
out.println("Correo Electronico"+correo);
out.print("<br/>");
out.print("<br/>");
out.println("Contraseña:"+contraseña);
out.print("<br/>");
out.print("<br/>");
out.println("Fecha de Nacimiento:"+fecha);     
%>
                
    </body>
     
</html>
