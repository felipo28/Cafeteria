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
            <h3>Categoria</h3>
            <form action="Controlador" method="POST">
                <input type="submit" name="accion" value="Listar Productos">
                <input type="submit" name="accion" value="Busqueda">
                <input type="submit" name="accion" value="Nuevo Producto">
            </form>
        </div>
        <div>
            <table style="border-collapse: collapse"  border="1">
                <thead>
                    
                    <tr>
                        <th>ID</th>
                        <th>NOMBRE PRODUCTO</th>
                        <th>REFERENCIA</th>
                        <th>PRECIO</th>
                        <th>PESO</th>
                        <th>ID_CATEGORIA</th>
                        <th>STOCK</th>
                        <th>FECHA DE CREACION</th>
                        
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="dato" items="${datos}">
                        <tr>
                            <td><c:out value="${dato.getID()}"/></td>
                            <td><c:out value="${dato.getNOMBRE_PRODUCTO()}"/></td>
                            <td><c:out value="${dato.getREFERENCIA()}"/></td>
                            <td><c:out value="${dato.getPRECIO()}"/></td>
                            <td><c:out value="${dato.getPESO()}"/></td>
                            <td><c:out value="${dato.getID_CATEGORIA()}"/></td>
                            <td><c:out value="${dato.getSTOCK()}"/></td>
                            <td><c:out value="${dato.getFECHA_CREACION()}"/></td>
                            
                            <td>
                                <form>
                                    <input type="submit" value="Editar">
                                    <input type="submit" value="Delete">
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </center>
</body>
</html>
