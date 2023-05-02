/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
 */
package Servicio;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */
public class ServicioAlumno {
    
     private ArrayList<Alumno> listaAlumnos; // Lista para almacenar los objetos Alumno
    
    public ServicioAlumno() {
        listaAlumnos = new ArrayList<>();
    }
    

    public void crearAlumnos() {
        Scanner leer = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese el nombre de el/la alumno/a: ");
            String nombre = leer.nextLine();

            // Crear lista para almacenar las notas del alumno
            ArrayList<Integer> notas = new ArrayList<>();
            for (int i = 1; i <= 3; i++) {
                System.out.print("Ingrese la nota " + i + ": ");
                int nota = leer.nextInt();
                leer.nextLine(); // Limpiar el buffer de entrada
                notas.add(nota);
            }

            Alumno alumno = new Alumno(nombre, notas);
            // Agregar el alumno a la lista de alumnos 
            listaAlumnos.add(alumno);
            
            
            System.out.print("¿Desea crear otro/a alumno/a? (s/n): ");
            String opcion = leer.nextLine();
            if (!opcion.equalsIgnoreCase("s")) {
                break; // Salir del bucle si la opción no es "s"
            }
        }
    }
    
    /*Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.*/
    
    public double notaFinal(String nombre) {
    for (Alumno alumno : listaAlumnos) {
        if (alumno.getNombre().equalsIgnoreCase(nombre)) {
            ArrayList<Integer> notas = alumno.getNotas();
            int suma = 0;
            for (int nota : notas) {
                suma = suma + nota;
            }
            double promedio = (double) suma / notas.size();
            return promedio;
        }
    }
    System.out.println("El/La alumno/a " + nombre + " no se encuentra en la lista.");
    return -1; // Se devuelve -1 como indicador de error
    
}
}
    

