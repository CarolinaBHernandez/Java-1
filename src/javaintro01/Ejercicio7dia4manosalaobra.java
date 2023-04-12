package javaintro01;

import java.util.Scanner;


/**
 *
 * @author User
 */
public class Ejercicio7dia4manosalaobra {

   
   
      
 public static void main(String[]args){
      
         Scanner teclado=new Scanner(System.in);
         
         int tipoMotor;
         System.out.print("Ingrese un valor entre 1 y 4: ");
         tipoMotor= teclado.nextInt();
         
         switch(tipoMotor){
             case 1:
                 System.out.println("La bomba es una bomba de agua");
                 break;
             case 2:
                 System.out.println("La bomba es una bomba de gasolina");
                 break;
             case 3:
                 System.out.println("La bomba es una bomba de hormigón");
                 break;
             case 4:
                 System.out.println("La bomba es una bomba de pasta alimenticia");
                 break;
             default:
                 System.out.println("No existe un valor valido para tipo de bomba");
         }
     }
    
}
