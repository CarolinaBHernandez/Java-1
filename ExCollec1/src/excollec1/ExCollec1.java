/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excollec1;

import Entidad.Numeros;
import Servicio.ServicioNumeros;



/**
 *
 * @author Carolina Hernández
 */
public class ExCollec1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numeros numeros = new Numeros();
        ServicioNumeros sn= new ServicioNumeros();
        sn.agregarNum(numeros);
        sn.calcularSuma(numeros);
        sn.calcularPromedio(numeros);

        System.out.println("La suma de los números es: " + numeros.getSuma());
        System.out.println("El promedio de los números es: " + numeros.getPromedio());
        

    }
    
}
