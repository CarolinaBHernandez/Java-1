/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.NIF;

/**
 *
 * @author Carolina Herández
 */
public class NIFService {
    
       private NIF nif;

    public NIFService(long DNI, char letra) {
        this.nif = new NIF(DNI, letra);
        
          }

    public long getNumeroDNI() {
        return nif.getDNI();
    }

    public void setNumeroDNI(long numeroDNI) {
        nif.setDNI(numeroDNI);
    }

    public char getLetra() {
        return nif.getLetra();
    }

    public void setLetra(char letra) {
        nif.setLetra(letra);
    }
}
     
     
    

