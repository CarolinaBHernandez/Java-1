/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospoo2;
import Ejercicio.Circunferencia;
/**
 *
 * @author User
 */
public class Ejercicio2MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
       Circunferencia c1 = new Circunferencia (0); 
       
       c1.crearCircunferencia();
       System.out.println(c1.getRadio());
       c1.area();
       c1.perimetro();
    }
    }
    

