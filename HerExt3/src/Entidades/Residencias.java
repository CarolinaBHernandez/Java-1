/*
Para las residencias se indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si 
posee o no campo deportivo. Realizar un programa en el que se representen todas las relaciones
 */
package Entidades;

/**
 *
 * @author Carolina Hernández
 */
public class Residencias extends Extrahotelero {
    
    protected int cantHabitaciones;
    protected boolean descuentos;
    protected boolean campoDep;

    public Residencias() {
    }

    public Residencias(int cantHabitaciones, boolean descuentos, boolean campoDep) {
        this.cantHabitaciones = cantHabitaciones;
        this.descuentos = descuentos;
        this.campoDep = campoDep;
    }

    public Residencias(int cantHabitaciones, boolean descuentos, boolean campoDep, boolean privado, double cantMetros) {
        super(privado, cantMetros);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentos = descuentos;
        this.campoDep = campoDep;
    }

    public Residencias(int cantHabitaciones, boolean descuentos, boolean campoDep, boolean privado, double cantMetros, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantMetros, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentos = descuentos;
        this.campoDep = campoDep;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuentos() {
        return descuentos;
    }

    public void setDescuentos(boolean descuentos) {
        this.descuentos = descuentos;
    }

    public boolean isCampoDep() {
        return campoDep;
    }

    public void setCampoDep(boolean campoDep) {
        this.campoDep = campoDep;
    }
    
    
}
