/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaex2;


import Entidades.Cine;
import Entidades.Espectador;
import Entidades.Pelicula;
import java.util.Random;



/**
 *
 * @author Carolina Hernández
 */
public class Relaex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //Crear pelicula
        Pelicula pelicula = new Pelicula("Chucky", 90.0, 18, "Don Mancini");

        // Crear cine
        Cine cine = new Cine(1000.0, pelicula);

    // Generar espectadores y ubicarlos en los asientos
    int cantidadEspectadores = 20; // Cantidad de espectadores que deseas generar
    for (int i = 0; i < cantidadEspectadores; i++) {
        Espectador espectador = generarEspectadorAleatorio();
        cine.ubicarEspectador(espectador);
    }
   
  
    
    // Mostrar la tabla de asientos ocupados y vacíos
    cine.mostrar();
}

private static Espectador generarEspectadorAleatorio() {
    // Generar valores aleatorios para el nombre, edad y dinero del espectador
    String[] nombres = {"Carolina", "María", "Balbina", "Andres", "Marisa"};
    String nombre = nombres[new Random().nextInt(nombres.length)];
    int edad = new Random().nextInt(59) + 10; // Edad entre 10 y 69 años
    double dinero = new Random().nextDouble() * 2000.0; // Dinero entre 0.0 y 2000.0

    // Crear y retornar la instancia de Espectador
    return new Espectador(nombre, edad, dinero);
}
    }


    

