/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’.
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la funcion Substring y equals() de Java.

 */
package javaintro01;

import java.util.Scanner;

public class Ejercicio4dia4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una frase/palabra: ");
        String frase;
        frase = teclado.nextLine();
        

        if (frase.substring(0,1).equals("A")) {
        System.out.println("CORRECTO");  
        }
      
           
        
        else{
           System.out.println("INCORRECTO");
           }

    }
}
