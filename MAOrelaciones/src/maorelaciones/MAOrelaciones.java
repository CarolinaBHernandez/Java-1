/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maorelaciones;

import Entidades.Persona;

/**
 *
 * @author Carolina Hernández
 */
public class MAOrelaciones {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Persona persona = new Persona("Carolina", "Hernandez", 'F', 12345678);
        
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("DNI: " + persona.getDni().getSerie() + "-" + persona.getDni().getNumero());
    }
}
