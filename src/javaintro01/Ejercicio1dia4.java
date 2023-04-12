package javaintro01;


import java.util.Scanner;

/*
Crear un programa que dado un número determine si es par o impar
 */


public class Ejercicio1dia4 {
    public static void main(String[] args) {
  
        
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.print("Ingrese un numero: ");
        n = teclado.nextInt();        
        
        if(n%2==0){
        System.out.println(n+" Es un numero par.");
        
        }else{
            System.out.println(n+" Es un numero impar.");
        }
        
   
}
}

