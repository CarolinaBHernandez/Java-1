/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Carolina Hernández
 */
public class Equipo {

    private ArrayList<Jugador> jugadores;

    public Equipo() {
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador() {
        Jugador jugador = Jugador.crearJugador();
        jugadores.add(jugador);
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

}








