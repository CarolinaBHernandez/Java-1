/*
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, 
llamaremos todos los métodos para cada objeto, deberá¡ comprobar si la persona está¡ en su peso ideal,
tiene sobrepeso o está¡ por debajo de su peso ideal e indicar para cada objeto si la persona 
es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables
(arrays), para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de cuantos 
son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales.
 */
package ejercicio3cs;

import Entidades.Persona;
import Servicios.PersonaServicio;


public class Ejercicio3CS {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
       
       /* EJ 1 (Manejo de excepciones) Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el
método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula
try-catch para probar la nueva excepción que debe ser controlada.*/
       
          try {
        Persona persona = null; // Inicializar el objeto como null
        PersonaServicio personaServicio = new PersonaServicio();
        
        // Intentar invocar el método esMayorDeEdad()
        boolean esMayor = personaServicio.esMayorDeEdad(persona);
        
        System.out.println("Es mayor de edad: " + esMayor);
    } catch (NullPointerException e) {
        System.out.println("Excepción capturada: " + e.getMessage());
        // Aquí puedes manejar la excepción de acuerdo a tus necesidades
    }
}
   }
//    PersonaServicio personaServicio = new PersonaServicio();
//    
//    Persona persona1 = new Persona();
//    personaServicio.crearPersona(persona1);
//    
//    Persona persona2 = new Persona();
//    personaServicio.crearPersona(persona2);
//    
//    Persona persona3 = new Persona();
//    personaServicio.crearPersona(persona3);
//    
//    Persona persona4 = new Persona();
//    personaServicio.crearPersona(persona4);
//    
//    System.out.println("Persona 1:");
//    System.out.println("Es mayor de edad: " + personaServicio.esMayorDeEdad(persona1));
//    System.out.println("IMC: " + personaServicio.calcularIMC(persona1));
//    
//    System.out.println("Persona 2:");
//    System.out.println("Es mayor de edad: " + personaServicio.esMayorDeEdad(persona2));
//    System.out.println("IMC: " + personaServicio.calcularIMC(persona2));
//    
//    System.out.println("Persona 3:");
//    System.out.println("Es mayor de edad: " + personaServicio.esMayorDeEdad(persona3));
//    System.out.println("IMC: " + personaServicio.calcularIMC(persona3));
//    
//    System.out.println("Persona 4:");
//    System.out.println("Es mayor de edad: " + personaServicio.esMayorDeEdad(persona4));
//    System.out.println("IMC: " + personaServicio.calcularIMC(persona4));
//}
        

        
   // }
