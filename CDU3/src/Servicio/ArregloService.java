/*
Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.

 */
package Servicio;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author Carolina Hernández
 */
public class ArregloService {

    public void inicializarA(Double[] arrayA) {
        Random random = new Random();
        for (int i = 0; i < arrayA.length; i++) {
            Arrays.fill(arrayA,i,i+1,random.nextDouble() * 100);
        }

    }

    public void mostrar(Double[] arrayA) {
        System.out.println(Arrays.toString(arrayA));
    }

    public void ordenar(Double[] arrayA) {
        Arrays.sort(arrayA,Comparator.reverseOrder());
    }
    
      public void inicializarB(Double[] arrayA, Double[] arrayB) {
       for (int i = 0; i < 10; i++) {
             Arrays.fill(arrayB,i,i+1,arrayA[i]);
        }
            Arrays.fill(arrayB, 10, arrayB.length, 0.5);
        }

 
}
