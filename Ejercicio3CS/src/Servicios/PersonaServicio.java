/*
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
Metodo crearPersona(): el método crear persona, 
le pide los valores de los atributos al usuario y después se le asignan a sus respectivos atributos
para llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto, 
es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje.
Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de
su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 
(iincluidos), significa que la persona está en su peso ideal y la función devuelve un 0. 
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso,
y la función devuelve un 1.
 */
package Servicios;

/**
 *
 * @author User
 */
import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in);

      public boolean esMayorDeEdad(Persona persona) {
        return (persona.getEdad() >= 18);
    }
    
    public void crearPersona(Persona persona) {
        
        
        System.out.println("Ingrese el nombre: ");
        String nombre = leer.nextLine();
        persona.setNombre(nombre);
        
        System.out.println("Ingrese la edad: ");
        int edad = leer.nextInt();
        persona.setEdad(edad);
        
        System.out.println("Ingrese el sexo (H/M/O): ");
        char sexo = leer.next().charAt(0);
        
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Sexo incorrecto. Ingrese el sexo (H/M/O): ");
            sexo = leer.next().charAt(0);
        }
        
        persona.setSexo(sexo);
        
          System.out.println("Ingrese el peso en kg: ");
        double peso = leer.nextDouble();
        persona.setPeso(peso);

        System.out.println("Ingrese la altura en mts : ");
        double altura = leer.nextDouble();
        persona.setAltura(altura);

        leer.nextLine(); // Limpiar el buffer del scanner

        
        
       
    }
    
    public double calcularIMC(Persona persona) {
        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        
        if (imc < 20) {
            System.out.println("La persona esta por debajo del peso ideal.");
            return -1 ; // Por debajo del peso ideal
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("La persona esta en su peso ideal.");
            return 0; // Peso ideal
        } else {
            System.out.println("La persona tiene sobrepeso.");
            return 1; // Sobrepeso
        }
    }

}
