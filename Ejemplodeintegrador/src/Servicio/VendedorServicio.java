/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Vendedor;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */
public class VendedorServicio {
    
    public Vendedor altaVendedor() {
        
        // Instanciar un objeto de tipo vendedor:
        
        Vendedor v1 = new Vendedor();
        
        //Lleno los atributos:
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del vendedor: ");
        v1.setNombre(leer.next());
        System.out.println("Ingrese el DNI del vendedor: ");
        v1.setDni(leer.nextInt());
        System.out.println("Ingrese el sueldo basico: ");
        v1.setSueldoBasico(leer.nextDouble());
        System.out.println("Ingese la fecha del dia que comenzo a trabajar ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes en el que comenzo a trabajar: ");
        int mes = leer.nextInt();
        System.out.println("Ingese el año en el que comenzo a trabajar: ");
        int anio = leer.nextInt();
        Date fecha  = new Date(anio-1900,mes-1,dia);
        v1.setFechaInicio(fecha);
        return v1;
    }
    
    public void sueldoMensual(Vendedor v1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese fueron las ventas totales del vendedor: ");
        Double ventas = leer.nextDouble();
        v1.setComisiones(ventas * 0.15);
        v1.setSueldoMensual(v1.getSueldoBasico() + v1.getComisiones());
        System.out.println("El sueldo mensual del vendedor es: "
                + v1.getNombre() + " es de $" + v1.getSueldoMensual());
    }

    public void vacaciones(Vendedor v1) {
        Date hoy = new Date();
        int antiguedad = hoy.getYear() - v1.getFechaInicio().getYear();
        if (antiguedad < 5) {
            System.out.println("Le corresponden 14 dias de vacaciones: ");

        } else if (antiguedad < 10) {
            System.out.println(" Le corresponden 21 dias de vacaciones: ");

        } else if (antiguedad < 20) {
            System.out.println("Le corresponden 28 dias de vacaciones: ");
        } else if (antiguedad > 20) {
            System.out.println("Le corresponden 35 dias de antiguedad: ");
        } else {
            System.out.println("El empleado tiene vacaciones proporcionales");
        }
    }
}
