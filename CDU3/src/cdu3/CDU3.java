/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales.
 */
package cdu3;

import Servicio.ArregloService;

/**
 *
 * @author Carolina Hernández
 */
public class CDU3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double[] arrayA = new Double[50];
        Double[] arrayB = new Double[20];
        
        ArregloService arregloService = new ArregloService();

        arregloService.inicializarA(arrayA);
        System.out.println("Arreglo A: ");
        arregloService.mostrar(arrayA);
        System.out.println("Arreglo A ordenado: ");
        arregloService.ordenar(arrayA);
        arregloService.mostrar(arrayA);
        arregloService.inicializarB(arrayA, arrayB);
        System.out.println("Mostrar A y B ordenados: ");
        arregloService.mostrar(arrayB);
        
       
    
        
    }
    
}
