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
public class Ejercicio_9_1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Crear un programa que pida una frase y si esa frase es igual a Ã¢â‚¬Å“eurekaÃ¢â‚¬ï¿½ el programa
//pondrÃƒÂ¡ un mensaje de Correcto, sino mostrarÃƒÂ¡ un mensaje de Incorrecto. Nota:
//investigar la funciÃƒÂ³n equals() en Java

    Scanner leer=new Scanner(System.in);

    
    System.out.println(" Escriba la primer frase ");
    String frase1=leer.nextLine();
    
    
    ////Se coloca un condicional para saber si las frases son iguales con equalsIgnoreCase ignora Mayusculas y minusculas
    if (frase1.equalsIgnoreCase("Eureka")){
        System.out.println("CORRECTO.Las frases son iguales");
    }else{
    System.out.println("INCORRECTO.Las frases son diferentes");
    }
    }
}
