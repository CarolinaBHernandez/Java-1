/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20)
e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package javaintro01;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio10dia4manosalaobra {

    
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese 4 numeros ");
        int num1,num2,num3,num4;
               
    num1= leer.nextInt();
    num2= leer.nextInt();
    num3= leer.nextInt();
    num4= leer.nextInt();
 
    if (num1<=20) {
         System.out.print(num1);
        for (int i = 0; i < num1; i++) {
            System.out.print("*");
        }
                }else {
        System.out.print("El numero ingresado en invalido");
 
 
    } System.out.println(" ");
    if (num2<=20) {
        System.out.print(num2);
        for (int i = 0; i < num2; i++) {
            System.out.print("*");
        }
        }else {
        System.out.print("El numero ingresado en invalido");
 
    }System.out.println(" ");
    if (num3<=20) {
        System.out.print(num3);
        for (int i = 0; i < num3; i++) {
            System.out.print("*");
 
    }
        }else {
        System.out.print("El numero ingresado en invalido");
 
    } System.out.println(" ");
    if (num4<=20) {
        System.out.print(num4);
        for (int i = 0; i < num4; i++) {
            System.out.print("*");
 
    }
    }else {
        System.out.print("El numero ingresado es invalido");
 
    }
 
 
 
    System.out.println(" ");
        
       
    }
    
}
