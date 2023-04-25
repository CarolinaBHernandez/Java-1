/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones1;

import Servicio.RazaServicio;

/**
 *
 * @author Carolina Hernández
 */
public class Colecciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RazaServicio razaServicio = new RazaServicio(); 
        razaServicio.ingresarRaza();
        razaServicio.eliminarRaza();
        //razaServicio.ordenarRazas();
    }
    
}
