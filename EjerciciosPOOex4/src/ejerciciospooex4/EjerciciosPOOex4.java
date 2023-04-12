/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospooex4;

import Ejercicios.Cocina;
import Ejercicios.Receta;
import java.util.ArrayList;
import java.util.Scanner;



public class EjerciciosPOOex4 {
    public static void main(String[] args) {
        Cocina cocina = new Cocina();

        // Agregamos algunas recetas
        ArrayList<String> ingredientesEnsalada = new ArrayList<String>();
        ingredientesEnsalada.add("Lechuga");
        ingredientesEnsalada.add("Tomate");
        ingredientesEnsalada.add("Cebolla");
        cocina.agregarReceta(new Receta("Ensalada", ingredientesEnsalada));

        ArrayList<String> ingredientesSpaghetti = new ArrayList<String>();
        ingredientesSpaghetti.add("Spaghetti");
        ingredientesSpaghetti.add("Carne picada");
        ingredientesSpaghetti.add("Tomate");
        cocina.agregarReceta(new Receta("Spaghetti a la boloñesa", ingredientesSpaghetti));

        ArrayList<String> ingredientesPizza = new ArrayList<String>();
        ingredientesPizza.add("Masa de pizza");
        ingredientesPizza.add("Tomate");
        ingredientesPizza.add("Queso mozzarella");
        cocina.agregarReceta(new Receta("Pizza margherita", ingredientesPizza));

        // Obtenemos los ingredientes disponibles en la cocina
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa los ingredientes disponibles separados por coma: ");
        String[] ingredientesArray = scanner.nextLine().split(",");
        ArrayList<String> ingredientesDisponibles = new ArrayList<String>();
        for (String ingrediente : ingredientesArray) {
            ingredientesDisponibles.add(ingrediente.trim());
        }

        // Obtenemos la lista de recetas disponibles
        ArrayList<Receta> recetasDisponibles = cocina.recetasDisponibles(ingredientesDisponibles);

        // Imprimimos las recetas disponibles
        if (recetasDisponibles.size() == 0) {
            System.out.println("Lo siento, no hay recetas disponibles con los ingredientes que tienes.");
        } else if (recetasDisponibles.size() == 1) {
            System.out.println("La receta disponible es:");
            Receta receta = recetasDisponibles.get(0);
            System.out.println("- " + receta.getNombre());
        } else {
            System.out.println("Las recetas disponibles son:");
            for (Receta receta : recetasDisponibles) {
                System.out.println("- " + receta.getNombre());
            }
        }
    }
}