/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Carolina Hernández
 */
public class Veleros extends Barco{
     private int numeroMastiles;

    public Veleros(int numeroMastiles, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    public double calculaPrecioAmarre() {
        return super.calculaPrecioAmarre() + numeroMastiles * 5;
    }
    
    public String toString() {
    return "****** Velero ******\n" + "MatrÃ­cula: " + super.getMatricula()
            + " | Metros de eslora: " + super.getEslora()
            + "\nAnio de fabricaciÃ³n: " + getAnioFabricacion()
            + " | Mastiles: " + numeroMastiles;
}
    
}
