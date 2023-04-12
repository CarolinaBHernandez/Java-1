/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
Se deberá́ definir además dos constructores: uno vacío que inicializa el título y el autor a cadenas 
vacías y otro que reciba como parámetros el título y el autor de la canción. 
Se deberán además definir los métodos getters y setters correspondientes.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Cancion {
    
    public String titulo;
    public String autor;

    public Cancion() {
        this.titulo = "";
        this.autor = "";
        
    } 
    
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
     public void llenarCancion() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el titulo de la cancion: ");
        setTitulo(leer.nextLine());
        System.out.print("Ingrese el autor de la cancion: ");
        setAutor(leer.nextLine());
    
     }  
}
