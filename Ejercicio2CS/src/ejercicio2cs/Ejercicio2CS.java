/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2cs;

import Cafetera.Cafetera;
import CafeteraCS.CafeteraService;

/**
 *
 * @author User
 */
public class Ejercicio2CS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      

   
        CafeteraService servicios = new CafeteraService();

        Cafetera Cafe1 = new Cafetera();

        Cafe1.setCantidadActual(0);
        Cafe1.setCapacidadMaxima(10);

        servicios.llenarcafetera(Cafe1);
        servicios.servirTaza(Cafe1);
        //servicios.vaciarCafetera(Cafe1);
        servicios.agregarCafe(Cafe1);
    }
}
