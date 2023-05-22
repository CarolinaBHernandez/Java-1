/*
 El sistema de votación de Egg tiene una clase llamada Alumno con los siguientes atributos:

nombre completo, DNI y cantidad de votos.
 */
package Entidades;

/**
 *
 * @author Carolina Hernández
 */
public class Alumno {
    
    private String nombreCompleto;
    private int dni;
    private int cantidadVotos;

    public Alumno() {
    }

       public Alumno(String nombreCompleto, int dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantidadVotos = 0;
    }
   
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }
    
    
}
