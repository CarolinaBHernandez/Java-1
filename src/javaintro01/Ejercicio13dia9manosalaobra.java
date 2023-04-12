/*
 Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package javaintro01;


public class Ejercicio13dia9manosalaobra {

 
    public static void main(String[] args) {
      
        String vector[] = new String [5];
        
        //asignacion de valores
        vector[0] = "Juan Piriz";
        vector[1] = "Nicolas Gomez";
        vector[2] = "David Gonzalez";
        vector[3] = "Damian Lopez";
        vector[4] = "Carolina Hernandez";
        
        //recorrido
        
        for (int i=0; i<vector.length; i++){
            System.out.println("En la posicion: " + i + "esta el nombre: " + vector[i]);
        
    }
    }
    
}
