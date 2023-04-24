/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdu1;

import Servicio.CadenaServicio;

/**
 *
 * @author Carolina Hernández
 */
public class CDU1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          CadenaServicio cadenaServicio = new CadenaServicio();

        
        String frase = "Rosario Central";
        System.out.println("Frase: " + frase);

        // Mostrar el número de vocales en la frase
        int numVocales = cadenaServicio.mostrarVocales(frase);
        System.out.println("Número de vocales: " + numVocales);

        // Invertir la frase
        String fraseInvertida;
        fraseInvertida = cadenaServicio.invertirFrase(frase);
        System.out.println("Frase invertida: " + fraseInvertida);

        // Contar el número de veces que una letra se repite en la frase
        char letra = 'o';
        int numRepeticiones = CadenaServicio.vecesRepetido(frase, letra);
        System.out.println("Número de repeticiones de la letra '" + letra + "': " + numRepeticiones);

        // Comparar la longitud de dos frases
        String otraFrase = "Cualquiera";
        System.out.println("Otra frase: " + otraFrase);
        cadenaServicio.compararLongitud(frase, otraFrase);

        // Unir dos frases
        String frasenueva = "el más grande";
        String fraseUnida = cadenaServicio.unirFrases(frase, frasenueva);
        System.out.println("Frase unida: " + fraseUnida);

        // Verificar si una letra está contenida en la frase
        String letraBuscada = "a";
        boolean contieneLetra = cadenaServicio.contiene(frase, letraBuscada);
        System.out.println("¿La frase contiene la letra '" + letraBuscada + "'?: " + contieneLetra);
    }
}
       
        
    
    

