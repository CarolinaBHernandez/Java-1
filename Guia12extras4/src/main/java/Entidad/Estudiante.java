//Estudiante

package Entidad;

public class Estudiante extends Persona {
    private String curso;

    public Estudiante(String nombre, String apellido, String identificacion, String estadoCivil, String curso) {
        super(nombre, apellido, identificacion, estadoCivil);
        this.curso = curso;
    }

    public void matricularCurso(String curso) {
        this.curso = curso;
    }

    public void imprimirInformacion() {
        System.out.println("\nEstudiante:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Identificación: " + getIdentificacion());
        System.out.println("Estado Civil: " + getEstadoCivil());
        System.out.println("Curso: " + curso);
    }
  
    public String getCurso() {
        return curso;
    }
}
