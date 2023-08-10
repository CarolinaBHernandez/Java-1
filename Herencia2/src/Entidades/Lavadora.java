/*
A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */
public class Lavadora extends Electrodomestico {

    protected int carga;

    //• Un constructor vacío.
    public Lavadora() {
    }

    /*• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.*/
    public Lavadora(int carga, int precio, String color, char consumoEnerg, int peso) {
        super(precio, color, consumoEnerg, peso);
        this.carga = carga;
    }

    //• Método get y set del atributo carga.
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    /*• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.*/
    public void crearLavadora() {
        super.crearElectrodomestico(); // Llama al método crearElectrodomestico() de la clase padre

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la carga de la lavadora en kg: ");
        int carga = leer.nextInt();
        setCarga(carga);

    }

    /* • Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.*/
    @Override
    public void precioFinal() {
        super.precioFinal();

        if (getCarga() > 30) {
            int precioActual = getPrecio();
            precioActual += 500; // Aumenta el precio en $500
            setPrecio(precioActual);
            System.out.println("Como su lavadora excede la carga de 30kg se le efectuó un recargo de $500");
            
        }
    }
}
