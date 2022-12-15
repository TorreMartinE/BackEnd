<%-- 
    Document   : index
    Created on : 26/10/2022, 22:20:44
    Author     : Jesus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" contentType="text/html"%>%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Esta es una página JSP</title>
    </head>
    <body>         
        <h1>Datos del cliente</h1>
        <form action="SvPrueba" mothod="POST">
            <p><label>Dni      :</label> <input type="text">dni</p>
            <p><label>Nombre:   </label> <input type="text">nombre</p>
            <p><label>Apellido: </label> <input type="text">apellido</p>
            <p><label>Telefono: </label> <input type="text">telefono</p>
            <button type="submit" >Enviar</button>
        </form>   <br>

        <h1>Ver lista de clientes</h1>
        <p>Si desea ver todos los clientes haga click en el botón Mostrar Clientes</p>
        <form action="SvPrueba" method="GET">
            <button type="submit" >Mostrar Clientes</button>
        </form>       
    </body>
</html>
