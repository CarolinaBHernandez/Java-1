/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herext3;

import Entidades.Camping;
import Entidades.Hotel4;
import Entidades.Hotel5;

import Entidades.Residencias;

/**
 *
 * @author Carolina Hernández
 */
public class HerExt3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear  alojamientos
        Hotel5 holidayinn = new Hotel5(100,5,20,"A","Pepito",40,2,4,2,100000.0); /*hab, camas, pisos,gym,
nom resto, cap resto, cant salones, suites, cant limo , precio hab*/
        Hotel5 savoy = new Hotel5(80,4,15,"A","Pacman",35,1,2,1,70000.0);
        //Hotel4 homero = new Hotel4("B","Capitan piluso",15,30,3,3,4.000.0); //gim, nombre resto, cap resto, hab, camas, pisos, precio
        Camping camping1 = new Camping(100, 2, true);
        Residencias residencia1 = new Residencias(60, false, true); //habitaciones descuento campo
    }

} 
