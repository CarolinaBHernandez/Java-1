/*
En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
 */
package Entidades;

/**
 *
 * @author Carolina Hernández
 */
public class Estudiantes extends Persona {

    public String curso;

    public Estudiantes(String curso) {
        this.curso = curso;
    }

    public Estudiantes(String curso, String nombre, String apellidos, int numIdent, String estadoCivil) {
        super(nombre, apellidos, numIdent, estadoCivil);
        this.curso = curso;
    }

    //Matriculación de un estudiante en un nuevo curso.
    public void matriculacion(String nuevoCurso) {
        this.curso = nuevoCurso;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Curso: " + curso);
    }

}
