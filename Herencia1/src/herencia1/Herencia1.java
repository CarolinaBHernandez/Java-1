/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia1;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author Carolina Hernández
 */
public class Herencia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion del objeto perro
        Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro1.Alimentarse();
        //Declaracion de otro objeto perro
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.Alimentarse();
         // Declaracion del objeto gato
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
        gato1.Alimentarse();
          // Declaracion del objeto caballo
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.Alimentarse();
    }
    
}
