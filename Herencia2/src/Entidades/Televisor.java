/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */
public class Televisor extends Electrodomestico {

    public double resolucion;
    public boolean sintonizador;

    //• Un constructor vacío. 
    public Televisor() {
    }

    /*• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.*/
    public Televisor(double resolucion, boolean sintonizador, int precio, String color, char consumoEnerg, int peso) {
        super(precio, color, consumoEnerg, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    //• Método get y set de los atributos resolución y sintonizador TDT.
    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    /*• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.*/
    public void crearTelevisor() {
        super.crearElectrodomestico();

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la resolución del televisor en pulgadas(00,00): ");
        double resolucion = leer.nextDouble();
        setResolucion(resolucion);
        leer.nextLine();
        System.out.println("¿Tiene sintonizador TDT? (si/no): ");
        String respuesta = leer.nextLine();
        boolean sintonizador = respuesta.equalsIgnoreCase("si");
        setSintonizador(sintonizador);
    }

    /* • Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.*/
    @Override
    public void precioFinal() {
        super.precioFinal();

        if (getResolucion() > 40) {
            int precioActual = getPrecio();
            double incremento = precioActual * 0.30; // Calcula el 30% del precio actual

            precioActual += incremento; // Aumenta el precio en un 30%
            System.out.println("El precio de su TV se incrementó un 30% por ser mayor a 40 pulgadas. " );

            if (isSintonizador()) {
                precioActual += 500; // Incrementa el precio en $500 si tiene sintonizador TDT incorporado
                System.out.println("Su monto a pagar se incrementó $500 por tener sintonizador TDT");
            }

            setPrecio(precioActual); // Actualiza el atributo precio con el nuevo valor
          
        }
    }

}
