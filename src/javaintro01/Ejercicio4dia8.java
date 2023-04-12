/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro
para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */
package javaintro01;

import java.util.Scanner;

public class Ejercicio4dia8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = leer.nextInt();
        esPrimo(n);

    }

    public static boolean esPrimo(int n) {
        boolean primo = true;
        if (n <= 1) {
            System.out.println("El numero no es primo");
            primo = false;

        } else if (n == 2) {
            primo = true;
        } else {

            for (int i = 2; i < n && primo ==true;  i++) {

                if (n % i == 0) {
                    System.out.println("El numero no es primo");
                    primo = false;

                } else {
                    System.out.println("El numero ingresado es primo");
                    primo = true;
                }
            }
        }
          return primo;
    }
}   
