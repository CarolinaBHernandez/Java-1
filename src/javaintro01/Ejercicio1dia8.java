/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación matemática 
y deben devolver sus resultados para imprimirlos en el main. 
 */
package javaintro01;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejercicio1dia8 {

 
   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        double num1 = leer.nextDouble();
        double num2 = leer.nextDouble();
        double resultado = 0;
        
        System.out.println("¿Que opreación desea realizar? \n 1. Suma \n 2. Resta \n 3. Multiplicación \n 4. División");
        int respuesta = leer.nextInt();
        
        switch(respuesta) {
            case 1:
                resultado = suma(num1, num2);
                break;
            case 2:
                resultado = resta(num1, num2);
                break;
            case 3:
                resultado = multiplicacion(num1, num2);
                break;
            case 4:
                resultado = division(num1, num2);
                break;
        }
        
        System.out.println(resultado);
    }
    
    
    
    
    public static double suma(double num1, double num2) {
        return num1 + num2;
    }
    
    public static double resta(double num1, double num2) {
        return num1 - num2;
    }
    
    public static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }
    
    public static double division(double num1, double num2) {
        return num1 / num2;
    }
}

