/*I) PASO 1 : Crear proyecto SocketServidor 

Seguido a ello, creamos un nuevo paquete;
1. hacemos click derecho en el Source Packages del proyecto SocketServidor, 
2. vamos a New, 
3. vamos a Java Package, 
4. en Package Name escribimos Sockets  
(en este package Sockets luego irán los correspondientes sockets que sean creados)*/

package Sockets;  // Acá vemos el package de nombre Sockets que recien creamos

// las siguientes son importaciones que se irán adicionando cada vez que hagamos click en cada Add

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataOutputStream;


/**
 *
 * @author Jesus
 */

/* 
A continuación crearemos una nueva clase que tendrá como nombre ConexionSockets

1. hacemos click derecho sobre el package Sockets; 
2. vamos a New, 
3. hacemos click en Java Class, 
4. en Class Name escribimos ConexionSockets 
*/

public class ConexionSockets {   // Clase de nombre ConexionSockets y en ella especificaremos variables

//II) PASO 2:  Declaración de variables en la clase ConexionSockets, para: 

// 1) manejar el número de puerto, 
    private final int puerto = 1234;                              //Puerto para conectar 
// 2) el host (dirección), 
    private final String host = "localhost";                      //direccion ip para la conexion
// 3) los mensajes del servidor, 
    protected String mensajeServidor;                             //variable para msjes recibidos en el Servidor
// 4) la creación del socket del Servidor 
    protected ServerSocket socketServidor;                        //Socket del Servidor
// 5) la creación del socket del Cliente
    protected Socket socketCliente;                               //Socket del Cliente
// 6) y ambas salidas: la del cliente y la del servidor
    protected DataOutputStream salidaServidor, salidaCliente;     //variables de salida
   
   
 /* Ahora crearemos el Costructor vacío de la Clase ConexionSockets
    Para ello hacemos:
    
    1. click derecho aquí y se desplegará una lista de acciones
    2. buscamos donde dice Insert Code y le hacemos click 
    3. se abrirá un cuadro en el que figuran varias opciones
    4. buscamos la que dice Constructor y le hacemos click
    5. se va a abrir el cuadro Generate Constructor
    6. hacemos click en el boton que dice Generate y listo.
     
    tenemos creado el Constructor vacío de la Clase ConexionSockets
    
    Ahora que tenemos el Constructor, le agregaremos dentro de
    sus paréntesis (String tipo) como parámetro 
    para recibir luego el Argumento de tipo String 
    que representa a la conexión     
    */ 
    
    public ConexionSockets(String tipo) throws IOException 
    {
/* la conexión en este caso es la del "servidor"
   y será controlada mediante un if
   además el if también administrará la conexión ya sea
   tanto una solicitud del Cliente o una solicitud del Servidor
        
*/
        if (tipo.equalsIgnoreCase("servidor")) {
            //Creamos Socket para el Servidor
            //se usa el puerto que configuramos anteriormente
            socketServidor = new ServerSocket(puerto);
            //Creamos el Socket para el Cliente
            socketCliente = new Socket();
        } else {
            //Creamos Socket para el Cliente
            //le pasamos como parámetro el host y el puerto

            socketCliente = new Socket(host, puerto);
        }
    }
}

