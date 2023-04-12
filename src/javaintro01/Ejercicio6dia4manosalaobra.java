/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro01;



import java.util.Scanner;



/**
 *
 * @author User
 */
public class Ejercicio6dia4manosalaobra {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = teclado.nextInt();
        String exit = "N";
        System.out.print("Ingrese el segundo numero: ");
        int num2 = teclado.nextInt();

        do {
            int opciones;
            System.out.println("------------MENU------------");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");

            opciones = teclado.nextInt();

            switch (opciones) {
                case 1:
                    System.out.println("La suma de sus numeros es" + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de sus numeros es " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de sus numeros es " + (num1 * num2));
                    break;
                case 4:
                    try {
                        System.out.println("La division de sus numeros es " + (num1 / num2));
                    } catch (Exception exception) {
                        System.out.println("Imposible dividir por cero");
                    }
                    break;

                case 5:
                    Scanner e = new Scanner(System.in);
                    System.out.println("¿Está seguro que desea salir?");
                    System.out.println("S/N");
                    exit = e.nextLine();
            }

        } while (exit.equals("N"));

    }

}

