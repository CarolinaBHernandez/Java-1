/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro01;



import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto");
        String nombre = leer.nextLine();
        System.out.println("Ingrese el precio de "+nombre+" en los tres "
                + "establecimientos");
        double precio1 = leer.nextDouble();
        double precio2 = leer.nextDouble();
        double precio3 = leer.nextDouble();
        double promedio = (precio1+precio2+precio3)/3;
        System.out.println("El precio promedio de "+nombre+" es de $"+promedio);
    }
    
}

    

