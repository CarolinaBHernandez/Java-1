/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herex4;

import Entidades.Empleados;
import Entidades.Estudiantes;
import Entidades.PersonalDeServicio;
import Entidades.Profesores;

/**
 *
 * @author Carolina Hernández
 */
public class HerEx4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Estudiantes estudiante = new Estudiantes("Primero", "Carolina", "Hernandez", 123456789, "Soltera");
        estudiante.mostrarInfo();
        System.out.println();

        Profesores profesor = new Profesores("Matemáticas", "Nariana", "Coronel",987654321, "Soltera");
        profesor.mostrarInfo();
        System.out.println();

        PersonalDeServicio personal = new PersonalDeServicio("Biblioteca", "Daniel", "Gonzales", 567890123, "Casado");
        personal.mostrarInfo();
        System.out.println();

        Empleados empleado = new Empleados(2010, 2, "Ana", "García",456789012,"Soltera");
        empleado.mostrarInfo();
        System.out.println();

        // Realizar operaciones
        estudiante.cambioEC("Casada");
        profesor.cambiarDto("Lenguajes");
        personal.cambiarSeccion("Decanato");
        empleado.reasignarDespacho(5);

        System.out.println("--- Se han realizado los cambios correctamente ---");
        estudiante.mostrarInfo();
        System.out.println();
        profesor.mostrarInfo();
        System.out.println();
        personal.mostrarInfo();
        System.out.println();
        empleado.mostrarInfo();
    }
}
    
    

