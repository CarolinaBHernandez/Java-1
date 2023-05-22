/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mao2relaciones;

import Entidades.Equipo;
import Entidades.Jugador;
import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */
public class MAO2relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Equipo equipo = new Equipo();
    Scanner leer = new Scanner(System.in);
    boolean agregarJugador = true;
    while (agregarJugador) {
        equipo.agregarJugador();
        System.out.println("Desea agregar otro jugador? (s/n)");
        String respuesta = leer.next();
        if (respuesta.equalsIgnoreCase("n")) {
            agregarJugador = false;
        }
    }
    for (Jugador jugador : equipo.getJugadores()) {
        System.out.println("Nombre: " + jugador.getNombre());
        System.out.println("Apellido: " + jugador.getApellido());
        System.out.println("Número: " + jugador.getNumero());
        System.out.println("Posición: " + jugador.getPosicion());
        System.out.println();
    }
}
    }
    

