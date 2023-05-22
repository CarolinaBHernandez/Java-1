/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.

 */
package rela3;

import Entidades.Baraja;
import Entidades.Carta;
import java.util.List;

/**
 *
 * @author Carolina Hernández
 */
public class Rela3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        Baraja baraja = new Baraja();
        
       // System.out.println(baraja.getCartas());
        System.out.println("Baraja antes de barajar: " + baraja);
        baraja.barajar();
        System.out.println("Baraja después de barajar: " + baraja);
        baraja.siguienteCarta();
        List<Carta> cartasEntregadas = baraja.darCartas();

if (cartasEntregadas != null) {
    System.out.println("Se entregaron las siguientes cartas:");
    for (Carta carta : cartasEntregadas) {
        System.out.println(carta);
    }
} else {
    System.out.println("No se pudieron entregar las cartas solicitadas.");
}
        
       
        
        

        
      
    }
    
}
