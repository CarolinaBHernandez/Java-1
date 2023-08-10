/*
Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.
 */
package Entidades;

/**
 *
 * @author Carolina Hernández
 */
public class Hotel5 extends Hotel4{
    
    public int cantSalones;
    public int cantSuites;
    public int cantLimo;

    public Hotel5() {
    }

    public Hotel5(int cantSalones, int cantSuites, int cantLimo) {
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimo = cantLimo;
    }

    public Hotel5(int cantSalones, int cantSuites, int cantLimo, String gimnasio, String nomResto, int capacidadResto) {
        super(gimnasio, nomResto, capacidadResto);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimo = cantLimo;
    }

    public Hotel5(int cantSalones, int cantSuites, int cantLimo, String gimnasio, String nomResto, int capacidadResto, int cantHabitaciones, int numCamas, int cantPisos, double precioHab) {
        super(gimnasio, nomResto, capacidadResto, cantHabitaciones, numCamas, cantPisos, precioHab);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimo = cantLimo;
    }

    public Hotel5(int cantSalones, int cantSuites, int cantLimo, String gimnasio, String nomResto, int capacidadResto, int cantHabitaciones, int numCamas, int cantPisos, double precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nomResto, capacidadResto, cantHabitaciones, numCamas, cantPisos, precioHab, nombre, direccion, localidad, gerente);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimo = cantLimo;
    }

    public int getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(int cantSalones) {
        this.cantSalones = cantSalones;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimo() {
        return cantLimo;
    }

    public void setCantLimo(int cantLimo) {
        this.cantLimo = cantLimo;
    }
    
    /*El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.*/
    
    public double calcularPrecio(){
    
        double precioHab= 50 + (1 * cantHabitaciones);

        // Valor agregado por el restaurante
        if (capacidadResto < 30) {
            precioHab+= 10;
        } else if (capacidadResto >= 30 && capacidadResto <= 50) {
            precioHab+= 30;
        } else {
            precioHab+= 50;
        }

        // Valor agregado por el gimnasio
        if (gimnasio.equals("A")) {
            precioHab+= 50;
        } else {
            precioHab+= 30;
        }

        // Valor agregado por las limosinas
        precioHab+= 15 * cantLimo;

        return precioHab;
    }
}


    

