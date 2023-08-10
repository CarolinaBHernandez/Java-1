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
public class Repulsor extends Propulsor {

    public Repulsor() {
    }

    public Repulsor(int consumoEnergia) {
        super(consumoEnergia);
    }

    @Override
    public int getConsumoEnergia() {
        return consumoEnergia;
    }

    @Override
    public void setConsumoEnergia(int consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

   

}
