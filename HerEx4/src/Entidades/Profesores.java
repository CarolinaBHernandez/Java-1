/*
 Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
 */
package Entidades;

/**
 *
 * @author Carolina Hernández
 */
public class Profesores extends Persona{
    
    public String dpto;

    public Profesores(String dpto) {
        this.dpto = dpto;
    }

    public Profesores(String dpto, String nombre, String apellidos, int numIdent, String estadoCivil) {
        super(nombre, apellidos, numIdent, estadoCivil);
        this.dpto = dpto;
    }
    
    //Cambio de departamento de un profesor.
    public void cambiarDto(String nuevoDto) {
        this.dpto = nuevoDto;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); 
        System.out.println("Departamento: " +dpto);
    }
    
}
