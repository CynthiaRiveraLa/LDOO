<%-- 
    Cynthia Elizabeth Riivera Laguna 1728227
--%>
<%@page import="modelo.Usuario"%>
<%

    Usuario x1 = (Usuario)request.getSession().getAttribute("persona1"); 



%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos recibidos</title>
    </head>
    <body background="https://2.bp.blogspot.com/-cFVxsHASQNI/TrxJlBgWJnI/AAAAAAAAAVE/Kk9n6bcENyc/s1600/fondo+azul.jpg">
        <style>
            h1{
                color: white;
            }
            p{
                color: white;
            }
        </style>
        
     <center>   <h1>Datos Correctos</h1>
    <strong><p><b>Nombre:</b> <%= x1.getNombre()%> </p>
        <p><b>Apellidos:</b> <%= x1.getApellidos()%></p>
        <p><b>Edad:</b> <%= x1.getEdad()%></p>
        <p><b>Correo:</b> <%= x1.getCorreo()%></p>
        <p><b>Contraseña:</b> <%= x1.getContrasenia()%></p>
        <p><b>Año:</b> <%= x1.getAnio()%></p>
        <p><b>Mes:</b> <%= x1.getMes()%></p>
        <p><b>Dia:</b> <%= x1.getDia()%></p></strong></center>
    </body>
</html>
