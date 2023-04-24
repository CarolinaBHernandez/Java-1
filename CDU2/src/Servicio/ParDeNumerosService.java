/*
Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los 
siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número.
Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

 */
package Servicio;

import Entidades.ParDeNumeros;

/**
 *
 * @author Carolina Hernández
 */
public class ParDeNumerosService {
    
    public void mostrarValores (ParDeNumeros par) {
        System.out.println("El número 1 es: " + par.getA());
        
        System.out.println("El número 2 es: " +par.getB());
}
    public double devolverMayor (ParDeNumeros par) {
      return Math.max(par.getA(),par.getB());
      
    }
    
    public void calcularPotencia (ParDeNumeros par) {
      double a=Math.round(par.getA());
      double b=Math.round(par.getB());
        System.out.println( "La potencia del mayor valor de la clase elevado al menor número es: "+Math.pow(Math.max(a, b),Math.min(a, b)));  
    }
    public double calcularRaiz (ParDeNumeros par) {
        double menor;
        menor = Math.min(par.getA(), par.getB());
        menor = Math.abs(menor);
        return Math.sqrt(menor);
        
    }
}
