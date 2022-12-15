package Sockets;
import java.io.DataOutputStream;
import java.io.IOException;

public class Cliente extends ConexionSockets {
    
    //Costructor
    /* pasamos el tipo "cliente" para 
que ConexionSockets lo tome e inicialice*/
    public Cliente() throws IOException {
        super("cliente");
    }
    
    //Inicializamos el cliente     
    public void startClient() {
      try {
            //Flujo de datos hacia el Servidor
            salidaServidor = new DataOutputStream(socketCliente.getOutputStream());
                    
           // Enviamos 3 mensajes de prueba           
           for (int i = 0; i < 3; i++) {
               //Se escribe en el Servidor usando su Flujo de datos
               salidaServidor.writeUTF("Este es el mensaje número " + (i + 1) + "\n");
           }           
           //Finalizamos la conexion
           
           socketCliente.close();                    
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
    }
}
}
