package com.yoprogramo.ejercicios_vectores;

import java.util.Scanner;

/* Ejercicio 2 por (Eze).      "agrego nombres de estudiantes y profesor" 
En un vector de 15 posiciones se almacenan las edades de 15 alumnos. 
Se desea un programa que sea capaz de determinar: 
1) la mayor edad  
y
2) la menor edad 
que se encuentra entre los estudiantes.*/

public class Ejercicios_Vectores {

    public static void main(String[] args) {
      
        
        
        int [] edades = new int [15];
        String[]nombre = new String[15];
        
        for(int i = 0; i < 15; i++) {
           
            Scanner sc = new Scanner(System.in);
            System.out.println("ingrese el nombre del Estudiante: ");
            nombre[i] = sc.next();
            System.out.println("ingrese la edad de Estudiante: ");
            edades[i] = sc.nextInt();
        }
        System.out.println(".................");
        
        //Encontrar la edad Mayor
        int menor = edades[0];
        int mayor = edades[0];
       
        
        
        for(int i = 0; i < 15; i++) {
            if(edades[i] > mayor) {
                mayor = edades[i];
                             
            }
         } 
            System.out.println("El/La Estudiante de mayor edad tiene: " + mayor + " años.");
            System.out.println("El/La Estudiante de menor edad tiene: " + menor + " años.");
                     
     }          
}
        
          
        
    
        
                 
 
       
    
    

