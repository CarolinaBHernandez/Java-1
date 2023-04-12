/*
Crear una función rellene un vector con números aleatorios, 
pasándole un arreglo por parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package javaintro01;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio3dia10Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    
        System.out.println("Ingrese el tamaño de los vectores");        
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] vector = new int[n];
        llenar(vector);
        imprimir(vector);
    }
        
    public static void llenar(int[] vector){
        
        for (int i = 0; i < vector.length ; i++) {
            vector[i] = (int)(Math.random()*100);
        }
    }
    
    public static void imprimir(int[] vector){
        
        for (int i = 0; i < vector.length ; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
    }
}
    
    

