/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Sockets.Servidor;
import java.io.IOException;

/**
 *
 * @author Jesus
 */
public class SocketServidor {
    
    public static void main(String[] args) throws IOException {
        
       //Creamos un nuevo Servidor y lo iniciamos
       Servidor servi = new Servidor();
        System.out.println("Iniciando el Servidor... \n");
        servi.startServer();
    }
    
}
