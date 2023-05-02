/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */
public class ServicioPelicula {

    /*En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.*/
    private ArrayList<Pelicula> peliculas;

    public ServicioPelicula() {
        this.peliculas = new ArrayList<>();
    }

    public void agregarPeliculas() {
        Scanner leer = new Scanner(System.in);
        String respuesta;

        do {
            System.out.print("Ingrese el título de la película: ");
            String titulo = leer.nextLine();

            System.out.print("Ingrese el nombre del director: ");
            String director = leer.nextLine();

            System.out.print("Ingrese la duración de la película en horas (HH,MM): ");
            double duracion = leer.nextDouble();
            leer.nextLine();

            Pelicula pelicula = new Pelicula(titulo, director, duracion);
            peliculas.add(pelicula);

            System.out.print("¿Desea agregar otra película? (s/n): ");
            respuesta = leer.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));

        System.out.println(" ");
    }
    //Mostrar en pantalla todas las películas.

    public void mostrarPeliculas() {
        System.out.println("---------LISTA DE PELICULAS---------");
        for (int i = 0; i < peliculas.size(); i++) {
            Pelicula pelicula = peliculas.get(i);
            System.out.println("Título: " + pelicula.getTitulo());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Duración: " + pelicula.getDuracion() + " horas");
            System.out.println();

        }
    }

    //Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void mostrarTitulosLargos() {
        System.out.println("--------- PELICULAS QUE DURAN MÀS DE UNA HORA ---------");
        for (int i = 0; i < peliculas.size(); i++) {
            Pelicula pelicula = peliculas.get(i);
            if (pelicula.getDuracion() > 1) {
                System.out.println("Título: " + pelicula.getTitulo());
                System.out.println("Director: " + pelicula.getDirector());
                System.out.println("Duración: " + pelicula.getDuracion() + " horas");
                System.out.println();
            }
        }
    }

    //Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
    public void mayorMenor() {
        System.out.println("--------- PELICULAS ORDENADAS DE MAYOR A MENOR ---------");
        Collections.sort(peliculas, Comparator.comparing(Pelicula::getDuracion).reversed());
        peliculas.stream().map((pelicula) -> {
            System.out.println("Título: " + pelicula.getTitulo());
            return pelicula;
        }).map((pelicula) -> {
            System.out.println("Director: " + pelicula.getDirector());
            return pelicula;
        }).map((pelicula) -> {
            System.out.println("Duración: " + pelicula.getDuracion() + " horas");
            return pelicula;
        }).forEachOrdered((_item) -> {
            System.out.println();
        });
    }
    
    /*public void mayorMenor() {
    Collections.sort(peliculas, new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return Double.compare(p2.getDuracion(), p1.getDuracion());
        }
    });
}*/
    
     //Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
//pantalla.
public void menorMayor() {
        System.out.println("--------- PELICULAS ORDENADAS DE MENOR A MAYOR ---------");
        Collections.sort(peliculas, Comparator.comparing(Pelicula::getDuracion));
        peliculas.stream().map((pelicula) -> {
            System.out.println("Título: " + pelicula.getTitulo());
            return pelicula;
        }).map((pelicula) -> {
            System.out.println("Director: " + pelicula.getDirector());
            return pelicula;
        }).map((pelicula) -> {
            System.out.println("Duración: " + pelicula.getDuracion() + " horas");
            return pelicula;
        }).forEachOrdered((_item) -> {
            System.out.println();
        });
    }


    //Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    public void ordenarTitulo() {
        System.out.println("--------- PELICULAS ORDENADAS POR TITULO ALFABETICAMENTE ---------");
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getTitulo().compareToIgnoreCase(p2.getTitulo());
            }
        });
    }

    //Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    public void ordenarDirector() {
        System.out.println("--------- PELICULAS ORDENADAS ALFABETICAMENTE POR EL NOMBRE DEL DIRECTOR ---------");
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getDirector().compareToIgnoreCase(p2.getDirector());
            }
        });
    }
}

