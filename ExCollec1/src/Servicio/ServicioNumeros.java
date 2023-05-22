/*
1. Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package Servicio;

import Entidad.Numeros;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */

public class ServicioNumeros {
    
    public void agregarNum(Numeros numeros) {
        Scanner leer = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Introduzca un número entero (-99 para terminar): ");
            numero = leer.nextInt();
            if (numero != -99) {
                numeros.getNumeros().add(numero);
            }
        } while (numero != -99);
    }

    public void calcularSuma(Numeros numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.getNumeros().size(); i++) {
            suma += numeros.getNumeros().get(i);
        }
        numeros.setSuma(suma);
    }

    public void calcularPromedio(Numeros numeros) {
        double promedio = (double) numeros.getSuma() / numeros.getNumeros().size();
        numeros.setPromedio(promedio);
    }
}






    
