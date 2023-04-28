/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones4;

import Servicio.ServicioPelicula;

/**
 *
 * @author Carolina Hernández
 */
public class Colecciones4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioPelicula servicio = new ServicioPelicula();
        servicio.agregarPeliculas();
        servicio.mostrarPeliculas();
        servicio.mostrarTitulosLargos();
        servicio.mayorMenor();
        servicio.ordenarTitulo();
        servicio.ordenarDirector();
    }
    
}
