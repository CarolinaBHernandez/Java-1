package excollec3;

import Entidades.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */
public class ExCollec3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   // También se creará en el main un HashSet de tipo Libro que guardará todos los libros creados.
        HashSet<Libro> libros = new HashSet ();
        Scanner leer = new Scanner(System.in);
        agregarLibros(libros, leer);
    }
    /*Crear un bucle que crea un objeto Libro pidiéndole al usuario todos sus datos
     y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
     se le pregunta al usuario si quiere crear otro Libro o no.*/
    
      public static void agregarLibros(HashSet<Libro> libros, Scanner leer) {
        boolean seguirAgregando = true;

        while (seguirAgregando) {
            System.out.println("Ingrese el título del libro:");
            String titulo = leer.nextLine();

            System.out.println("Ingrese el autor del libro:");
            String autor = leer.nextLine();

            System.out.println("Ingrese la cantidad de ejemplares del libro:");
            int ejemplares = leer.nextInt();
            leer.nextLine();

            System.out.println("Ingrese la cantidad de ejemplares prestados del libro:");
            int prestados = leer.nextInt();
            leer.nextLine();

            Libro libro = new Libro(titulo, autor, ejemplares, prestados);
            libros.add(libro);

            System.out.println("¿Desea agregar otro libro? (si/no)");
            String respuesta = leer.nextLine().toLowerCase();
            seguirAgregando = respuesta.equals("si");
        }
    }
}
    

