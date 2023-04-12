/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NIFCS;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */
public class NIFServicio {
    private long dni;
    private String letra;
    private long resto;
    private Scanner leer = new Scanner(System.in);
    
    String [] vecLetra ={"t","r","w","a","g","m","y","f","p","d","x","b","n","j","z","s","q","v","h","l","c","k","e"};
    
    int [] vecPos = new int[23];
    
    public NIF crearNif(){
        System.out.println("Ingrese el dni");
        dni = leer.nextLong();
        resto = dni % 23;
       
        
        for (int i = 0; i < vecPos.length; i++) {
            if (i==resto) {
                letra=vecLetra[i];
                
            }
 
        }
        return new NIF (dni,letra);
    }
    
    public void mostrar(NIF d1){
        System.out.println(d1.getDni()+ "-" +d1.getLetra());
    }
    
}
