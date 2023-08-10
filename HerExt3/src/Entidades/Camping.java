/*
Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones.
 */
package Entidades;

/**
 *
 * @author Carolina Hernández
 */
public class Camping extends Extrahotelero{
    
    protected int capMaxCarpas, cantBanios;
    protected boolean resto;

    public Camping() {
    }

    public Camping(int capMaxCarpas, int cantBanios, boolean resto) {
        this.capMaxCarpas = capMaxCarpas;
        this.cantBanios = cantBanios;
        this.resto = resto;
    }

    public Camping(int capMaxCarpas, int cantBanios, boolean resto, boolean privado, double cantMetros) {
        super(privado, cantMetros);
        this.capMaxCarpas = capMaxCarpas;
        this.cantBanios = cantBanios;
        this.resto = resto;
    }

    public Camping(int capMaxCarpas, int cantBanios, boolean resto, boolean privado, double cantMetros, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantMetros, nombre, direccion, localidad, gerente);
        this.capMaxCarpas = capMaxCarpas;
        this.cantBanios = cantBanios;
        this.resto = resto;
    }

    public int getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(int capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isResto() {
        return resto;
    }

    public void setResto(boolean resto) {
        this.resto = resto;
    }
    
}
