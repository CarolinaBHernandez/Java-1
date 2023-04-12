/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego
de adivinanza de números. El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" 
después de cada intento. El juego termina cuando el segundo jugador adivina el número o 
se queda sin intentos. Registra el número de intentos necesarios para adivinar el número y el número 
de veces que cada jugador ha ganado.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Juego {
    
 
    private int jugador1_ganados;
    private int jugador2_ganados;
    
    public void iniciar_juego() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¡Bienvenido al juego de adivinanza de números!");
        System.out.println("Jugador 1, elige un número:");
        int numero_secreto = scanner.nextInt();
        
        boolean juego_terminado = false;
        int intentos_jugador2 = 0;
        
        while (!juego_terminado && intentos_jugador2 < 5) {
            System.out.println("Jugador 2, adivina el número:");
            int intento = scanner.nextInt();
            intentos_jugador2++;
            
            if (intento == numero_secreto) {
                System.out.println("¡Felicidades, has adivinado el número en " + intentos_jugador2 + " intentos!");
                jugador2_ganados++;
                juego_terminado = true;
            } else if (intento < numero_secreto) {
                System.out.println("El número es más alto. Intenta de nuevo.");
            } else {
                System.out.println("El número es más bajo. Intenta de nuevo.");
            }
        }
        
        if (!juego_terminado) {
            System.out.println("Se acabaron tus intentos. El número era " + numero_secreto + ".");
        }
        
        System.out.println("Jugador 1 ha ganado " + jugador1_ganados + " veces.");
        System.out.println("Jugador 2 ha ganado " + jugador2_ganados + " veces.");
    }
}
    

