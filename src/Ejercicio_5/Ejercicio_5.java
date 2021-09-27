/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author Cintia
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Dada una cantidad de grados centígrados se debe mostrar su equivalente en
//grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 
// Coloco clase Scanner para leer datos
 Scanner leer = new Scanner (System.in);
//Solicitar coloque cantidad de grados centigrados
System.out.println("Ingrese cantidad de grados centigrados");
//Declaramos variable a leer y resultado en fahrenheit
int centigrados;
//Leemos el numero
centigrados=leer.nextInt();
//realizo calculo para luego mostrar
int fahrenheit = 32 + (9 * centigrados / 5);
//escribimos conversion de grados centigrados a farhengeit
System.out.println("Los grados ingresados en centigrados equivalen a: " + fahrenheit + " grados Fahrenheit");
    }
    
}
