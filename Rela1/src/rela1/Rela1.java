/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package rela1;

import Entidades.Perro;
import Entidades.Persona;


/**
 *
 * @author Carolina Hernández
 */
public class Rela1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Perro p1 = new Perro();
        p1.setNombre("Indio");
        p1.setRaza("Callejero");
        p1.setEdad(10);
        p1.setTamaño("Mediano");

        Perro p2 = new Perro();
        p2.setNombre("Zoro");
        p2.setRaza("Pitbull");
        p2.setEdad(2);
        p2.setTamaño("Mediano");

        Persona persona1 = new Persona("Carolina", "Hernandez", 30, 12345678);
        persona1.setPerro(p1);

        Persona persona2 = new Persona("Gabriel", "Capriotti", 29, 2345678);
        persona2.setPerro(p2);

        persona1.mostrarInfo();
        persona2.mostrarInfo();
    }
}

