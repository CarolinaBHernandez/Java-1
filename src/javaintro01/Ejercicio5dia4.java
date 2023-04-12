/*
Escriba un programa en el cual se ingrese un valor limite positivo,
y a continuacion solicite numeros al usuario hasta que la suma de los numeros introducidos
supere el limite inicial.
 */
package javaintro01;

import java.util.Scanner;

public class Ejercicio5dia4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el valor limite positivo: ");
        int n = teclado.nextInt();
        int suma = 0;

        do {
            System.out.print("Ingrese un numero: ");
            suma= suma + teclado.nextInt();
            

        } while (suma <= n);

        System.out.print("Tu limite es: "+ n + " y la suma es " +suma);

    }

}
    

