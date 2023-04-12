/*
 Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,+
sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado 
por teclado y determine si este cuadrado es mágico o no. 
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package javaintro01;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio6dia10 {

   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int sumafilas = 0, sumacolumnas = 0, sumadiagonal = 0, cont = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("ingresa un valor para la matriz del 1 al 9");
                int num = leer.nextInt();
                if ((num > 0) && (num <= 9)) {
                    matriz[i][j] = num;
                } else {
                    System.out.println("El numero ingresado no esta dentro del intervalo");
                    j--;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            sumafilas = 0;
            sumacolumnas = 0;
            for (int j = 0; j < 3; j++) {
                sumafilas += matriz[i][j];
                sumacolumnas += matriz[j][i];
                if (i == j) {
                    sumadiagonal += matriz[i][j];
                }
            }
            if (sumafilas == sumacolumnas) {
                cont++;
            }
        }

        if ((cont == 3) && (sumacolumnas == sumadiagonal)) {
            System.out.println("es un cuadrado magico");
        } else {
            System.out.println("no es un cuadrado magico");
        }
    }
}
