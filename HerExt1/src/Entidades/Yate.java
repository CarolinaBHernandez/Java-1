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
public class Yate extends DeportivosMotor{
    private int camarotes;

    public Yate(int camarotes, int potencia, String matricula, int eslora, int anioFabricacion) {
        super(potencia, matricula, eslora, anioFabricacion);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    public double calculaPrecioAmarre() {
        return super.calculaPrecioAmarre() + camarotes * 20;
    }

    public String toString() {
        return "***** Yate de lujo *****\n" + "MatrÃ­cula: " + super.getMatricula()
                + " | Metros de eslora: " + super.getEslora()
                + "\nAnio de fabricaciÃ³n: " + getAnioFabricacion()
                + " | Potencia: " + super.getPotencia() + "CV"
                + " | Camarotes: " + camarotes;
    }
}
