package persistencia;

import Logica.Cliente;
import java.util.List;

public class ControladoraPersistencia {

    ClienteJpaController cliJPA = new ClienteJpaController();

    public ControladoraPersistencia() {
    }

    public void traerCliente(Cliente cli) {
        cliJPA.toString();
    }

    public void crearCliente(Cliente cli) {
        cliJPA.create(cli);
    }

    public List<Cliente> mostrarCliente() {

        return cliJPA.findClienteEntities();
    }
}
