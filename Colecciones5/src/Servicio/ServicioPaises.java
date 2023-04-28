/*
 Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
 */
package Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Carolina Hernández
 */
public class ServicioPaises {

    private Set<String> paises;

    public ServicioPaises() {
        this.paises = new TreeSet<>(); //Usar TreeSett en lugar de HashSet para mantener las mayusculas.
    }

    public void crearPais() {
        Scanner leer = new Scanner(System.in);
        String respuesta = "s";

        while (respuesta.equals("s")) {
            System.out.print("Ingrese el nombre del país: ");
            String nombre = leer.nextLine().toLowerCase(); //Para convertir mayus y min

            // Convertir la primera letra a mayúscula y el resto a minúscula
            nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();

            if (this.paises.contains(nombre)) {
                System.out.println("El país ya existe en la lista.");
            } else {
                this.paises.add(nombre);
                System.out.println("País agregado.");
            }

            System.out.print("¿Desea ingresar otro país? (s/n): ");
            respuesta = leer.nextLine().toLowerCase();
        }

        System.out.println("\nPaíses guardados:");
        this.paises.forEach((pais) -> {
            System.out.println(pais);
        });
        System.out.println();
    }
    //Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
    //cómo se ordena un conjunto.

    public void ordenarPaises() {

        List<String> listaPaises = new ArrayList<>(this.paises);
        Collections.sort(listaPaises);

        System.out.println("Países en orden alfabético:");
        listaPaises.forEach((pais) -> {
            System.out.println(pais);
        });
    }


    /* FORMA CORTA: 
        System.out.println("Países en orden alfabético:");
        for (String pais : new TreeSet<>(paises)) {
            System.out.println(pais);
        }
    }*/
    
    
    public void borrarPais() {
        Scanner leer = new Scanner(System.in);

        System.out.print("\nIngrese el nombre del país que desea borrar: ");
        String nombre = leer.nextLine();

        Iterator<String> it = this.paises.iterator();
        boolean encontrado = false;

        while (it.hasNext()) {
            String pais = it.next();
            if (pais.equalsIgnoreCase(nombre)) {
                it.remove();
                encontrado = true;
                System.out.println("El país ha sido borrado.");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El país no se encuentra en la lista.");
        }

        System.out.println("\nPaíses guardados:");
        this.paises.forEach((pais) -> {
            System.out.println(pais);
        });
        System.out.println();
    }
}
