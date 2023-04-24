/*
Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con los cuales se
realizarán diferentes operaciones matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos números.
 */
package Entidades;



/**
 *
 * @author Carolina Hernández
 */
public class ParDeNumeros {
    
    private double a,b;

    public ParDeNumeros() {
       
        this.a = Math.round((Math.random()*10)*100d)/100d;
        this.b = Math.round((Math.random()*10)*100d)/100d;
    }
   
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    
            
    
    
    
}
