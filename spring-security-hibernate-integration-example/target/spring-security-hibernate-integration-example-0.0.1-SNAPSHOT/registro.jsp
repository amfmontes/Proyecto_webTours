<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrarse</title>
</head>
<body>
<h2>Registro de Usuario</h2>
 <form:form action="usuario.do" method="post" commandName="student">
            <table>
                <tr>
                    <td>Id de Usuario</td>
                    <td><form:input path="idUsuario"/></td>
                </tr>
                <tr>
                    <td>Nombre</td>
                    <td><form:input path="nombre"/></td>
                </tr>
                <tr>
                    <td>Correo</td>
                    <td><form:input path="correo"/></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="action" value="Registrarse"/>
                    </td>
                </tr>
            </table>
        </form:form>
<!-- Nombre: <input type="text" name=nombre><br/><br/>
Correo:  <input type="text" name=nombre><br/><br/>
Teléfono:  <input type="text" name=nombre><br/><br/>
Contraseña:  <input type="text" name=nombre><br/><br/>
<input type="submit" value="Registrarse"> -->




</body>
</html>