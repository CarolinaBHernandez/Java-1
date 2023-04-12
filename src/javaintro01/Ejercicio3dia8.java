/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida
por teclado a otra moneda, 
estas pueden ser a dólares, yenes o libras.
La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, 
este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package javaintro01;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio3dia8 {

    public static void main(String[] args) {
        EXTERNA:
       while(true){
           System.out.println("CONVERSOR DE MONEDAS");
           System.out.println("1 - Libras a Euros\n"
           + "2 - $ a Euros\n"
           + "3 - Yenes a Euros\n"
           + "4 - Salir");
           System.out.print("INGRESE UNA OPCION: ");
           Scanner leer = new Scanner(System.in);
           char opcion = leer.next().charAt(0);
           
           
           switch(opcion){
                case '1':
                   convertir(0.86,"Libras");
                   break;
                case '2':
                   convertir(1.28611,"$");
                   break;
                case '3':
                   convertir(129.852,"Yenes");
                 case '4':
                     System.out.println("CERRANDO PROGRAMA");
                     break EXTERNA;
                 default:
                     System.out.println("OPCION INCORRECTA");
                     break;
                   
           }
       } 
        
    }
    static void convertir(double valorEuro,String pais){
        Scanner leer = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad de %s :",pais);
        double cantidadMoneda = leer.nextDouble();
        
        double euros = cantidadMoneda/valorEuro;
        
        euros = (double) Math.round(euros*100d)/100;
        
        
        System.out.println("---------------------------------------");
        System.out.println("|        Tienes € " +euros+ "         |");
        System.out.println("---------------------------------------");
       
        
        
    }


    }

