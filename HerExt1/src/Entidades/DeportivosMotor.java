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
public class DeportivosMotor extends Barco{
   private int potencia;

    public DeportivosMotor(int potencia, String matricula, int eslora, int anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double calculaPrecioAmarre() {
        return super.calculaPrecioAmarre() + potencia * 1;
    }

    public String toString() {
        return "***** Deportivo a motor *****\n"
                + "MatrÃ­cula: " + super.getMatricula()
                + " | Metros de eslora: " + super.getEslora()
                + "\nAnio de fabricaciÃ³n: " + getAnioFabricacion()
                + " | Potencia: " + potencia + "CV";
    }
}
