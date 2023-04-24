/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Estudiante;

/**
 *
 * @author Carolina Hernández
 */
public class EstudianteService {
    
      public Estudiante[] crearEstudiantes() {
        Estudiante[] estudiantes = new Estudiante[8]; // Crear arreglo para 8 estudiantes

        // Crear y asignar estudiantes con sus respectivas notas
        estudiantes[0] = new Estudiante("Liu Kang ", 10);
        estudiantes[1] = new Estudiante("Kung Lao ", 8);
        estudiantes[2] = new Estudiante("Sub Zero ", 5);
        estudiantes[3] = new Estudiante("Shang Tsung ", 7);
        estudiantes[4] = new Estudiante("Shao Kahn ", 4.5);
        estudiantes[5] = new Estudiante("Noob Saibot ", 8);
        estudiantes[6] = new Estudiante("Erron Black ", 9);
        estudiantes[7] = new Estudiante("Sonya Blade ", 3.5);
        return estudiantes;
    }

    public double calcularPromedioNotas(Estudiante[] estudiantes) {
        double sumaNotas = 0.0; // Variable para sumar las notas
        int totalEstudiantes = estudiantes.length; // Obtener el total de estudiantes

        // Iterar sobre el arreglo de estudiantes y sumar las notas
        for (int i = 0; i < totalEstudiantes; i++) {
        sumaNotas = sumaNotas + estudiantes[i].getNota();
        }

        double promedio = sumaNotas / totalEstudiantes; // Calcular el promedio

        return promedio; // Retornar el promedio
    }

    // Método para obtener los nombres de los alumnos con nota mayor al promedio
    public String[] notaMayor(Estudiante[] estudiantes) {
        double promedio = calcularPromedioNotas(estudiantes); // Calcular el promedio
        int contador = 0; // Contador para los alumnos con nota mayor al promedio

        // Contar cuántos alumnos tienen nota mayor al promedio
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                contador++;
            }
        }

        // Crear arreglo para los nombres de los alumnos con nota mayor al promedio
        String[] nombresAlumnos = new String[contador];
        int indice = 0; // Índice para el arreglo de nombres

        // Iterar sobre el arreglo de estudiantes y agregar los nombres de los alumnos
        // con nota mayor al promedio al arreglo de nombres
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                nombresAlumnos[indice] = estudiante.getNombre();
                indice++;
            }
        }

        return nombresAlumnos; // Retornar el arreglo de nombres
    }
// Por último,deberemos mostrar todos los estudiantes con una nota mayor al promedio
    public void mostrarMayor(Estudiante[] estudiantes) {
        String[] nombresAlumnos = notaMayor(estudiantes); // Obtener nombres de alumnos con nota mayor al promedio

        // Iterar sobre el arreglo de nombres y buscar los estudiantes correspondientes
        for (String nombre : nombresAlumnos) {
            for (Estudiante estudiante : estudiantes) {
                if (estudiante.getNombre().equals(nombre)) {
                    // Mostrar información del estudiante con nota mayor al promedio
                    System.out.println("Nombre: " + estudiante.getNombre());
                    System.out.println("Nota: " + estudiante.getNota());
                    System.out.println("-----");
                    break; // Salir del ciclo una vez que se encuentre el estudiante
                }
            }
        }
    }

}
