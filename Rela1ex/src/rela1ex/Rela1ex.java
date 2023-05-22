/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rela1ex;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;

/**
 *
 * @author Carolina Hernández
 */
public class Rela1ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Perro> perros = new ArrayList<>();
        ArrayList<Persona> personas = new ArrayList<>();
        
        // Crear perros
        perros.add(new Perro("Roco", "Labrador", 3, "Grande"));
        perros.add(new Perro("Indio", "Callejero", 10, "Mediano"));
        perros.add(new Perro("Zoro", "Pitbull", 2, "Mediano"));
        perros.add(new Perro("Titan", "Pitbull", 5, "Grande"));
        perros.add(new Perro("Colitas", "Bulldog", 5, "Mediano"));
        perros.add(new Perro("Lee", "Golden", 4, "Mediano"));
        

        // Crear personas
        personas.add(new Persona("Carolina", "Hernandez", 30, 123456));
        personas.add(new Persona("Gabriel", "Capriotti", 29, 789012));
        personas.add(new Persona("Leandro", "Brumat", 2, 456982));
        personas.add(new Persona("Dana", "Merlmestein", 26, 2487122));

       
        
    }
    
}
