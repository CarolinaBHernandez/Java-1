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
public class EjerciciosExtra4dia3 {

   

	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
System.out.println("ingrese la cantidad de litros de combustible");
double litros = leer.nextDouble();
System.out.println("ingrese la cantidad de kilometros");
double kilometros = leer.nextDouble();

double consumo = kilometros / litros;

System.out.println("el consumo de combustible es "+ consumo);
	}

}
    
    

