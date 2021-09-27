/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author Cintia
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escribir un programa que pida dos números enteros por teclado y calcule la suma
        //de los dos. El programa deberá después mostrar el resultado de la suma
        
        //se crea una variable Scanner que se utiliza para leer los datos del usuario
    Scanner leer = new Scanner(System.in);
       //se crea una variable numero()que se utiliza para leer datos del usuario
    int numero1;
    int numero2;
    int suma = 0;
      //solicita numero a ingresar por el usuario
      System.out.println(" Ingrese 2 numeros enteros");
      //Leemos los numeros en la variable
      numero1 = leer.nextInt();
      numero2 = leer.nextInt();
      suma=numero1+numero2;
      //Mostramos el resultado de la suma de los dos numeros
      System.out.println(" La suma de los numeros ingresados es "+ suma);
              
      
    
            }
    
}
