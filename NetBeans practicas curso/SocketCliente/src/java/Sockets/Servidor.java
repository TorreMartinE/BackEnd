
package Sockets;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//Servidor va a heredar de ConexionSockets
//para poder usar sus metodos
    public class Servidor extends ConexionSockets {
        
        public Servidor() throws IOException {
super("servidor");
            
        }
    
        
//Creamos un metodo para inicializar el Servidor
public void startServer() throws IOException {

try {
    //el metodo accept inicializa el socket
    //queda a la espera de solicitudes
    System.out.println("Esperando por una Conexion...");
socketCliente = socketServidor.accept(); 
     
//Se obtiene el flujo de salida del cliente
    System.out.println("Cliente en Linea");
salidaCliente = new DataOutputStream(socketCliente.getOutputStream());


//Enviamos un mensaje al cliente
salidaCliente.writeUTF("Petición recibida y aceptada");


//Se obtiene el flujo entrante desde el cliente
    BufferedReader entrada = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));

//Mientras haya mensajes del cliente
while((mensajeServidor = entrada.readLine()) != null) {
    //Mostramos los mensajes recibidos
    System.out.println(mensajeServidor);
}
//Una vez que termino de leer los mensajes
//Finalizamos la conexion

    System.out.println("Fin de la conexión");
    socketServidor.close(); //Se finaliza la conexion con el cliente
}
catch(IOException e) {
                System.out.println(e.getMessage());
    }
}
    }