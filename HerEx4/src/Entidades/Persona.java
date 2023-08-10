/*
 • Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
 */
package Entidades;

/**
 *
 * @author Carolina Hernández
 */
public class Persona {
    
    protected String nombre;
    protected String apellidos;
    protected int numIdent;
    protected String estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, int numIdent, String estadoCivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numIdent = numIdent;
        this.estadoCivil = estadoCivil;
    }
    
// Cambio del estado civil de una persona.
  public void cambioEC(String nuevoEC) {
        this.estadoCivil = nuevoEC;
    } 
   public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Número de identificación: " + numIdent);
        System.out.println("Estado civil: " + estadoCivil);
    }
}
