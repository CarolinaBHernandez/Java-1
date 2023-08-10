//PruebaGestionFacultad

package ejercicios.guia12extras4;

import Entidad.*;

import java.util.Scanner;

public class PruebaGestionFacultad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del estudiante:");
        System.out.print("Nombre: ");
        String nombreEstudiante = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellidoEstudiante = scanner.nextLine();
        System.out.print("DNI: ");
        String dniEstudiante = scanner.nextLine();
        System.out.print("Estado civil: ");
        String estadoCivilEstudiante = scanner.nextLine();
        System.out.print("Curso: ");
        String cursoEstudiante = scanner.nextLine();

        Estudiante estudiante = new Estudiante(nombreEstudiante, apellidoEstudiante, dniEstudiante, estadoCivilEstudiante, cursoEstudiante);
        estudiante.imprimirInformacion();

        System.out.println("\nIngrese los datos del profesor:");
        System.out.print("Nombre: ");
        String nombreProfesor = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellidoProfesor = scanner.nextLine();
        System.out.print("DNI: ");
        String dniProfesor = scanner.nextLine();
        System.out.print("Estado civil: ");
        String estadoCivilProfesor = scanner.nextLine();
        System.out.print("Año de contratación: ");
        int anioContratacionProfesor = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Despacho: ");
        String despachoProfesor = scanner.nextLine();
        System.out.print("Departamento: ");
        String departamentoProfesor = scanner.nextLine();

        Profesor profesor = new Profesor(nombreProfesor, apellidoProfesor, dniProfesor, estadoCivilProfesor, anioContratacionProfesor, despachoProfesor, departamentoProfesor);
        profesor.imprimirInformacion();

        System.out.println("\nIngrese los datos del personal de servicio:");
        System.out.print("Nombre: ");
        String nombrePersonalServicio = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellidoPersonalServicio = scanner.nextLine();
        System.out.print("DNI: ");
        String dniPersonalServicio = scanner.nextLine();
        System.out.print("Estado civil: ");
        String estadoCivilPersonalServicio = scanner.nextLine();
        System.out.print("Año de contratación: ");
        int anioContratacionPersonalServicio = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Oficina: ");
        String oficinaPersonalServicio = scanner.nextLine();
        System.out.print("Sección: ");
        String seccionPersonalServicio = scanner.nextLine();

        PersonalServicio personalServicio = new PersonalServicio(nombrePersonalServicio, apellidoPersonalServicio, dniPersonalServicio, estadoCivilPersonalServicio, anioContratacionPersonalServicio, oficinaPersonalServicio, seccionPersonalServicio);
        personalServicio.imprimirInformacion();

        scanner.close();
    }
}
