//PersonalServicio

package Entidad;

public class PersonalServicio extends Persona {
    private int anioIncorporacion;
    private String despacho;
    private String seccion;

    public PersonalServicio(String nombre, String apellido, String identificacion, String estadoCivil, int anioIncorporacion, String despacho, String seccion) {
        super(nombre, apellido, identificacion, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.despacho = despacho;
        this.seccion = seccion;
    }

    public void trasladarSeccion(String seccion) {
        this.seccion = seccion;
    }

    public void imprimirInformacion() {
        System.out.println("\nPersonal de Servicio:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Identificación: " + getIdentificacion());
        System.out.println("Estado Civil: " + getEstadoCivil());
        System.out.println("Año de Incorporación: " + anioIncorporacion);
        System.out.println("Despacho: " + despacho);
        System.out.println("Sección: " + seccion);
    }
}
