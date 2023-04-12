/*
Crear una clase Rectangulo que modele rectÃ¡ngulos por medio de un atributo privado base 
y un atributo privado altura. La clase incluirÃ¡ un mÃ©todo para crear el rectÃ¡ngulo con los datos 
del Rectangulo dados por el usuario. 
TambiÃ©n incluirÃ¡ un mÃ©todo para calcular la superficie del rectÃ¡ngulo 
y un mÃ©todo para calcular el perÃ­metro del rectÃ¡ngulo. 
Por Ãºltimo, tendremos un mÃ©todo que dibujarÃ¡ el rectÃ¡ngulo mediante asteriscos usando la base y la altura.
Se deberÃ¡n ademÃ¡s definir los mÃ©todos getters, setters y constructores correspondientes.
Superficie = base * altura / PerÃ­metro = (base + altura) * 2.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Rectangulo {
  
    // Declaro variables
    
    private double base;
    private double altura;
    
   
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la base del rectangulo: ");
        setBase(leer.nextDouble());
        System.out.print("Ingrese la altura del rectangulo: ");
        setAltura(leer.nextDouble());
    }

    public double calcularSuperficie() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public void dibujarRectangulo() {
        for (int i = 0; i < this.altura; i++) {
            for (int j = 0; j < this.base; j++) {
                if (i == 0 || i == this.altura - 1 || j == 0 || j == this.base - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
