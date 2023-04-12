/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciospoo4;
import Ejercicios.Rectangulo;

/**
 *
 * @author User
 */
public class Ejercicio4MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
      Rectangulo miRectangulo = new Rectangulo(0, 0);
      miRectangulo.crearRectangulo();
      double superficie = miRectangulo.calcularSuperficie();
        System.out.println("La superficie del rectangulo es: "+superficie);
      double perimetro = miRectangulo.calcularPerimetro();
        System.out.println("El perimetro del rectangulo es: "+perimetro);
      miRectangulo.dibujarRectangulo();
    }
    
}
