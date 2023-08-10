/*
 Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 */
package herencia2;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Carolina Hernández
 */
public class Herencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /* Lavadora lavadora1 = new Lavadora();
       lavadora1.crearLavadora();
       
       Televisor televisor1 = new Televisor();
       televisor1.crearTelevisor();
       
       lavadora1.precioFinal();
       System.out.println("El precio final de la lavadora es : $" + lavadora1.getPrecio());
       televisor1.precioFinal();
       System.out.println("El precio final del televisor es : $" + televisor1.getPrecio());*/
       
      
       //EJERCICIO 3
       
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();

        // Crear 4 electrodomésticos y añadirlos al ArrayList
        Lavadora lavadora1 = new Lavadora(10, 1500, "blanco", 'A', 50);
        electrodomesticos.add(lavadora1);

        Lavadora lavadora2 = new Lavadora(12, 1200, "negro", 'C', 40);
        electrodomesticos.add(lavadora2);

        Televisor televisor1 = new Televisor(42, true, 2500, "gris", 'B', 30);
        electrodomesticos.add(televisor1);

        Televisor televisor2 = new Televisor(32, false, 1800, "azul", 'E', 20);
        electrodomesticos.add(televisor2);

        // Calcular el precio final de cada electrodoméstico y mostrar el resultado
        double precioTotalElectrodomesticos = 0;
        double precioTotalLavadoras = 0;
        double precioTotalTelevisores = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            electrodomestico.precioFinal();

            precioTotalElectrodomesticos += electrodomestico.getPrecio();

            if (electrodomestico instanceof Lavadora) {
                precioTotalLavadoras += electrodomestico.getPrecio();
            } else if (electrodomestico instanceof Televisor) {
                precioTotalTelevisores += electrodomestico.getPrecio();
            }
        }

        // Mostrar los precios individuales y el precio total de cada tipo de electrodoméstico
        System.out.println("Precio final de los electrodomésticos:");
        int numLavadoras = 1;
        int numTelevisores = 1;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Lavadora) {
                Lavadora lavadora = (Lavadora) electrodomestico;
                System.out.println("Precio de la lavadora " + numLavadoras + ": $" + lavadora.getPrecio());
                numLavadoras++;
            } else if (electrodomestico instanceof Televisor) {
                Televisor televisor = (Televisor) electrodomestico;
                System.out.println("Precio del televisor " + numTelevisores + ": $" + televisor.getPrecio());
                numTelevisores++;
            }
        }

        System.out.println("Precio total de las lavadoras: $" + precioTotalLavadoras);
        System.out.println("Precio total de los televisores: $" + precioTotalTelevisores);
        System.out.println("Precio total de todos los electrodomésticos: $" + precioTotalElectrodomesticos);
    }
}
    
       
       
    

