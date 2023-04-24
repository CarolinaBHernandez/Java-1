/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdu4;

import static Servicios.FechaService.diferencia;
import static Servicios.FechaService.fechaActual;
import static Servicios.FechaService.fechaNacimiento;
import java.util.Date;

/**
 *
 * @author Carolina Hernández
 */
public class CDU4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date fechaNacimiento = fechaNacimiento();
        System.out.println("Fecha de nacimiento: " + fechaNacimiento.toString());

        Date fechaActual = fechaActual();
        System.out.println("Fecha actual: " + fechaActual.toString());

        int diferenciaAnios = diferencia(fechaNacimiento, fechaActual);
        System.out.println("Diferencia de años: " + diferenciaAnios + " años.");
    }
    
    
}
