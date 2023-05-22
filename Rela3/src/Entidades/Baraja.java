/*Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.*/
package Entidades;

import Enumeraciones.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */
public class Baraja {

    private List<Carta> cartas;
    private int monton;

    public Baraja() {
        this.cartas = new ArrayList();
        for (int i = 1; i <= 12; i++) {
            if (!(i == 8 || i == 9)) {
                this.cartas.add(new Carta(i, Palo.ESPADAS));
            }
        }
        for (int i = 1; i <= 12; i++) {
            if (!(i == 8 || i == 9)) {
                this.cartas.add(new Carta(i, Palo.BASTO));
            }
        }
        for (int i = 1; i <= 12; i++) {
            if (!(i == 8 || i == 9)) {
                this.cartas.add(new Carta(i, Palo.ORO));
            }
        }
        for (int i = 1; i <= 12; i++) {
            if (!(i == 8 || i == 9)) {
                this.cartas.add(new Carta(i, Palo.COPA));
            }
        }
    }

    public Baraja(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta siguienteCarta() {
        if (monton >= cartas.size()) {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }

        Carta siguiente = cartas.get(monton);
        monton++;

        return siguiente;
    }

    public boolean cartasDisponibles() {
        return monton < cartas.size();
    }

    public List<Carta> darCartas() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de cartas que desea: ");
        int cantidad = leer.nextInt();

        if (cantidad > cartas.size() - monton) {
            System.out.println("No hay suficientes cartas en la baraja.");
            return null;
        }

        List<Carta> cartasEntregadas = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            Carta carta = siguienteCarta();
            if (carta != null) {
                cartasEntregadas.add(carta);
            }
        }

        return cartasEntregadas;
    }

    @Override
    public String toString() {
        return "Baraja{" + "cartas=" + cartas + '}';
    }
}
