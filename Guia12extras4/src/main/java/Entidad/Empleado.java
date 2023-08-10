//Empleado

package Entidad;

public class Empleado extends Persona {
    private int anioIncorporacion;
    private int despacho;

    public Empleado(String nombre, String apellido, String identificacion, String estadoCivil, int anioIncorporacion, int despacho) {
        super(nombre, apellido, identificacion, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.despacho = despacho;
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public int getDespacho() {
        return despacho;
    }

    public void setDespacho(int nuevoDespacho) {
        despacho = nuevoDespacho;
    }
}

