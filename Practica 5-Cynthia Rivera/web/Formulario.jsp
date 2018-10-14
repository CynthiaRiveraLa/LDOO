<%-- 
    Cynthia Elizabeth rivera Laguna 1728227
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario</title>
    </head>
    <body background="http://www.desktop-screens.com/data/out/74/3161149-minimalism-wallpapers.jpg">
        <style>
            body{
                background-color: peachpuff;
            }
            
            
        </style>
        
        
       <center>
           <form action="procesar.do" method="post"> <strong>
	
                    <h1> FORMULARIO </h1>
		
            <p><br>Nombre:</br> <input type="text" name="nombree" size="40" /></p>                            
            <p><br>Apellidos:</br> <input type="text" name="apellidoss" size="40" placeholder="Escriba sus dos apellidos" /></p>
            
            <br>Edad:</br> <input type="text" name="edadd">
            <br>
            
            <label for="email"><br>Direccion de Correo Electronico:</br></label>
            <input type="email" placeholder="ejemplo@hola.com" name="email" id="email">
            <br>
            
            <label for="pass"><br>Password:</br></label>
            <input type="password" name="pass" id="pass">
            <br>
            
            <p><br>Año de nacimiento:</br> <input type="number" name="anio" min="1940" max="2018" /></p>
            <p><b>Mes:</br> <input type="number" name="mess" min="01" max="12"></p>
            <p><b>Dia:</br> <input type="number" name="diaa" min="01" max="31"></p>
            <br>
            
            <input type = "submit" onclick  value = "Enviar"> 
            <input type = "reset" value = "Borrar todo">
		</strong></form> 
       </center>
    </body>
</html>
