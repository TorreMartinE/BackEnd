package Servlets;

import Logica.Cliente;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "SvPrueba", urlPatterns = {"/SvPrueba"})
public class SvPrueba extends HttpServlet {

    ControladoraLogica controlLog = ControladoraLogica();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        /*A continuación veremos el paso a paso para
        realizar la solicitud desde el servlet, utilizando un formulario GET 
        que llame al servlet y nos redirija a otra página 
        donde se nos muestren los datos de los clientes almacenados en una lista.
         */
        //simulamos una lista de clientes
        //esto ya podría venir desde una base de datos
        List<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(new Cliente("00000001", "Humberto", "Primo", "1100000001"));
        listaClientes.add(new Cliente("00000002", "Segundo", "Sombra", "1100000002"));
        listaClientes.add(new Cliente("00000003", "Enrique", "Tercero", "1100000003"));

        //seteamos la lista de clientes como un parámetro
        //para poder utilizar en cualquier JSP
        //para ello traemos la sesión de la request
        HttpSession misession = request.getSession();
        misession.setAttribute("listaClientes", listaClientes);

        //redireccionamos a otra JSP
        response.sendRedirect("MostrarJSP.jsp");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        /*pasos necesarios para levantar una página JSP, 
        recibir datos mediante un formulario y transmitirlos al servlet por el método POST 
        para el posterior tratamiento de los mismos.*/
        //traemos los datos enviados en la request
        //los guardamos en variables auxiliares
        //el nombre en getParameter debe ser el mismo que en el input del form
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");

        /*una vez recibidos los datos, podemos pasarlos a la lógica de negocio 
        para realizar operaciones, 
        o guardarlos en una base de datos, 
        o cualquier función que querramos darles*/
      Cliente cli = new Cliente(0001, 00000001, "Juan", "Encina", 1100000001);
    controlLog.crearCliente(cli);
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
