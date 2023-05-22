/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */
public class Jugador {

    private String nombre;
    private String apellido;
    private Integer posicion;
    private Integer numero;

    public Jugador(String nombre, String apellido, Integer posicion, Integer numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.numero = numero;
    }

    Jugador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public Integer getNumero() {
        return numero;
    }
    public static Jugador crearJugador() {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese el nombre del jugador: ");
    String nombre = leer.next();
    System.out.println("Ingrese el apellido del jugador: ");
    String apellido = leer.next();
    System.out.println("Ingrese el numero del jugador: ");
    int numero = leer.nextInt();
    System.out.println("Ingrese la posicion del jugador: ");
    int posicion = leer.nextInt();
    return new Jugador(nombre, apellido, posicion, numero);
}
}
