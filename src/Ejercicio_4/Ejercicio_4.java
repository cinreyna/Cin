/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author Cintia
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Escribir un programa que pida una frase y la muestre toda en mayúsculas y
//después toda en minúsculas. Nota: investigar la función toUpperCase() y
//toLowerCase() en Java
 
   //se crea una variable Scanner que se utiliza para leer los datos del usuario
   Scanner leer= new Scanner (System.in).useDelimiter("\n");
    //se crea una variable cadena(string) que se utiliza por leer datos del usuario
   String frase;
   //muestra el mensaje por pantalla
   System.out.println("Ingrese una frase: " );
   //Lee frase ingresada
   frase= leer.next();
   //Imprimo la frase en mayusculas al metodo toUpperCase()
   System.out.println(frase.toUpperCase());
   //Imprimo la frase en minusculas al metodo tolowerCase()
   System.out.println(frase.toLowerCase());
           
   
   
    
    
    }
    
}
