<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FormularioJSP</title>
    </head>
    <body>
        
        <h1>Alta de cliente</h1>
        <form action="SvPersona" method="POST">
            <p><label>Id: </label> <input type="text" name="id"></p>
            <p><label>Dni: </label> <input type="text" name="dni"></p>
            <p><label>Nombre: </label> <input type="text" name="nombre"></p>
            <p><label>Apellido: </label> <input type="text" name="apellido"></p>
            <p><label>Telefono: </label> <input type="text" name="telefono"></p>
            <button type="submit" >Alta de Cliente</button>
        </form>   

        
        <h1>Lista de Clientes</h1>
        <p>Si desea ver todos los clientes haga click en el botón Mostrar Clientes</p>
        <form action="SvPersona" method="GET">
            <button type="submit" >Mostrar Clientes</button>
        </form>
        <h1>Baja de Cliente</h1>
        <p>Ingrese la Id del Cliente a dar de Baja</p>
        <form action="SvEliminar" method="POST">
            <p><label>Id: </label> <input type="text" name="id_eliminar"></p> 
            <button type="submit">Baja de Cliente</button>
        </form>
    </body>
</html>
