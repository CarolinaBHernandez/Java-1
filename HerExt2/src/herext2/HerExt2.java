/*
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
 */
package herext2;

import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import Entidades.Edificio;
import java.util.ArrayList;

/**
 *
 * @author Carolina Hernández
 */
public class HerExt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Edificio> edificios = new ArrayList<>();

        Polideportivo poli1 = new Polideportivo("Polideportivo 1", "Techado");
        poli1.setAncho(20.0);
        poli1.setAlto(10.0);
        poli1.setLargo(30.0);

        Polideportivo poli2 = new Polideportivo("Polideportivo 2", "Abierto");
        poli2.setAncho(25.0);
        poli2.setAlto(12.0);
        poli2.setLargo(40.0);

        System.out.println("Cantidad de polideportivos techados: " + Polideportivo.getCantidadTechados());
        System.out.println("Cantidad de polideportivos abiertos: " + Polideportivo.getCantidadAbiertos());

        EdificioDeOficinas edi1 = new EdificioDeOficinas(3, 10, 3, 20.0, 10.0, 30.0); //OFICINAS,PERSONAS,ANCHO,LARGO,ALTO
        EdificioDeOficinas edi2 = new EdificioDeOficinas(5, 8, 5, 25.0, 12.0, 40.0);

        edificios.add(poli1);
        edificios.add(poli2);
        edificios.add(edi1);
        edificios.add(edi2);
        edi1.cantPersonas();
        edi1.mostrarPersonas();

        edi2.cantPersonas();
        edi2.mostrarPersonas();

        int contador = 1;

        for (Edificio edificio : edificios) {
            double superficie = edificio.calcularSuperficie();
            double volumen = edificio.calcularVolumen();

            System.out.println("Edificio " + contador);
            System.out.println("Superficie del edificio: " + superficie);
            System.out.println("Volumen del edificio: " + volumen);
            System.out.println("----------------------------------");

            contador++;
        }

    }
}

