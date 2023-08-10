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
public class Gato extends Animal {
    
    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void Alimentarse() {
        System.out.println("El gatito "+ nombre + " se alimenta de " + alimento);
    }
}