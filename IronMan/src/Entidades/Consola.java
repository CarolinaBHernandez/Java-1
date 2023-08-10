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
public class Consola extends Propulsor{
    
    public String informacion;

    public Consola() {
    }

    public Consola(String informacion) {
        this.informacion = informacion;
    }

    public Consola(String informacion, int consumoEnergia) {
        super(consumoEnergia);
        this.informacion = informacion;
    }

    public String getNformacion() {
        return informacion;
    }

    public void setNformacion(String informacion) {
        this.informacion = informacion;
    }

    @Override
    public int getConsumoEnergia() {
        return consumoEnergia;
    }

    @Override
    public void setConsumoEnergia(int consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

     public int usar(int intensidad, int tiempo) {
        int energiaConsumida = consumoEnergia * intensidad * tiempo;
        return energiaConsumida;
    }
    
}
