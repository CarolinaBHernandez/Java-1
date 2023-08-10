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
public class Sintetizador extends Consola {
    
    public String mensaje;

    public Sintetizador() {
    }

    public Sintetizador(String mensaje, String informacion, int consumoEnergia) {
        super(informacion, consumoEnergia);
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    @Override
 public int usar(int intensidad, int tiempo) {
        int energiaConsumida = consumoEnergia * intensidad * tiempo;
        return energiaConsumida;
    }
   

}
