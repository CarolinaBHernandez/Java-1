package Ejercicio;


import java.util.Scanner;

/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
A continuaciÃ³n, se deben crear los siguientes mÃ©todos:
MÃ©todo constructor que inicialice el radio pasado como parÃ¡metro.
MÃ©todos get y set para el atributo radio de la clase Circunferencia.
MÃ©todo para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
MÃ©todo area(): para calcular el Ã¡rea de la circunferencia (Area=ã€–Ï€*radioã€—^2).
MÃ©todo perimetro(): para calcular el perÃ­metro (Perimetro=2*Ï€*radio).

 */

/**
 *
 * @author User
 */
public class Circunferencia {
    
    private double Radio;
    
    
   
    public Circunferencia(double Radio) {
        this.Radio = Radio;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }
    
    public void crearCircunferencia(){
        Scanner leer = new  Scanner(System.in);
        System.out.print("Ingrese la circunferencia ");
        setRadio (leer.nextDouble ());
        
    }
    
    public void area(){
        System.out.println(Math.PI * Math.pow(Radio, 2));   
        
        
    }
    
    public void perimetro(){
        System.out.println(2 * Math.PI * Radio); 
        
    }
}
