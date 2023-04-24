/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Ahorcado;

import java.util.Scanner;




/**
 *
 * @author Carolina Hernández
 */
public class AhorcadoServicio {
Scanner leer = new Scanner(System.in).useDelimiter("\n");

@SuppressWarnings("UnusedAssignment")
    public void crearJuego() {
        Ahorcado ahorcado = new Ahorcado();
        System.out.println("Ingrese la palabra a adivinar");
        String palabraABuscar = leer.next();
        char[] palabra = new char[longitud(palabraABuscar)];
        for (int i = 0; i < palabra.length; i++) {
            palabra[i] = palabraABuscar.charAt(i);
        }
        ahorcado.setPalabraABuscar(palabra);
        System.out.println("Ingrese la cantidad de jugadas máxima");
        ahorcado.setCantidadDeJugadas(leer.nextInt());
        boolean finDeIntentos;
        boolean palabraEncontrada;
        do {
            System.out.println("Ingrese la letra a buscar");
            char letra = leer.next().charAt(0);
            encontradas(letra, ahorcado);
            finDeIntentos = ahorcado.getCantidadDeJugadas() > 0;
            palabraEncontrada = palabraEncontrada = ahorcado.getLetrasEncontradas() == ahorcado.getPalabraABuscar().length;
            if (palabraEncontrada) {
                System.out.println("----------------------------------");
                System.out.println("----------------------------------");
                System.out.println("Felicidades!! Ganaste");
                System.out.println("----------------------------------");
                System.out.println("----------------------------------");
                break;
            } else if (!finDeIntentos) {
                System.out.println("----------------------------------");
                System.out.println("----------------------------------");
                System.out.println("Perdiste!! :c");
                System.out.println("----------------------------------");
                System.out.println("----------------------------------");
                break;
            }
        } while (true);
    }

    public int longitud(String palabra) {
        return palabra.length();
    }
public boolean buscarLetra(char letra, Ahorcado ahorcado) {

        boolean letraEncontrada = false;
        char[] palabra = ahorcado.getPalabraABuscar();
        for (int i = 0; i < ahorcado.getPalabraABuscar().length; i++) {
            if (letra == palabra[i]) {
                letraEncontrada = true;
                break;
            }
        }
        if (letraEncontrada) {
            System.out.println("La letra pertenece a la palabra");
        } else {
            System.out.println("La letra NO pertenece a la palabra");
        }
        return letraEncontrada;
    }

    /*Método encontradas(letra):  que reciba una letra ingresada por el usuario 
y muestre cuantas letras han sido encontradas y cuántas le faltan. 
Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que, 
cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados 
e informará cuando el usuario descubra toda la palabra o se quede sin intentos. 
Este método se llamará en el main.
     */
public boolean encontradas(char letra, Ahorcado ahorcado) {
    boolean letraEncontrada = buscarLetra(letra, ahorcado);
    char[] palabra = ahorcado.getPalabraABuscar();
    if (letraEncontrada) {
        for (int i = 0; i < ahorcado.getPalabraABuscar().length; i++) {
            if (letra == palabra[i]) {
                letraEncontrada = true;
                ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + 1);
                System.out.print(palabra[i] + " ");
            } else {
                System.out.print("_ ");
            }
        }
    } else {
        ahorcado.setCantidadDeJugadas(ahorcado.getCantidadDeJugadas() - 1);
        intentos(ahorcado);
        for (int i = 0; i < ahorcado.getPalabraABuscar().length; i++) {
            System.out.print("_ ");
        }
    }
    int faltantes = ahorcado.getPalabraABuscar().length - ahorcado.getLetrasEncontradas();
    System.out.println("\nFaltan " + faltantes + " letras");
    return letraEncontrada;
}

public void intentos(Ahorcado ahorcado) {
    System.out.println("Te quedan " + ahorcado.getCantidadDeJugadas() + " intentos ");
}

public void juego() {
    crearJuego();
}
}






















    
    

