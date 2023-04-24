/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdu2;

import Entidades.ParDeNumeros;
import Servicio.ParDeNumerosService;



/**
 *
 * @author Carolina Hernández
 */
public class CDU2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ParDeNumeros pdn = new ParDeNumeros();
        ParDeNumerosService pdns = new ParDeNumerosService();
        pdns.mostrarValores(pdn);
        System.out.println("El mayor de los números es: " +pdns.devolverMayor(pdn));
        pdns.calcularPotencia(pdn);
        System.out.println("La raíz cuadrada del menor de los dos valores es: " + pdns.calcularRaiz(pdn));
        
        
    }
    
}
