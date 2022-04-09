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
            <h3>Busquedas</h3>
            <form action="Controlador" method="POST">
                <input type="submit" name="accion" value="Buscar Producto">
            </form>
        </div>
        <div>

            <table style="border-collapse: collapse"  border="1">
                <thead>
                    <tr>
                        <th>NUMERO DE VENTAS</th>
                        <th>NOMBRE CATEGORIA</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="dato" items="${dato3}">
                        <tr>
                            <td><c:out value="${dato.getNUMVENTAR()}"/></td>
                            <td><c:out value="${dato.getNOM_CATEGORIA()}"/></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </div>
    </center>
</body>
</html>
