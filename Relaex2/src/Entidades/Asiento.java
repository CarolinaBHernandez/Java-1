/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Carolina Hernández
 */
public class Asiento {
   
    private char letra;
    private int fila;
    private Espectador espectador; // se puede crear un boolean ocupado pero es para implementar el objeto como atributo.

    public Asiento(char letra, int fila) {
        this.letra = letra;
        this.fila = fila;
        this.espectador = null;
    }
    

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }
        public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }
    
      public int edadEspectador() {
        return espectador.getEdad();
    }
      
    public boolean ocupado(){
       return espectador != null;
    }
   
}
    

