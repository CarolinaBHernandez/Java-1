/*
 Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (String) 
y su longitud. Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters.
El constructor con frase como atributo debe setear la longitud de la frase de manera automática.
 */
package Entidades;

/**
 *
 * @author Carolina Hernández
 */
public class Cadena {
    
 
    private String frase;
    private int longitud;

    // Constructor vacío
    public Cadena() {
    
    }

    // Constructor con frase como atributo
    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    // Getter para frase
    public String getFrase() {
        return frase;
    }

    // Setter para frase
    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    // Getter para longitud
    public int getLongitud() {
        return longitud;
    }

    // Setter para longitud (no se utiliza ya que se calcula automáticamente)
    // public void setLongitud(int longitud) {
    //     this.longitud = longitud;
    // }
}
  
    

