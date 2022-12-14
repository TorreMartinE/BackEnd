/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arquitecturajava.testing;


import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class Servicio {
    
    public List<Persona> buscarTodas() {
    
    Persona p = new Persona("arbolito", 20);
    Persona p1 = new Persona("anahi", 30);
    
    List<Persona> lista = Arrays.asList(p, p1);
    return lista;
}
}



