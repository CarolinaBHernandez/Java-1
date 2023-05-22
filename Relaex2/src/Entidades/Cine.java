/*
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada.

- Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
 */
package Entidades;



/**
 *
 * @author Carolina Hernández
 */
public class Cine {

    private Asiento asientos[][];
    private double precio;
    private Pelicula pelicula;
   

    public Cine(double precio, Pelicula pelicula) {
        asientos = new Asiento[8][6];
        this.precio = precio;
        this.pelicula = pelicula;
      
        llenarCine();

    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    private void llenarCine() {
        int fila = asientos.length;
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = new Asiento((char) ('A' + j), fila);
            }
            fila--;
        }
    }

    public boolean hayLugar() {

        boolean hayLugar = false;
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                if (!asientos[i][j].ocupado()) {
                    hayLugar = true;
                    break;
                }
            }
        }
        return hayLugar;
    }

    public Asiento buscarAsientoLibre() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                if (!asientos[i][j].ocupado()) {
                    return asientos[i][j];
                }
            }
        }
        return null; // No se encontró ningún asiento libre
    }
    
    /*public boolean ubicarEspectador(Espectador espectador) {
    if (!espectador.esMayor(pelicula.getEdadMin()) || !espectador.tieneDinero(precio)) {
        return false;
    }

        Asiento asiento = buscarAsientoLibre();
        asiento.setEspectador(espectador);
        return true;
    }*/
    public boolean ubicarEspectador(Espectador espectador) {
    if (!espectador.esMayor(pelicula.getEdadMin()) || !espectador.tieneDinero(precio)) {
        return false;
    }

    Asiento asiento = buscarAsientoLibre();
    if (asiento != null) {
        asiento.setEspectador(espectador);
        return true;
    }
    return false;
}

    public Asiento getAsiento(int fila, char letra) {
        return asientos[asientos.length - fila][letra - 'A' - 1];
    }

    public boolean veLaPelicula(Espectador espectador) {
        return espectador.tieneDinero(precio) && espectador.esMayor(pelicula.getEdadMin());
    }

    public void acomodarEspectador(int fila, char letra, Espectador espectador) {
        Asiento asiento = getAsiento(fila, letra);
        if (asiento != null && !asiento.ocupado()) {
            asiento.setEspectador(espectador);
        }
    }

    public int getFilas() {
        return asientos.length;
    }

    public int getColumnas() {
        return asientos[0].length;
    }

   /*public void mostrar() {
        System.out.println("Información del cine:");
        System.out.println("Película reproducida: " + pelicula.getTitulo());
        System.out.println("Precio de entrada: $" + precio);
        System.out.println();

        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                if (asientos[i][j].ocupado()) {
                    System.out.print("[X]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
    }*/
    

    public void mostrar() {
        System.out.println("Información del cine:");
        System.out.println("Película reproducida: " + pelicula.getTitulo());
        System.out.println("Precio de entrada: $" + precio);
        System.out.println();

        for (int i = 0; i < asientos.length; i++) {
            System.out.print((asientos.length - i) + " ");
            for (int j = 0; j < asientos[i].length; j++) {
                if (asientos[i][j].ocupado()) {
                    System.out.print("[" + (char) ('A' + j) + (asientos.length - i) + "X] ");
                } else {
                    System.out.print("[" + (char) ('A' + j) + (asientos.length - i) + " ] ");
                }
            }
            System.out.println();
        }

    }
}

