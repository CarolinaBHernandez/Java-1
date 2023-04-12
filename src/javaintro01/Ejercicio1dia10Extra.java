/*
 Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N,
con los valores ingresados por el usuario.
 */
package javaintro01;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio1dia10Extra {

    
    public static void main(String[] args) {
    
        System.out.println("Ingrese el tamaño del vector");
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] vector = new int[n];
        int suma;
        suma = 0;
        
        for (int i = 0 ; i < n ; i++){
            System.out.println("Ingrese los valores del vector");
            vector[i]= read.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma de los elementos del vector es igual a: " + suma);
    }
}

