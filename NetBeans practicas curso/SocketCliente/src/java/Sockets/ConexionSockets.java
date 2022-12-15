package Sockets;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


    public class ConexionSockets {

    private final int puerto = 1234;
    private final String host = "localhost";
    protected String mensajeServidor;
    protected ServerSocket socketServidor;
    protected Socket socketCliente;
    protected DataOutputStream salidaServidor, salidaCliente;

    public ConexionSockets(String tipo) throws IOException {
        
        if(tipo.equalsIgnoreCase("cliente")){
            
            socketServidor = new ServerSocket(puerto);
            socketCliente = new Socket();             
        }
        else{
            socketCliente = new Socket(host, puerto);
     }
    }
   }