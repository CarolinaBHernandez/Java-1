/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CBCS;

import CB.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class CuentaBancariaService {
    
    Scanner leer = new Scanner(System.in);
    
    public CuentaBancaria crearcuenta(){
        
        System.out.println("Ingrese el numero de cuenta: ");
        long Cuenta = leer.nextLong();
        System.out.println("Ingrese el numero de DNI: ");
        long DNI = leer.nextLong();
        System.out.println("Ingrese su deposito de apertura de cuenta: ");
        double saldo = leer.nextDouble();
        
        return new CuentaBancaria(Cuenta, DNI, saldo);
        
                
        }
    public void ingresar(CuentaBancaria Cuenta) {
        System.out.println("Ingrese el monto a despositar: ");
        double deposito = leer.nextDouble(); 
        deposito = deposito + Cuenta.getSaldoActual();
        Cuenta.setSaldoActual(deposito);
        System.out.println("Deposito realizado, su saldo actual es de: "+Cuenta.getSaldoActual());
                        
    }

    public void retirar(CuentaBancaria Cuenta) {
        System.out.println("Ingrese el monto que desea retirar: ");
        double retiro = leer.nextDouble();
        double Saldoactual = Cuenta.getSaldoActual();

        if (Saldoactual > retiro) {
            Saldoactual = Saldoactual - retiro;
            Cuenta.setSaldoActual(Saldoactual);
            System.out.println("Su nuevo monto es $: " + Cuenta.getSaldoActual());

        } else {
            System.out.println("Saldo insuficiente, retira $" + Saldoactual );
            Saldoactual = 0;
            Cuenta.setSaldoActual(Saldoactual);
        }
    }

    public void extraccionRapida(CuentaBancaria Cuenta) {
        double Saldoactual = Cuenta.getSaldoActual();
        double retiro = Saldoactual * 0.2;
        Saldoactual = Saldoactual - retiro;
        System.out.println("Por extracción rapida, procederá a retirar un importe de $ " + retiro );
        System.out.println("Su saldo actual es $ " + Saldoactual );
        Cuenta.setSaldoActual(Saldoactual);

    }

    public void consultarSaldo(CuentaBancaria Cuenta) {
        System.out.println("Su saldo actual es $" + Cuenta.getSaldoActual());

    }

    public void consultarDatos(CuentaBancaria Cuenta) {
        System.out.println("Su DNI es " + Cuenta.getDniCliente() + "\n Su número de cuenta es  " + Cuenta.getNumeroCuenta() + "\n Su saldo actual es de $" + Cuenta.getSaldoActual() );

    }

        
    
  
}
