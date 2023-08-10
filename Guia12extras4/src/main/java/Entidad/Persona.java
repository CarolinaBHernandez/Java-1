//Persona

package Entidad;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected String identificacion;
    protected String estadoCivil;

    public Persona(String nombre, String apellido, String identificacion, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }
}
