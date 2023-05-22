/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja.
 */
package rela2;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */
public class Rela2 {

    private static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        ArrayList<Jugador> jugadores = new ArrayList();


        System.out.println("Ingrese la cantidad de jugadores del 1 al 6:");
        int cantidadJugadores = leer.nextInt();
        if (cantidadJugadores<1||cantidadJugadores>6) {
            cantidadJugadores=6;
        }
        for (int i = 0; i < cantidadJugadores; i++) {
            Jugador a = new Jugador(i + 1);
            jugadores.add(a);
        }

        System.out.println("Se va a preparar el revolver para el juego");
        Revolver r = new Revolver();
        r.llenarRevolver();

        System.out.println("Revolver cargado. Se da inicio al juego");
        Juego j = new Juego();
        j.llenarJuego(jugadores, r);
       

        boolean juegoSigue = true;
        int turno = 0;
        while (juegoSigue) {
            if (turno == (cantidadJugadores)){
                turno = 0;
            }
            System.out.println("El " + j.getJugadores().get(turno).getNombre() + " dispara");
            juegoSigue = j.ronda(turno);
            if (juegoSigue) {
                System.out.println("El " + j.getJugadores().get(turno).getNombre() + " se salva.");
            } else {
                System.out.println("El " + j.getJugadores().get(turno).getNombre() + " te mojaste. ");
                System.out.println("Juego finalizado");
            }
            turno++;
        }
        System.out.println("");
    }
}
   

