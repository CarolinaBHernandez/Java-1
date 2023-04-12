/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos 
de las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas
y frenar cuando el usuario ingrese la palabra “No”.
 */
package javaintro01;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio2dia8 {

  
  public static void main(String[] args) {
        datosPersonas();       
    }
    
    
    
    public static void datosPersonas() {
        Scanner leer = new Scanner(System.in);
        int i; String resp; String datos = "";
        
        System.out.println("Ingrese cantidad de personas");
        int cant = leer.nextInt();
        
        for (i = 0; i < cant; i++) {
            System.out.println("Ingrese nombre de la persona: " + (i+1));
            String nombre = leer.next();
            System.out.println("Ingrese la edad de la persona: " + (i+1));
            int edad = leer.nextInt();
            
            if(edad >= 18) {
                datos = nombre + " " + edad + ". Es mayor.";
                System.out.println(datos);
            } else {
                datos = nombre + " " + edad + ". Es menor.";
                System.out.println(datos);
            }
            
            System.out.println("¿Desea seguir mostrando personas?");
            resp = leer.next();
            
            if(resp.equals("No")|| resp.equals("NO")||resp.equals("no")) {
                i = cant;
            } else {
                cant = cant + 1;
            }
        }
    }
    
}

