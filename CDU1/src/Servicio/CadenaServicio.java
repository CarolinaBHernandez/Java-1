/*
Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: 
Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar 
cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase 
con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y 
devuelve verdadero si la contiene y falso si no.

 */
package Servicio;

/**
 *
 * @author Carolina Hernández
 */
public class CadenaServicio {

    public int mostrarVocales(String frase) {
        int contador = 0;
        frase = frase.toLowerCase(); // minuscula

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (esVocal(c)) {
                contador++;
            }
        }

        return contador;
    }

    private boolean esVocal(char vocal) {
        return vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u';

    }

      public String invertirFrase(String frase) {
        StringBuilder fraseInvertida = new StringBuilder(frase);
        fraseInvertida.reverse();
        return fraseInvertida.toString();
    }

    public static int vecesRepetido(String frase, char letra) {
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (caracter == letra) {
                contador++;
                
            }
        }  
        return contador;
    }
     public void compararLongitud(String frase, String otraFrase) {
        int longitudFraseActual = frase.length();
        int longitudOtraFrase = otraFrase.length();
        if (longitudFraseActual > longitudOtraFrase) {
            System.out.println("La frase actual es más larga que la otra frase.");
        } else if (longitudFraseActual < longitudOtraFrase) {
            System.out.println("La frase actual es más corta que la otra frase.");
        } else {
            System.out.println("Ambas frases tienen la misma longitud.");
        }
    }
     
       public String unirFrases(String frase, String frasenueva) {
    String unirfrase = frase + " " + frasenueva;
    return unirfrase;
    }
    
     public boolean contiene(String frase, String letra) {
        return frase.contains(letra);
    }
} 