/*
4) Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
 */
package mde3;

import Entidad.DivisionNumero;
import java.util.InputMismatchException;


/**
 *
 * @author Carolina Hernández
 */
public class MDE3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                 
        DivisionNumero div = new DivisionNumero();

        try {
            div.dividir();
        } catch (InputMismatchException g) {
            System.out.println("Error, mal ingreso por teclado");
        } catch (NumberFormatException h) {
            System.out.println("Error, no se puede convertir a entero");
        } catch (ArithmeticException i) {
            System.out.println("No se puede dividir por 0");
        }

    }
}

/*Scanner leer = new Scanner(System.in);
        try {
            System.out.println("Ingrese dos numeros: ");
            int uno = leer.nextInt();
            int dos = leer.nextInt();
            
            
            System.out.println("La division es: " + uno / dos);
        } catch (InputMismatchException e) {
            System.out.println("Ocurrio un error de tipo InputMismatchException.");
            
        }
    }
}*/
