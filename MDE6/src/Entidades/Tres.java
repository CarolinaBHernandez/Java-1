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
public class Tres {
  public static int metodo() {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;
            System.out.println("Valor final del try: " + valor);
        } catch (NumberFormatException e) {
            System.out.println("Error de formato: " + e.getMessage());
        } finally {
            valor = valor + 1;
            System.out.println("Valor final del finally: " + valor);
        }
        
        valor = valor + 1;
        System.out.println("Valor antes del return: " + valor);
        return valor;
    }
}