/*
Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, 
en vez de salir del programa directamente, 
se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa,
caso contrario se vuelve a mostrar el menú.
 */
package javaintro01;

import java.util.Scanner;


public class Ejercicio6dia4 {


    public static void main(String[] args) {
     
    Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros positivos: ");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        
        System.out.println("Elija una opcion: ");
    
     while (true){
         System.out.println("-------------MENU-------------");
         System.out.println("{1}");
         System.out.println("{2}");
         System.out.println("{3}");
         System.out.println("{4}");
       
     }
         
    }
    
}
