/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_9;

import java.util.Scanner;

/**
 *
 * @author Cintia
 */
public class Ejercicio_9_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Crear un programa que pida una frase y si esa frase es igual a â€œeurekaâ€� el programa
//pondrÃ¡ un mensaje de Correcto, sino mostrarÃ¡ un mensaje de Incorrecto. Nota:
//investigar la funciÃ³n equals() en Java

    Scanner leer=new Scanner(System.in);

    
    System.out.println(" Escriba la primer frase ");
    String frase1=leer.nextLine();
    
    System.out.println(" Escriba la segunda frase ");
    String frase2=leer.nextLine();
    
    if (frase1.equalsIgnoreCase(frase2)){
        System.out.println("CORRECTO. Las frases son iguales");
    }else{
    System.out.println("INCORRECTO.Las frases son diferentes");
    }
    }
}
