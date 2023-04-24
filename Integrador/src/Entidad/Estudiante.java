/*
Crear un objeto de tipo Estudiante,sus atributos van a ser nombre y nota(representando la nota obtenida 
en el final).
 */
package Entidad;

/**
 *
 * @author Carolina Hernández
 */
public class Estudiante {
    
    
    // Atributos
    private String nombre; // Nombre del estudiante
    private double nota; // Nota obtenida en el final

    // Constructor
    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // Métodos de acceso (getters) y modificación (setters) para los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
}
