/*
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios,
que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
Luego los pase por parámetro a un nuevo objeto Date. 
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío 
de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y
otra (edad del usuario).

 */
package Servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */
public class FechaService {
     public static Date fechaNacimiento() {
         int dia;
         int mes;
         int anio;
         try (Scanner leer = new Scanner(System.in)) {
             System.out.print("Ingrese el día de su nacimiento: ");
             dia = leer.nextInt();
             System.out.print("Ingrese el mes de su nacimiento: ");
             mes = leer.nextInt() - 1; 
             System.out.print("Ingrese el año de su nacimiento: ");
             anio = leer.nextInt() - 1900; 
         }

        return new Date(anio, mes, dia);
     }  
     
     public static Date fechaActual() {
        return new Date();
     } 
        public static int diferencia(Date fecha1, Date fecha2) {
        int anio1 = fecha1.getYear();
        int anio2 = fecha2.getYear();

        return anio2 - anio1;
    }
}
