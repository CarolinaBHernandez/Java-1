/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejexcs1;

import Entidades.Raices;
import Servicios.RaicesServicio;

/**
 *
 * @author User
 */
public class EjexCS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Raices ecuacion = new Raices(2.0, 8.0, 4.0);
        RaicesServicio servicio = new RaicesServicio();
        boolean tieneRaices = servicio.tieneRaices(ecuacion);
        if (tieneRaices) {
            System.out.println("La ecuación tiene dos soluciones.");
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
        
    }
}
