/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.yoprogramo.practicasjava;
import java.util.*;
/**
 *
 * @author Jesus
 */
public class PracticasJava {

  public static void main(String[] args) {
    // Crear la lista
    @SuppressWarnings("Convert2Diamond")
    List<Persona> listaPersonas = new ArrayList<Persona>();
    listaPersonas.add(new Persona(1,"Juan",80));
    listaPersonas.add(new Persona(1,"Ezequiel",81));
    listaPersonas.add(new Persona(1,"Martín",32));
    listaPersonas.add(new Persona(1,"Luisina",29));
    System.out.println("En la lista hay "+ listaPersonas.size() + " personas" + "\n");


    //Opcion 1 - Recorrer la Lista y mostrar el nombre
    for(Persona objPersona : listaPersonas){
      
      System.out.println("Está: " + objPersona.getNombre()+ " de " + objPersona.getEdad()+ " años." + "\n");
      
          
        
    }
    

    //Opcion 2 - Recorrer la Lista y ver los id de objetos
System.out.println(" Por edades Luisina y Martín son más compatibles...." + "Juan y Ezequiel son más viejitos jajajaj!!" + "\n");
System.out.println("..................." +"\n");
    for(int i=0; i<listaPersonas.size();i++ ){
     
     
     System.out.println("Persona: " + listaPersonas.get(i));
    }
   
  }
}
