/*
Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
 */
package Entidades;

/**
 *
 * @author Carolina Hernández
 */
public class Hotel4 extends Hoteles{
    
    protected String gimnasio;
    protected String nomResto;
    protected int capacidadResto;

    public Hotel4() {
    }

    public Hotel4(String gimnasio, String nomResto, int capacidadResto) {
        this.gimnasio = gimnasio;
        this.nomResto = nomResto;
        this.capacidadResto = capacidadResto;
    }

    public Hotel4(String gimnasio, String nomResto, int capacidadResto, int cantHabitaciones, int numCamas, int cantPisos, double precioHab) {
        super(cantHabitaciones, numCamas, cantPisos, precioHab);
        this.gimnasio = gimnasio;
        this.nomResto = nomResto;
        this.capacidadResto = capacidadResto;
    }

    public Hotel4(String gimnasio, String nomResto, int capacidadResto, int cantHabitaciones, int numCamas, int cantPisos, double precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, numCamas, cantPisos, precioHab, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nomResto = nomResto;
        this.capacidadResto = capacidadResto;
    }

    public String isGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNomResto() {
        return nomResto;
    }

    public void setNomResto(String nomResto) {
        this.nomResto = nomResto;
    }

    public int getCapacidadResto() {
        return capacidadResto;
    }

    public void setCapacidadResto(int capacidadResto) {
        this.capacidadResto = capacidadResto;
    }
    
    
}
