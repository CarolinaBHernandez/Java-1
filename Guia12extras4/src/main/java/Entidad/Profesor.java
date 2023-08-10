//Profesor

package Entidad;

public class Profesor extends Persona {
    private int anioIncorporacion;
    private String despacho;
    private String departamento;

    public Profesor(String nombre, String apellido, String identificacion, String estadoCivil, int anioIncorporacion, String despacho, String departamento) {
        super(nombre, apellido, identificacion, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.despacho = despacho;
        this.departamento = departamento;
    }

    public void cambiarDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void reasignarDespacho(String despacho) {
        this.despacho = despacho;
    }

    public void imprimirInformacion() {
        System.out.println("\nProfesor:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Identificación: " + getIdentificacion());
        System.out.println("Estado Civil: " + getEstadoCivil());
        System.out.println("Año de Incorporación: " + anioIncorporacion);
        System.out.println("Despacho: " + despacho);
        System.out.println("Departamento: " + departamento);
    }
}
