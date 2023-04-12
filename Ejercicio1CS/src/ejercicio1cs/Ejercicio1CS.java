/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1cs;

import CB.CuentaBancaria;
import CBCS.CuentaBancariaService;



/**
 *
 * @author User
 */
public class Ejercicio1CS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        CuentaBancariaService Servicios = new CuentaBancariaService();
        CuentaBancaria CC1 = Servicios.crearcuenta();

        Servicios.ingresar(CC1);
        Servicios.retirar(CC1);
        Servicios.extraccionRapida(CC1);
        Servicios.consultarSaldo(CC1);
        Servicios.consultarDatos(CC1);
    }

}
    
