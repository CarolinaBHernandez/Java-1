/*
Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento 
y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. 
Retorna true si la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.
 */
package Servicio;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */
public class PersonaService {

    private Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        System.out.println("Ingrese nombre de la persona: ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese su fecha de nacimiento:");
        Date fN = fechaNacimiento();
        return new Persona(nombre, fN);
    }

    public Date fechaNacimiento() {
        System.out.println("Día (DD):");
        int dia = leer.nextInt();
        System.out.println("Mes (MM):");
        int mes = leer.nextInt() - 1;
        System.out.println("Año (AAAA):");
        int anio = leer.nextInt() - 1900;
        return new Date(anio, mes, dia);
    }

    public Date fechaActual() {
        return new Date();
    }

    public int calcularEdad(Date fechaActual, Persona p1) {
        double edad;

        if (fechaActual.getTime() < p1.getFechaNacimiento().getTime()) {
            edad = (Math.floor(Math.round((fechaActual.getTime() - p1.getFechaNacimiento().getTime()) / 3.154e+10) - 1));
        } else {
            edad = (Math.floor(Math.round((fechaActual.getTime() - p1.getFechaNacimiento().getTime()) / 3.154e+10)));
        }
        return (int) edad;
    }

    public boolean menorQue(Persona p1) {
        System.out.println("Ingrese la edad base: ");
        int edadBase = leer.nextInt();
        boolean menorque = false;
        Date hoy = fechaActual();
        int edad = calcularEdad(hoy, p1);
        if (edad < edadBase) {
            return menorque = true;
        } else {
            return menorque = false;
        }
    }

    public void mostrarPersona(Persona p) {
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Fecha de Nacimiento: " + p.getFechaNacimiento());
        System.out.println("Edad: " + calcularEdad(fechaActual(), p));
    }
}
