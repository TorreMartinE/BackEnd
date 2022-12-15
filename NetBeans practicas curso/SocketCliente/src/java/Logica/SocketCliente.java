/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Sockets.Cliente;
import java.io.IOException;

public class SocketCliente {
    
    public static void main(String[] args) throws IOException {
       
       Cliente cli = new Cliente(); //Creamos el Cliente 
       
        System.out.println("Iniciando el cliente\n");
        cli.startClient(); // Se inicia el cliente
        
    }
    
}
