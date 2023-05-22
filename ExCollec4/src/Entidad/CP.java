/*

4. Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
numero.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al
usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del H
 */
package Entidad;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */
public class CP {

    HashMap<String, Integer> codigosPostales = new HashMap<>();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void agregarCP(HashMap<Integer, String> codigosPostales) {
        System.out.println("Ingrese el código postal: ");
        int cp = leer.nextInt();
        System.out.println("Ahora, su correspondiente localidad: ");
        String localidad = leer.next();
        codigosPostales.put(cp, localidad);
    }

    public void mostrarLocalidades(HashMap<Integer, String> codigosPostales) {
        System.out.println(codigosPostales);
    }

    public void buscarLocalidad(HashMap<Integer, String> codigosPostales) {
        System.out.println("Ingrese el código postal a buscar: ");
        int buscar = leer.nextInt();
        if (codigosPostales.containsKey(buscar)) {
            System.out.println("Se encontró la localidad con el código postal n° " + buscar + ".\nLa localidad es " + codigosPostales.get(buscar));
        } else {
            System.out.println("Lo siento, el código postal n° " + buscar + " no se encuentra en la lista");
        }
    }
    public void borrarLocalidades(HashMap<Integer, String> codigosPostales) {
        System.out.println("Ingrese el código postal para borrar la localidad en la lista");
        int borrar = leer.nextInt();
        if (codigosPostales.containsKey(borrar)) {
            codigosPostales.remove(borrar);
            System.out.println("Localidad eliminada");
        } else {
            System.out.println("El código ingresado no se encuentra en la lista");
        }
    }
}



