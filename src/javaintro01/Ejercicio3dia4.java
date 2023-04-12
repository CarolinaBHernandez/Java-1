/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la funcion Lenght() en Java.
 */
package javaintro01;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio3dia4 {

   
    public static void main(String[] args) {
        
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese una frase de 8 caracteres: ");
        String frase;
        frase = teclado.nextLine();
        
        if(frase.length() ==8){
            System.out.println("CORRECTO");
            
                                                         
                    }
        else{
            System.out.println("INCORRECTO");
            
        }
        }
    }
    

