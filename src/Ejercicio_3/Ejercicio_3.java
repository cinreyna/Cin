/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author Cintia
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
        //por pantalla.
        
        //se crea una variable Scanner que se utiliza para leer los datos del usuario
        Scanner leer= new Scanner (System.in);
        //se crea una variable cadena(string) que se utiliza por leer datos del usuario
        String nombre;
        //muestra el mensaje por pantalla
        System.out.println("Ingresa tu nombre: ");
        //Leemos el nombre de la persona en la variable nombre
          nombre=leer.next();
        //mostramos por consola tu nombre
        System.out.println(nombre);
    }
    
}
