/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y 
terminada en punto, y luego codifique la palabra o 
frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter que se indica en la tabla 
y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
 */
package javaintro01;

import java.util.Scanner;

public class Ejercicio11dia8manosalaobra {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese una palabra o frase para codificar: ");
    String palabra = sc.nextLine();
    String palabraCodificada = codificarVocales(palabra);
    System.out.println("La palabra o frase codificada es: " + palabraCodificada);
  }

  public static String codificarVocales(String palabra) {
    String palabraCodificada = "";
    for (int i = 0; i < palabra.length(); i++) {
      char letra = palabra.charAt(i);
      switch (letra) {
        case 'a':
          palabraCodificada += '@';
          break;
        case 'e':
          palabraCodificada += '#';
          break;
        case 'i':
          palabraCodificada += '$';
          break;
        case 'o':
          palabraCodificada += '%';
          break;
        case 'u':
          palabraCodificada += '*';
          break;
        case 'A':
          palabraCodificada += '@';
          break;
        case 'E':
          palabraCodificada += '#';
          break;
        case 'I':
          palabraCodificada += '$';
          break;
        case 'O':
          palabraCodificada += '%';
          break;
        case 'U':
          palabraCodificada += '*';
          break;
        default:
          palabraCodificada += letra;
          break;
      }
    }
    return palabraCodificada;
  }
  
}
