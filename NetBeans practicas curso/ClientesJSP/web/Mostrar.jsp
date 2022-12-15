<%-- 
    Document   : Mostrar
    Created on : 01/11/2022, 19:28:22
    Author     : Jesus
--%>

<%@page import="java.util.List"%>
<%@page import="logica.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MostrarJSP</title>
    </head>
    <body>
        <h1>Ver lista de Clientes</h1>
        <%
            List<Persona> listaPersonas = (List) request.getSession().getAttribute("listaPersonas");

            for (Persona per : listaPersonas) {

       %>
        <p>Id: </b> <%=per.getId()%></p>
        <p>Dni: </b> <%= per.getDni()%></p>
        <p>Nombre: </b> <%= per.getNombre()%></p>
        <p>Apellido: </b> <%= per.getApellido()%></p>
        <p>Telefono: </b> <%= per.getTelefono()%></p> 
        <p>..........................................</p>
    <%}%> 
</body>
</html>
