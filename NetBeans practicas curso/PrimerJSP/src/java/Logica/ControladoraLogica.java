package Logica;

import persistencia.ControladoraPersistencia;


public class ControladoraLogica {
    

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
   
    public void crearCliente(Cliente cli) {
        controlPersis.crearCliente(cli);
    }
    public List<Cliente> traerCliente()  {
        return controlPersis.traerCliente();
    }
}
    

