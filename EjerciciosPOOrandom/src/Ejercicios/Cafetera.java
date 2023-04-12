/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima 
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (
la cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:   
 
• Constructor predeterminado o vacío  
• Constructor con la capacidad máxima y la cantidad actual  
• Métodos getters y setters. 
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.   
• Método servirTaza(int): se pide el tamaño de una taza vacía,
el método recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. 
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó 
la taza. 
• Método vaciarCafetera(): pone la cantidad de café actual en cero.  
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y 
se añade a la cafetera la cantidad de café indicada. 
 */
package Ejercicios;

/**
 *
 * @author User
 */
public class Cafetera {
    
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera(int capacidadMaxima, int cantidaddActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = 0;
    }
    
    public Cafetera(){
        
    }
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidaddActual() {
        return cantidadActual;
    }

    public void setCantidaddActual(int cantidaddActual) {
        this.cantidadActual = cantidaddActual;
    }

     public void llenarCafetera() {
         cantidadActual = capacidadMaxima;
         System.out.println("La capacidad esta llena");
     }
    
       public void servirTaza(int tamanoTaza) {
        if (cantidadActual >= tamanoTaza) {
            cantidadActual -= tamanoTaza;
            System.out.println("La taza esta llena.");
        } else {
            int cantidadServida = cantidadActual;
            cantidadActual = 0;
            System.out.println("La taza no se lleno por completo. Se sirvio " + cantidadServida + " unidades de café.");
        }
    }
       public void vaciarCafetera() {
        cantidadActual = 0;
       }
       
          public void agregarCafe(int cantidad) {
        int cantidadDisponible = capacidadMaxima - cantidadActual;

        if (cantidad <= cantidadDisponible) {
            cantidadActual += cantidad;
            System.out.println("Se agreagaron" + cantidad + " ml de café a la cafetera.");
        } else {
            cantidadActual = capacidadMaxima;
            System.out.println("La cafetera se lleno al máximo.");
        }
    }
    }
    
               
    
   
