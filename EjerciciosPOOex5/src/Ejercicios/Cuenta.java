/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta.
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Cuenta {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private double saldo;
    private String titular;
    
    public Cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public Cuenta() {
      
    }
      public void retirar_dinero(){
        System.out.println("Ingrese el nombre del titular");
        titular = leer.next();
        boolean bandera= true;
        do {      
        System.out.println("Ingrese el valor que desea retirar");
        double retiro = leer.nextDouble();
        if (retiro>saldo) {
            System.out.println("Saldo insuficiente");
        }else{
            System.out.println("Su saldo actual es de:$ "+ (saldo-retiro));
            saldo= saldo-retiro;
        }
            System.out.println("¿Desea continuar? Si/No");
            String salir = leer.next();
            if (salir.equalsIgnoreCase("no")) {
                bandera = false;
            } 
            
        } while (bandera);
        
        System.out.println("Hasta la proxima");
    }
        }
        
    
    
    
    
 
    

