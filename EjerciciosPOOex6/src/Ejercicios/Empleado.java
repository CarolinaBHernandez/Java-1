/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función 
de su edad y salario actual. 
El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Empleado {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    private String nombre;
    private int edad;
    private int salario;

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        
  
    }
     public Empleado() {

     }
    
    public void  calcular_aumento() {
        System.out.println("Ingrese su nombre: ");
        nombre = leer.next();
        System.out.println("Ingrese su edad: ");
        edad= leer.nextInt();
        System.out.println("¿Cual es su saldo actual?");
        salario= leer.nextInt();
        
        if (edad>30) {
            System.out.println("Usted tendra un aumento del %10, su nuevo salario será: "+ (salario*1.10));
        }else {System.out.println("Usted tendra un aumento del %5, su nuevo salario será: "+ (salario*1.5));
        }
    }
    
   }
    
    

