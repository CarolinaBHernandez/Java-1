/*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
 */
package javaintro01;

import java.util.Scanner;

public class Ejercicio8dia5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de su cuadrado: ");
        int n = teclado.nextInt();
        
       
        if(n >= 0 && n<=10) {
            //superior
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
           
            //centro 
            for(int i = 0; i < n-2; i++) {
                System.out.print("*");
                for(int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            //inferior
            for(int i = 0; i < n; i++) {
                System.out.print("*");
            }
        }else {
            System.out.println("Error. El dato a ingresar de "
                    + "estar entre 0 y 10");
        }
               
           
        
    }
}
    