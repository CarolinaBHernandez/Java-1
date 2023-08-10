/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mde2;

import Entidad.Manejodeexc;


/**
 *
 * @author Carolina Hernández
 */
public class MDE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      try{
             Manejodeexc a1 = new Manejodeexc();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.fillInStackTrace()); 
        }
    }
}
