/*
 Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.*/
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */
public class Electrodomestico {

    protected int precio;
    protected String color;
    protected char consumoEnerg;
    protected int peso;

    //• Un constructor vacío.
    public Electrodomestico() {
    }

    //• Un constructor con todos los atributos pasados por parámetro.
    public Electrodomestico(int precio, String color, char consumoEnerg, int peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumoEnerg = comprobarConsumoEnergetico(consumoEnerg);
        this.peso = peso;
    }
    //• Métodos getters y setters de todos los atributos.

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = comprobarColor(color);
    }

    public char getConsumoEnerg() {
        return consumoEnerg;
    }

    public void setConsumoEnerg(char consumoEnerg) {
        this.consumoEnerg = consumoEnerg;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    /*• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.*/
    private char comprobarConsumoEnergetico(char letra) {

        if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
        System.out.println("La letra ingresada no es válida. Se usará la letra F por defecto.");
        return 'F';
        }
    }

    /*• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.*/
    public static String comprobarColor(String color) {

        String colorLowerCase = color.toLowerCase();

        if (colorLowerCase.equals("blanco") || colorLowerCase.equals("negro") || colorLowerCase.equals("rojo")
                || colorLowerCase.equals("azul") || colorLowerCase.equals("gris")) {
            return colorLowerCase;
        } else {
            System.out.println("El color seleccionado es inválido o no se encuentra disponible. Se establecerá el color por defecto: blanco.");
            return "blanco";
        }
    }

    /*• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.*/
    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el color del electrodoméstico (los colores disponibles son: blanco, negro, rojo, azul y gris): ");
        String color = leer.next();
        setColor(comprobarColor(color));

        System.out.println("Ingrese el consumo energético del electrodoméstico (de la A a la F): ");
        char consumo = leer.next().charAt(0);
        setConsumoEnerg(comprobarConsumoEnergetico(consumo));

        setPrecio(1000);
    }

    /*• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
    
    LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100

PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que
     */
    public void precioFinal() {
        char letra = getConsumoEnerg();
        double peso = getPeso();
        int precioBase = 1000; // Precio base inicial de $1000

        // Calcular precio según la letra del consumo energético
        switch (letra) {
            case 'A':
                precioBase += 1000;
                break;
            case 'B':
                precioBase += 800;
                break;
            case 'C':
                precioBase += 600;
                break;
            case 'D':
                precioBase += 500;
                break;
            case 'E':
                precioBase += 300;
                break;
            case 'F':
                precioBase += 100;
                break;
            default:
                break;
        }

        // Calcular precio según el peso del electrodoméstico
        if (peso >= 1 && peso <= 19) {
            precioBase += 100;
        } else if (peso >= 20 && peso <= 49) {
            precioBase += 500;
        } else if (peso >= 50 && peso <= 79) {
            precioBase += 800;
        } else if (peso >= 80) {
            precioBase += 1000;
        }

        setPrecio(precioBase);
    }
}



