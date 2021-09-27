/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_15;


import java.util.Scanner;

/**
 *
 * @author Cintia
 */
public class Ejercicio_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú*/
    
Scanner leer=new Scanner(System.in);

        System.out.println("Ingrese 2 numeros enteros positivos");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        char dec;
        dec = ' ';
        
        
        do{
        System.out.println("MENU:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        
        System.out.println("Seleccione opcion");
        int MENU=leer.nextInt();
        
        switch (MENU){
            case 1: 
                int suma=num1+num2;
                System.out.println("La suma de los numeros es "+suma);
            break;
            case 2:
                int resta=num1-num2;
                System.out.println("La resta de los numeros es "+resta);
            break;
            case 3:
                int multiplicacion=num1*num2;
                System.out.println("La resta de los numeros es "+multiplicacion);
            break;
            case 4:
                int division=num1/num2;
                System.out.println("La resta de los numeros es "+division);
            break;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?: "); 
            dec=leer.next().toUpperCase().charAt(0);
        }
        }while (dec!='S');
        }
        }