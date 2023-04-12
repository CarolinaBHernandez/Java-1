/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. 
A continuaciÃ³n, se deben crear los siguientes mÃ©todos:
MÃ©todo constructor con todos los atributos pasados por parÃ¡metro.
MÃ©todo constructor sin los atributos pasados por parÃ¡metro.
MÃ©todos get y set.
MÃ©todo para crearOperacion(): que le pide al usuario los dos nÃºmeros y los guarda en los atributos del objeto.
MÃ©todo sumar(): calcular la suma de los nÃºmeros y devolver el resultado al main.
MÃ©todo restar(): calcular la resta de los nÃºmeros y devolver el resultado al main
MÃ©todo multiplicar(): primero valida que no se haga una multiplicaciÃ³n por cero, si fuera a multiplicar por cero, el mÃ©todo devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicaciÃ³n y se devuelve el resultado al main
MÃ©todo dividir(): primero valida que no se haga una divisiÃ³n por cero, si fuera a pasar una divisiÃ³n por cero, el mÃ©todo devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la divisiÃ³n y se devuelve el resultado al main.

 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Operacion {

    private double numero1;
    private double numero2;

    //Metodo constuctor con todos los atributos pasados por parametro:
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //Metodo constructor sin los atributos pasados por parametro:
    public Operacion() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

    //Metodo get set:
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    //MÃ©todo para crear opreacion:

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el primer nÃºmero ");
        setNumero1(leer.nextDouble());
        System.out.print("Ingrese el segundo nÃºmero ");
        setNumero2(leer.nextDouble());
    }

    // MÃ©todo para sumar:
    public double sumar() {
        return this.numero1 + this.numero2;
    }

    //MÃ©todo para restar:
    public double restar() {
        return this.numero1 - this.numero2;
    }

    //Metodo para multiplicar:
    public double multiplicar() {

        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("Error: No se puede multiplicar por cero.");
            return 0;
        }
        return this.numero1 * this.numero2;

    }

    //Metodo para dividir:
    public double dividir() {
        if (this.numero2 == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
        return this.numero1 / this.numero2;
}
}
