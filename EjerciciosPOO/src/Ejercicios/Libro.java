/*
Crear una clase llamada Libro que contenga los siguientes atributos: 
ISBN, TÃ­tulo, Autor, NÃºmero de pÃ¡ginas, y un constructor con todos los atributos pasados por parÃ¡metro 
y un constructor vacÃ­o.
Crear un mÃ©todo para cargar un libro pidiendo los datos al usuario y luego informar mediante otro mÃ©todo el nÃºmero de ISBN, el tÃ­tulo, el autor del libro y el nÃºmero de pÃ¡ginas.
 */
package Ejercicios;

/**
 *
 * @author User
 */


    
import java.util.Scanner;

public class Libro {
    public String ISBN;
    public String titulo;
    public String autor;
    public int numPaginas;
    
    // Constructor vacio 
    public Libro(){
    } 
    
    // Constructor con atributos 
    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    
        
    // Carga de datos 
    public void cargarLibro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nÃºmero de ISBN: ");
        this.ISBN = scanner.nextLine();
        System.out.print("Ingrese el tÃ­tulo del libro: ");
        this.titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        this.autor = scanner.nextLine();
        System.out.print("Ingrese el nÃºmero de pÃ¡ginas del libro: ");
        this.numPaginas = scanner.nextInt();
    }
    
    // Imprimir datos 
    public void mostrarDatos() {
        System.out.println("NÃºmero de ISBN: " + this.ISBN);
        System.out.println("TÃ­tulo del libro: " + this.titulo);
        System.out.println("Autor del libro: " + this.autor);
        System.out.println("NÃºmero de pÃ¡ginas del libro: " + this.numPaginas);
    }
}