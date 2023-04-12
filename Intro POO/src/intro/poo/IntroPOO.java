/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intro.poo;
import Manosalaobra.Persona;

/**
 *
 * @author User
 */
public class IntroPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona directora = new Persona ("Carolina", 37102684, "Hernandez");
        Persona alumno = new Persona ("Marisa", 31473701, "Hernandez");
        System.out.print(directora.getNombre() + " ");
        System.out.println(directora.getApellido());
        System.out.println(" ");
        directora.setNombre("Dana");
        directora.setApellido("Merlmestein");
        System.out.print(directora.getNombre()+ " " );
        System.out.print(directora.getApellido()+ " " );
        System.out.print(" ");
                
        
    }
    
}
