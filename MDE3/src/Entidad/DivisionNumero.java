/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */
public class DivisionNumero {
    public void dividir(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos numeros");
       String a = leer.next();
        String b = leer.next();
        int uno = Integer.parseInt(a);
        int dos = Integer.parseInt(b);
        System.out.println("La division es: "+uno/dos);
    }
}
