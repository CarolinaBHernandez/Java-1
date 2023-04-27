/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones3;

import Servicio.ServicioAlumno;
import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */
public class Colecciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioAlumno servAlum = new ServicioAlumno();
        servAlum.crearAlumnos();

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el nombre del alumno/a para calcular su nota final: ");
        String nombreAlumno = leer.nextLine();

        double promedio = servAlum.notaFinal(nombreAlumno);

        if (promedio >= 0) {
            System.out.println("El promedio de notas del alumno/a " + nombreAlumno + " es: " + promedio);
        }
    }

}
