/*
Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce meses
del año, en minúsculas. A continuación, declara una variable mesSecreto de tipo String, y 
hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9].
El programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar un mensaje,
y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto.  
Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!

 */
package Entidad;

import java.util.Scanner;



/**
 *
 * @author Carolina Hernández
 */
public class Meses {

    private String[] meses = new String[12];
    private String mesSecreto;
    private Scanner leer;

    public Meses() {

        meses = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        mesSecreto = meses[10];
        leer = new Scanner(System.in);

    }

    public void adivinarMes() {
        boolean acertado = false;
        while (!acertado) {
            String mesIngresado;
            System.out.println("Adivine el mes secreto. Ingrese el nombre del mes en minúsculas:");
            mesIngresado = leer.nextLine().toLowerCase();
            for (int i = 0; i < meses.length; i++) {
                if (meses[i].equals(mesIngresado)) {
                    if (i + 1 == 10) { // Si es octubre
                        System.out.println("¡Ha acertado!");
                        acertado = true;
                        break;
                    } else {
                        System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
                        break;
                    }
                }
            }
        }
    }
}
