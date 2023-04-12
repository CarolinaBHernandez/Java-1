/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;


  import java.util.ArrayList;

public class Receta {
    private String nombre;
    private ArrayList<String> ingredientes;

    public Receta(String nombre, ArrayList<String> ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean sePuedePrepararCon(ArrayList<String> ingredientesDisponibles) {
        for (String ingrediente : ingredientes) {
            if (!ingredientesDisponibles.contains(ingrediente)) {
                return false;
            }
        }
        return true;
    }
}
    

