/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_13;

import java.util.Scanner;

/**
 *
 * @author Cintia
 */
public class Ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
        //la nota se pedirá de nuevo hasta que la nota sea correcta. 
    
        Scanner leer=new Scanner(System.in);
        int nota;
        
        do {System.out.println("Escriba una nota");
        nota=leer.nextInt();
        if (nota<0||nota>10 ){
            System.out.println("La nota ingresada no es válida, debe estar entre 0 y 10");
        }
        } while (nota<0||nota>10 );
    }
}
    
