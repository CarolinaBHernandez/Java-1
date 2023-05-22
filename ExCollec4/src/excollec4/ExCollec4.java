/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excollec4;

import Entidad.CP;
import java.util.HashMap;

/**
 *
 * @author Carolina Hernández
 */
public class ExCollec4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Integer,String> codigosPostales = new HashMap<>();
        CP cp = new 
        CP();
         for (int i = 0; i < 10; i++) {
            cp.agregarCP(codigosPostales);
        }
          System.out.println("Localidades agregadas:");
          codigosPostales.values().forEach((localidad) -> {
              System.out.println(localidad);
        });
        cp.buscarLocalidad(codigosPostales);
        cp.agregarCP(codigosPostales);
        for (int i = 0; i < 3; i++) {
            cp.borrarLocalidades(codigosPostales);

    }
    cp.mostrarLocalidades(codigosPostales);
}
}