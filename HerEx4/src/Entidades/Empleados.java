/*
Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
 */
package Entidades;

/**
 *
 * @author Carolina Hernández
 */
public class Empleados extends Persona{
    
   public int anio, numDespacho;

    public Empleados(int anio, int numDespacho) {
        this.anio = anio;
        this.numDespacho = numDespacho;
    }

    public Empleados(int anio, int numDespacho, String nombre, String apellidos, int numIdent, String estadoCivil) {
        super(nombre, apellidos, numIdent, estadoCivil);
        this.anio = anio;
        this.numDespacho = numDespacho;
    }
    
    //Reasignación de despacho a un empleado.
    
    public void reasignarDespacho(int nuevoD) {
        this.numDespacho = nuevoD;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); 
        System.out.println("Año de incorporación: " + anio);
        System.out.println("Número de despacho: " + numDespacho);
    }

       
}
