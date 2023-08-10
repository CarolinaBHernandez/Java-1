/*
Para cada Alquiler se guarda: el nombre, documento del cliente, la fecha de alquiler, fecha de devolución,
la posición del amarre y el barco que lo ocupará.
 */
package Entidades;



import java.util.Calendar;
import java.util.GregorianCalendar;
public class Alquiler {

    private GregorianCalendar fInicio, fFin;
    private int posicionAmarre;
    private Barco barco;
    private double precioAlquiler;
    private Cliente cliente;

    public Alquiler(Cliente cliente, int diaInicio, int mesInicio, int anioInicio, int diaFin, int mesFin, int anioFin, int posicionAmarre, Barco barco) {
        this.cliente = cliente;
        fInicio = new GregorianCalendar(anioInicio, mesInicio, diaInicio);
        fFin = new GregorianCalendar(anioFin, mesFin, diaFin);
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
        precioAlquiler = 0.0;
    }

    // Getters

    public Cliente getCliente() {
        return cliente;
    }
        
    public String getfInicio() { // Muestra la fecha formateada: DD/MM/AA
        return fInicio.get(Calendar.DATE) + "/" + fInicio.get(Calendar.MONTH) + "/" + fInicio.get(Calendar.YEAR);
    }

    public String getfFin() { // Muestra la fecha formateada: DD/MM/AA
        return fFin.get(Calendar.DATE) + "/" + fFin.get(Calendar.MONTH) + "/" + fFin.get(Calendar.YEAR);
    }
    
    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }
    


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
        
    public void setfInicio(int diaInicio, int mesInicio, int anioInicio) {
        fInicio = new GregorianCalendar(anioInicio, mesInicio, diaInicio);
    }

    public void setfFin(int diaFin, int mesFin, int anioFin) {
        fFin = new GregorianCalendar(anioFin, mesFin, diaFin);
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    // Calcula la diferencia en dias entre dos fechas
    private long diasOcupados() {
        long aux = fFin.getTimeInMillis() - fInicio.getTimeInMillis();
        long dias = aux / (1000 * 60 * 60 * 24);
        return dias;
    }

    // Multiplica dÃ­as de ocupaciÃ³n
    public void calculaPrecioAlquiler(Barco a) {
        // Dias ocupados * Precio del amarre segÃºn el tipo de barco * valor fijo
        precioAlquiler = diasOcupados() * a.calculaPrecioAmarre() + 2;
    }


    public String toString() {
        return "***** Alquiler ******" + "\nNombre: " + cliente.getNombre()
                + " | DNI: " + cliente.getDni()
                + " | TelÃ©fono: " + cliente.getTelefono()
                + "\nFecha de inicio: " + getfInicio()
                + " | Fecha de fin: " + getfFin()
                + "\nPosicion de amarre: " + posicionAmarre
                + " | Barco: " + barco.getMatricula();
    }

}