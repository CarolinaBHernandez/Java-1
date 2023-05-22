/*
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
 */
package Entidades;


import java.util.Random;

/**
 *
 * @author Carolina Hernández
 */
public class Revolver {

    private Integer posact;
    private Integer posagua;

    public Revolver() {
    }

    public Revolver(Integer posact, Integer posagua) {
        this.posact = posact;
        this.posagua = posagua;
    }
        
    public Integer getPosact() {
        return posact;
    }

    public void setPosact(Integer posact) {
        this.posact = posact;
    }

    public Integer getPosagua() {
        return posagua;
    }

    public void setPosagua(Integer posagua) {
        this.posagua = posagua;
    }

    /*• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.*/
    public void llenarRevolver() {
        Random random = new Random();

        posact = random.nextInt(6) + 1;
        System.out.println("La posicion actual es:" +posact);
        posagua = random.nextInt(6) + 1;
        System.out.println("La posicion del agua es:" +posagua);

    }
    // • mojar(): devuelve true si la posición del agua coincide con la posición actual

    public boolean mojar() {
        return posact == posagua;
    }

    // • siguienteChorro(): cambia a la siguiente posición del tambor
    public void siguienteChorro() {
        if (posact == 6) {
            posact = 1;
        } else {
            posact++;
        }

    }

    //• toString(): muestra información del revolver (posición actual y donde está el agua)
    @Override
    public String toString() {
        return "Posicion actual del tambor: " + posact + "\n"
                + "Posicion del agua: " + posagua;
    }
}
