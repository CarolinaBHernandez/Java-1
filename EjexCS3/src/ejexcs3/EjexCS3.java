/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejexcs3;

import Entidad.NIF;
import NIFCS.NIFServicio;

/**
 *
 * @author Carolina Hernández
 */
public class EjexCS3 {

       public static void main(String[] args) {
        NIFServicio ser = new NIFServicio();
        NIF doc1 = ser.crearNif();
        
        ser.mostrar(doc1);
    }
}

    

