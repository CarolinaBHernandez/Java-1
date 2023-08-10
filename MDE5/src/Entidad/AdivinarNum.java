/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package Entidad;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */
public class AdivinarNum {
   int numAleatorio = (int) (Math.random() * 500) + 1;
    int intentos = 0;
   
    public void jugar() {
        Scanner leer = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Introduce un número: ");
                int num = leer.nextInt();

                intentos++;

                if (num == numAleatorio) {
                    System.out.println("Adivinaste");
                    System.out.println("Número de intentos: " + intentos);
                    break;
                } else if (num < numAleatorio) {
                    System.out.println("El número a adivinar es mayor.");
                } else {
                    System.out.println("El número a adivinar es menor.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Introduce un número válido.");

                intentos++;
                leer.next();
            }
        }

    }
}

