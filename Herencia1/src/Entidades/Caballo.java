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
public class Caballo extends Animal {
    
    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza); //llama al constructor de la clase Animal
    }
    
    @Override
    public void Alimentarse() {
        System.out.println("El caballuki "+ nombre + " se alimenta de " + alimento);
    }
}