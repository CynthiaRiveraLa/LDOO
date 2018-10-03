<%-- 
    Document   : Datos
    Created on : 03-oct-2018, 11:42:37
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
               background-color:peachpuff; 
            }
            form{
                text-align: center;
                font-size: 150%;
                font-family: serif;
            }
            
        </style>
        
        
    </head>
    <body>
        <form action='Impresion.jsp'method="post" >
            Nombre: <input type="text" name='nombre'><br><br>
            Apellidos: <input type="text" name='apellidos'><br><br>
            Correo electronico: <input type="email" placeholder="ejemplo@hola.com" name='correo' id='email'><br><br>
            Contraseña: <input type="password" name='contrasena'id='pass'><br><br>
            Fecha nacimiento: <input type="date" name="nacimiento"  min="1900-01-01" max="2999-12-31"><br><br>
            <button type="reset"> Borrar </button>
            <input type='submit'value="Enviar">
        </form>
    </body>
</html>
