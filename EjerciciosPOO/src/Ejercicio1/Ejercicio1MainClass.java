/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import Ejercicios.Libro;

/**
 *
 * @author User
 */
public class Ejercicio1MainClass {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
    Libro libro = new Libro();
    libro.cargarLibro();
    libro.mostrarDatos();
    }
    
}
