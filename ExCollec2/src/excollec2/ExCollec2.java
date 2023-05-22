/*
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.

 */
package excollec2;

import Entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */
public class ExCollec2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<CantanteFamoso> cantantes = new ArrayList<>();
        cantantes.add(new CantanteFamoso("Patricio Rey y sus redonditos de ricota", "Oktubre"));
        cantantes.add(new CantanteFamoso("La Renga", "Despedazado por mil partes"));
        cantantes.add(new CantanteFamoso("Callejeros", "Rocanroles sin destino"));
        cantantes.add(new CantanteFamoso("Hermética", "Ácido Argentino"));
        cantantes.add(new CantanteFamoso("Sumo", "After Chabón"));

        Iterator<CantanteFamoso> iterador = cantantes.iterator();
        while (iterador.hasNext()) {
            CantanteFamoso cantante = iterador.next();
            System.out.println("\nNombre la banda: " + cantante.getNombre() + "\nDisco con más ventas: " + cantante.getDiscoConMasVentas());
        }

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("\n-------MENU-------");
            System.out.println("1. Agregar un cantante");
            System.out.println("2. Mostrar todos los cantantes");
            System.out.println("3. Eliminar un cantante");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    // Agregar un cantante
                    System.out.println("Ingrese el nombre del cantante:");
                    scanner.nextLine();
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el disco con más ventas del cantante:");
                    String disco = scanner.nextLine();
                    CantanteFamoso cantante = new CantanteFamoso(nombre, disco);
                    cantantes.add(cantante);
                    System.out.println("Cantante agregado correctamente.");
                    break;
                case 2:
                    // Mostrar todos los cantantes
                    System.out.println("Lista de cantantes:");
                    for (CantanteFamoso c : cantantes) {
                        System.out.println("Nombre del cantante: " + c.getNombre() + "- Disco con más ventas: " + c.getDiscoConMasVentas());
                    }
                    break;
                case 3:
                    // Eliminar un cantante
                    System.out.println("Ingrese el nombre del cantante a eliminar:");
                    scanner.nextLine();
                    String eliminarNombre= scanner.nextLine();
                    boolean eliminado = false;
                    for (int i = 0; i < cantantes.size(); i++) {
                        if (cantantes.get(i).getNombre().equals(eliminarNombre)) {
                            cantantes.remove(i);
                            eliminado = true;
                            System.out.println("Cantante eliminado correctamente.");
                            break;
                        }
                    }
                    if (!eliminado) {
                        System.out.println("No se encontró el cantante a eliminar.");
                    }
                    break;
                case 4:
                    // Salir
                    System.out.println("Saliste del menu");
                    break;
                default:
                    // Opción inválida
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }

}
