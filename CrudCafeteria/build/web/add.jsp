<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <div>
            <h3>Agregar Productos</h3>
        </div>
        <div>
            <form action="Controlador" method="post">
                NOMBRE PRODUCTO:  
                <input type="text" name="txtnombre"> <br>
                REFERENCIA:  
                <input type="text" name="txtreferencia"> <br>
                PRECIO:  
                <input type="text" name="txtprecio"> <br>
                PESO:  
                <input type="text" name="txtpeso"> <br>
                CATEGORIA:  
                <select name="optioncategoria" id="optioncategoria">
                    <option value="0" selected> </option>
                    <option value="1">CAFE</option>
                    <option value="2">BEBIDA</option>
                    <option value="3">ESPRESSO</option>
                    <option value="4">PASTELILLOS</option>
                    <option value="5">EXTRAS</option>
                    <option value="6">MALTEADAS</option>
                    <option value="7">FRAPPES</option>
                </select> <br>
                STOCK:  
                <input type="text" name="txtstock"> <br>
                FECHA DE CREACION:  
                <input type="text" name="txtfecha_creacion"> <br><br>
                <input type="submit" name="accion" value="Guardar">
            </form>
        </div>
    </center>
    </body>
</html>
