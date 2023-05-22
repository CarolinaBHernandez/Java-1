/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Carolina Hernández
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer documento;
    private Perro perro; // Un solo perro asignado a la persona

    public Persona() {
    }
            
    public Persona(String nombre, String apellido, Integer edad, Integer documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = null;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }
    
    public Perro getPerro() {
        return perro;
    }
    
    public void setPerro(Perro perro) {
        this.perro = perro;
    }   
    
    
    public void mostrarInfo() {
    System.out.println("Datos de la persona:");
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido: " + apellido);
    System.out.println("Edad: " + edad);
    System.out.println("Documento: " + documento);
    System.out.println(" ");
    System.out.println("Datos del Firulais:");
    System.out.println("Nombre: " + perro.getNombre());
    System.out.println("Raza: " + perro.getRaza());
    System.out.println("Edad: " + perro.getEdad());
    System.out.println("Tamaño: " + perro.getTamaño());
    System.out.println();
}

}
