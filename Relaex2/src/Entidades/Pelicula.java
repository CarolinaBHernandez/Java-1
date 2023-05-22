/*
Luego, de las películas nos interesa saber
el título, duración, edad mínima y director.
 */
package Entidades;

/**
 *
 * @author Carolina Hernández
 */
public class Pelicula {

    private String titulo;
    private double duracion;
    private int edadMin;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, double duracion, int edadMin, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMin = edadMin;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(int edadMin) {
        this.edadMin = edadMin;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

  
}
