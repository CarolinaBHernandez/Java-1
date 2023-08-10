/*
 Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
 */
package Entidades;




/**
 *
 * @author Carolina Hernández
 */
public final class EdificioDeOficinas extends Edificio {

    public int numDeOfi;
    public int cantPerso;
    public int numDePisos;

    public EdificioDeOficinas(int numDeOfi, int cantPerso, int numDePisos) {
        this.numDeOfi = numDeOfi;
        this.cantPerso = cantPerso;
        this.numDePisos = numDePisos;
    }

    public EdificioDeOficinas(int numDeOfi, int cantPerso, int numDePisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numDeOfi = numDeOfi;
        this.cantPerso = cantPerso;
        this.numDePisos = numDePisos;
        
    }

    public int getNumDeOfi() {
        return numDeOfi;
    }

    public void setNumDeOfi(int numDeOfi) {
        this.numDeOfi = numDeOfi;
    }

    public int getCantPerso() {
        return cantPerso;
    }

    public void setCantPerso(int cantPerso) {
        this.cantPerso = cantPerso;
    }

    public int getNumDePisos() {
        return numDePisos;
    }

    public void setNumDePisos(int numDePisos) {
        this.numDePisos = numDePisos;
    }

    @Override
    public double calcularSuperficie() {
        return 2 * (ancho * largo + ancho * alto + largo * alto);
    }

    @Override
    public double calcularVolumen() {
        return ancho * alto * largo;
    }
    
    /*De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.*/
    
  public void cantPersonas() {
         int porPiso = cantPerso * numDeOfi;
    System.out.println("En cada piso caben " + porPiso + " personas.");
    }

    public void mostrarPersonas() {
        int totalPersonas = cantPerso * numDeOfi * numDePisos;
        System.out.println("En todo el edificio caben " + totalPersonas + " personas.\n");
    }
        
}

