/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro01;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EjercicioExtra3dia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de metros");
        int metros = leer.nextInt();
        int cm = (int) (metros*100);
        int mm= (int) (metros*1000);
        double pulgadas=(metros *100)/2.54;
        System.out.println(metros+" metros convertidos a centimetros son :" +cm);
        System.out.println(metros+" metros convertidos a milimetros son :" + mm);
        System.out.println(metros+" metros convertidos a pulgadas son :" + pulgadas);
        
        
        
                
                
    }
    
}
