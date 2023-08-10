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
public class Propulsor {
    
    protected int consumoEnergia;

    public Propulsor() {
    }

    public Propulsor(int consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public int getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(int consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }
}
