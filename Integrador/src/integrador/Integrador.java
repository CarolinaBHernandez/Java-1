/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;

import Entidad.Estudiante;
import Servicio.EstudianteService;
import java.util.Arrays;

/**
 *
 * @author Carolina Hernández
 */
public class Integrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        // Crear instancia de EscuelaService
        EstudianteService es = new EstudianteService();

        // Crear estudiantes
        Estudiante[] estudiantes = es.crearEstudiantes();
                 
        // Calcular y mostrar promedio de notas de todo el curso
        double promedioCurso = es.calcularPromedioNotas(estudiantes);
        System.out.println("Promedio del curso: " + promedioCurso);

        // Obtener nombres de alumnos con nota mayor al promedio
        String[] nombresAlumnos = es.notaMayor(estudiantes);
        System.out.println("Alumnos con nota mayor al promedio: " + Arrays.toString(nombresAlumnos));

        // Mostrar información de estudiantes con nota mayor al promedio
        es.mostrarMayor(estudiantes);
    

    }
    
}
