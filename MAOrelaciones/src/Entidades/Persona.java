/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package Entidades;

/**
 *
 * @author Carolina Hernández
 */
public class Persona {
     private String nombre;
    private String apellido;
    private Dni dni;
    
    public Persona(String nombre, String apellido, char serie, int numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = new Dni(serie, numero);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public Dni getDni() {
        return dni;
    }
}

