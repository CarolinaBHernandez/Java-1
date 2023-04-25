/*
1- Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */
public class RazaServicio {

    private Scanner leer;
    private ArrayList<String> razas;

    public RazaServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.razas = new ArrayList();
    }

    public void ingresarRaza() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese la raza de su perro: ");
            String raza = leer.next();
            razas.add(raza);
            System.out.println("¿Desea ingresar otra raza? (s/n)");
            String respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }
        System.out.println("Razas de perros guardadas: ");
        System.out.println(razas.toString());

    }

    /*2- Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.*/

    public void eliminarRaza() {
        System.out.println("Ingrese la raza del perro que desea eliminar: ");
        String razaEliminar = leer.next();
        boolean encontrado = false;
        Iterator<String> iterator = razas.iterator();
        while (iterator.hasNext()) {
            String raza = iterator.next();
            if (raza.equalsIgnoreCase(razaEliminar)) {
                iterator.remove();
                encontrado = true;
                System.out.println("La raza \"" + razaEliminar + "\" ha sido eliminada.");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("La raza \"" + razaEliminar + "\" no se encuentra en la lista.");
        }

        ordenarRazas();
    }

    public void ordenarRazas() {
        Collections.sort(razas);
        System.out.println("Lista de raza de perros ordenada: ");
        System.out.println(razas.toString());
    }
}
