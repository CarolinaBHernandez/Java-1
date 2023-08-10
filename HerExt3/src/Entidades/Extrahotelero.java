/*
 En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. Realizar un programa en el que se representen todas las relaciones
descriptas.
 */
package Entidades;

/**
 *
 * @author Carolina Hernández
 */
public class Extrahotelero extends Alojamiento{
    
    protected boolean privado;
    protected double cantMetros;

    public Extrahotelero() {
    }

    public Extrahotelero(boolean privado, double cantMetros) {
        this.privado = privado;
        this.cantMetros = cantMetros;
    }

    public Extrahotelero(boolean privado, double cantMetros, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.cantMetros = cantMetros;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getCantMetros() {
        return cantMetros;
    }

    public void setCantMetros(double cantMetros) {
        this.cantMetros = cantMetros;
    }
    
    
}
