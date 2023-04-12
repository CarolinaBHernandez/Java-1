/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package javaintro01;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio8dia4manosalaobra {


    public static void main(String[] args) {
         Scanner teclado=new Scanner(System.in);
        int num;
         
        
       
        
        do{ 
            System.out.print("Ingrese una nota del 0 al 10 ");
             num = teclado.nextInt();
             
                    
        }while(num>=10);
        System.out.print("La nota es correcta ");
         num = teclado.nextInt();
        
    }
    
}

