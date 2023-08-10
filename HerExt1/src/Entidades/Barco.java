/*
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
 */
package Entidades;

/**
 *
 * @author Carolina Hernández
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author La Doble G
 */
public class Barco {
    private String matricula;
    private int eslora;
    private GregorianCalendar anioFabricacion;
    private double precioAmarre;

    public Barco(String matricula, int eslora, int anioFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = new GregorianCalendar(anioFabricacion, 12, 31);
        precioAmarre = 0.0;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion.get(Calendar.YEAR);
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = new GregorianCalendar(anioFabricacion, 12, 31);
    }

    public void impuestoTipoBarco(double precioAmarre) {
        this.precioAmarre = this.precioAmarre + precioAmarre;
    }

    public double calculaPrecioAmarre() {
        precioAmarre = eslora * 10;
        return precioAmarre;
    }
    public String toString() {
        return "***** Barco ******\n" + "MatrÃ­cula: " + matricula
                + " | Metros de eslora: " + eslora
                + "\nAnio de fabricaciÃ³n: " + getAnioFabricacion();
    }
   
}

