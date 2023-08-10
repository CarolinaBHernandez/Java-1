/*
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
 */
package Entidades;

import Entidades.Edificio;

/**
 *
 * @author Carolina Hernández
 */
public class Polideportivo extends Edificio {

    public String nombre;
    public String tipoInstalacion;
    private static int techados = 0;
    private static int abiertos = 0;

    public Polideportivo(String nombre, String tipoInstalacion) {
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;

        if (tipoInstalacion.equalsIgnoreCase("Techado")) {
            techados++;
        } else if (tipoInstalacion.equalsIgnoreCase("Abierto")) {
            abiertos++;
        }

    }

    public Polideportivo(String nombre, String tipoInstalacion, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public double calcularSuperficie() {
        return 2 * (ancho * largo + ancho * alto + largo * alto);
    }

    @Override
    public double calcularVolumen() {
        return ancho * alto * largo;
    }
   /* Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.*/
    
    public static int getCantidadTechados() {
        return techados;
    }

    public static int getCantidadAbiertos() {
        return abiertos;
    }
}
