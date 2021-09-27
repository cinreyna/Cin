/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author Cintia
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Implementar un programa que dado dos números enteros determine cuál es el
//mayor y lo muestre por pantalla.
   
   Scanner leer =new Scanner(System.in);
   
   
   System.out.println(" Ingrese 2 numeros enteros");
   int num1= leer.nextInt();
   int num2= leer.nextInt();
   
    if (num1>num2){
    System.out.println("El mayor de los numeros ingresados es el primero: " +num1);
    } else if (num1<num2){
    System.out.println("El mayor de los numeros ingresados es el segundo: " +num2);
    } 
    else{
    System.out.println("Los numeros ingresados son iguales");
    }        
    
    
   
}
    }
    

