/*
 Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
 */
package Entidades;

/**
 *
 * @author Carolina Hernández
 */
public class PersonalDeServicio extends Persona{
    
    public String seccion;

    public PersonalDeServicio(String seccion) {
        this.seccion = seccion;
    }

    public PersonalDeServicio(String seccion, String nombre, String apellidos, int numIdent, String estadoCivil) {
        super(nombre, apellidos, numIdent, estadoCivil);
        this.seccion = seccion;
    }
    
  
    //Traslado de sección de un empleado del personal de servicio.
      public void cambiarSeccion(String nuevaSeccion) {
        this.seccion = nuevaSeccion;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); 
        System.out.println("Nueva seccion: "+seccion);
    }

}
