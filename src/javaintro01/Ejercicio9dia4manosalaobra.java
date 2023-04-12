/*
/*
 Escriba un programa que lea 20 números. Si el número leído es igual a cero 
se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  
El programa deberá calcular y mostrar el resultado de la suma de los números leídos, 
pero si el número es negativo no debe sumarse. 
 
 */
package javaintro01;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio9dia4manosalaobra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero positivo");
        int num;
        int suma = 0, contadorNumeros = 0;

        do {
            System.out.print("Ingrese un numero: ");
            num = teclado.nextInt();

            if (num == 0) {
                System.out.println("Se capturo el numero cero");
                break;

            }
            if (num < 0) {
                contadorNumeros++;
                continue;
            }
            suma = suma + num;
            contadorNumeros++;

        } while (contadorNumeros < 5);

        System.out.println("La suma de todos los numeros positivos es " + suma);

    }

}
