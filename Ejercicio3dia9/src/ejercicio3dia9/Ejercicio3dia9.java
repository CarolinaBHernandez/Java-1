/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package ejercicio3dia9;

import java.util.Scanner;


public class Ejercicio3dia9 {

    
    public static void main(String[] args) {       Scanner read = new Scanner(System.in);
        
        int n, count;
        count = 0;
        System.out.println("Ingrese el tamaño del vector:");
        n = read.nextInt();
        
        int[] vector = new int[n];
        int[] aux = new int[5];

        for (int i = 0; i < n; i++) {
            vector[i] = (int)(Math.random()*100000);
        }

        for (int i = 0; i < n; i++) {
            count = 0;
            int aux2 = vector[i];
            do {
                aux2 = aux2 / 10;
                count++;
            } while (aux2 != 0);
            
            switch (count) {
                case 1:
                    aux[0]++;
                    break;
                case 2:
                    aux[1]++;
                    break;
                case 3:
                    aux[2]++;
                    break;
                case 4:
                    aux[3]++;
                    break;
                case 5:
                    aux[4]++;
                    break;
            }
        }
        
        /*for (int i = 0; i < n; i++) {
            System.out.print("["+vector[i]+"]");
            
        }*/
        System.out.println(" ");
                
        System.out.println("La cantidad de números de un dígito es: " + aux[0] + "\nLa cantidad de números de dos dígitos es: "
        + aux[1] + "\nLa cantidad de números de tres dígitos es: " + aux[2] + "\nLa cantidad de números de cuatro dígitos es: " + aux[3]
        + "\nLa cantidad de números de cinco dígitos es: " + aux[4]);

}
}
        
        
        
    
    

