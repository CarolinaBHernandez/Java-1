/*
 Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y
le pida al usuario un número a buscar en el vector. 
El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
package javaintro01;

import java.util.Scanner;


public class Ejercicio2dia9 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[5];
        for (int i = 0; i < 5; i++) {
            vector[i] = (int) (Math.random() * 10 + 1);
            //System.out.print(vector[i]);
        }
        System.out.println(" ");
        System.out.println("Ingrese el numero que desea buscar");
        int num = leer.nextInt();
        int cont = 0;
        String aux = "";
        for (int i = 0; i < 5; i++) {
            if (vector[i] == num) {
                cont++;
                aux += "-" + i;
            }
        }

        if (cont >= 1) {
            System.out.println("Su numero se encuentra en la posicion: " + aux + "-");
        } else {
            System.out.println("Su numero no se encontro");

        }
    }
}

