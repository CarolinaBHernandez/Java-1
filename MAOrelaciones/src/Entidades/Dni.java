/*
 
 */
package Entidades;

/**
 *
 * @author Carolina Hernández
 */
public class Dni {
      private char serie;
    private int numero;
    
    public Dni(char serie, int numero) {
        this.serie = serie;
        this.numero = numero;
    }
    
    public char getSerie() {
        return serie;
    }
    
    public int getNumero() {
        return numero;
    }
}

