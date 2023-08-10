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
public class Generador {
    private int capacidadEnergia;
    private boolean capacidadSalvavidas;

    public Generador() {
    }

    public Generador(int capacidadEnergia, boolean capacidadSalvavidas) {
        this.capacidadEnergia = capacidadEnergia;
        this.capacidadSalvavidas = capacidadSalvavidas;
    }

    public int getCapacidadEnergia() {
        return capacidadEnergia;
    }

    public void setCapacidadEnergia(int capacidadEnergia) {
        this.capacidadEnergia = capacidadEnergia;
    }

    public boolean isCapacidadSalvavidas() {
        return capacidadSalvavidas;
    }

    public void setCapacidadSalvavidas(boolean capacidadSalvavidas) {
        this.capacidadSalvavidas = capacidadSalvavidas;
    }

    public void consumoEnergia(int cantidad) {
        if (capacidadEnergia >= cantidad) {
            capacidadEnergia -= cantidad;
            System.out.println("Se ha consumido " + cantidad + " unidades de energía.");
        } else {
            System.out.println("No hay suficiente energía en el generador.");
        }
    }
}
