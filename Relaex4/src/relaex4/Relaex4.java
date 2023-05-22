/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaex4;

import Entidades.Alumno;
import Entidades.Simulador;
import java.util.List;

/**
 *
 * @author Carolina Hernández
 */
public class Relaex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simulador simulador = new Simulador();
        List<Alumno> listaAlumnos = simulador.listaAlumnos(6);
        simulador.mostrarAlumnos(listaAlumnos);
    }
    
}
