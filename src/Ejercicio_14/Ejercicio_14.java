/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_14;

import java.util.Scanner;

/**
 *
 * @author Cintia
 */
public class Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//solicite números al usuario hasta que la suma de los números introducidos supere
//el límite inicial. 
    
   Scanner leer=new Scanner(System.in);
   
        System.out.println("Ingrese un valor limite positivo");
        int limite=leer.nextInt();
        int num;
        int suma=0;
        
        
        do {System.out.println("Ingrese numeros enteros positivos");
        num=leer.nextInt();
        suma=num+suma;
            
        } while ((suma)<limite);
        System.out.println("La suma de los numeros ingresados es " +suma+" supera el limite ingresado " +limite);
    }  
    }
