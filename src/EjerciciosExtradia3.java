
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class EjerciciosExtradia3 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        double n = leer.nextDouble(); 
        double area = Math.PI*Math.pow(n,2); //Potencia=pow(nro a potenciar y a cuanto elevado)
        double perimetro = 2*Math.PI*n;
        System.out.println("El área es: " + area);
        System.out.println("El perimetro es:" + perimetro);
    }
}
