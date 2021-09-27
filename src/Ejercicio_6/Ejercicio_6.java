/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author Cintia
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Escribir un programa que lea un número entero por teclado y muestre por pantalla
//el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
//Math.sqrt().
  
 //Designo variable Scanner para leer datos ingresados
Scanner leer=new Scanner (System.in);

//Designo variable a leer numero
int numero;
int doble;
int triple;
double resultado;


//Solicito al usuario ingrese numero 
System.out.println("Ingrese un numero entero");
numero = leer.nextInt();

doble=numero*2;
triple=numero*3;
resultado=Math.sqrt(numero);

System.out.println("El doble del numero ingresado es :" + doble);

System.out.println("El triple del numero ingresado es :" + triple);

System.out.println("La raiz del numero ingresado es :" + resultado);

    }
    
}
