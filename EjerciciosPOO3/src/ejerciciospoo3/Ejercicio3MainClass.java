/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospoo3;

import Ejercicios.Operacion;

/**
 *
 * @author Carolina Hernández
 */
public class Ejercicio3MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Operacion operacion = new Operacion();
        operacion.crearOperacion();

        double resultadoSuma = operacion.sumar();
        System.out.println("La suma es: " + resultadoSuma);

        double resultadoResta = operacion.restar();
        System.out.println("La resta es: " + resultadoResta);

        double resultadoMultiplicacion = operacion.multiplicar();
        if (resultadoMultiplicacion != 0) {
            System.out.println("La multiplicaciÃ³n es: " + resultadoMultiplicacion);
        }

        double resultadoDivision = operacion.dividir();
        if (resultadoDivision != 0) {
            System.out.println("La divisiÃ³n es: " + resultadoDivision);
        }

    }

}

