/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospoorandom;

import Ejercicios.Cafetera;

/**
 *
 * @author User
 */
public class EjerciciosPOOrandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafetera cafetera = new Cafetera();
        cafetera.llenarCafetera();
        Cafetera cafetera1 = new Cafetera();
        cafetera1.servirTaza(0);
        Cafetera cafetera2 = new Cafetera();
        cafetera2.vaciarCafetera();
        Cafetera cafetera3 = new Cafetera();
        cafetera3.agregarCafe(0);
        
       
    }
    
}
