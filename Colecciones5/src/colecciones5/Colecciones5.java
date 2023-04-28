/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones5;

import Servicio.ServicioPaises;

/**
 *
 * @author Carolina Hernández
 */
public class Colecciones5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ServicioPaises servicio = new ServicioPaises();
    servicio.crearPais();
    servicio.ordenarPaises();
    servicio.borrarPais();
    }
    
}
