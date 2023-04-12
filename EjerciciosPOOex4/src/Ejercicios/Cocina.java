/*
Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, crea métodos para agregar nuevas
recetas a la lista, para buscar una receta por nombre y para obtener la lista de recetas que se pueden
preparar con los ingredientes disponibles en la cocina.
 */
package Ejercicios;




import java.util.ArrayList;

public class Cocina {
    private ArrayList<Receta> recetas;

    public Cocina() {
        recetas = new ArrayList<>();
    }

    public void agregarReceta(Receta receta) {
        recetas.add(receta);
    }

    public Receta buscarReceta(String nombre) {
        for (Receta receta : recetas) {
            if (receta.getNombre().equals(nombre)) {
                return receta;
            }
        }
        return null;
    }

    public ArrayList<Receta> recetasDisponibles(ArrayList<String> ingredientesDisponibles) {
        ArrayList<Receta> recetasDisponibles = new ArrayList<>();

        for (Receta receta : recetas) {
            if (receta.sePuedePrepararCon(ingredientesDisponibles)) {
                recetasDisponibles.add(receta);
            }
        }

        return recetasDisponibles;
    }
}