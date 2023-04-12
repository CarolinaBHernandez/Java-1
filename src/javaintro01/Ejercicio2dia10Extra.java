/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (
la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos
 */
package javaintro01;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio2dia10Extra {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args){
        System.out.println("Ingrese el tamaño de los vectores");
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        int[] array1 = new int[n];
        
        int[] array2 = new int[n];
        
        for (int i = 0; i < n ; i++) {
            array1[i] = (int)(Math.random()*100);
            System.out.println(array1[i]);
            array2[i] = (int)(Math.random()*100);
            System.out.println(array2[i]);
            
                                 
            if (array1[i]!=array2[i]){
                System.out.println("Los vectores son diferentes desde la posicion: " +i);
                break;
            }
        }
    }
}
    
    

