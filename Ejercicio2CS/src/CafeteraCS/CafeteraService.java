/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CafeteraCS;

import Cafetera.Cafetera;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class CafeteraService {
     Scanner Leer = new Scanner(System.in);

    public void llenarcafetera(Cafetera c1) {
        int Cap_Max = c1.getCapacidadMaxima();
        int Cap_Actual = c1.getCantidadActual();

        if (Cap_Max != Cap_Actual) {
            System.out.println("La cafetera se llenarÃ¡");

            c1.setCantidadActual(Cap_Max);

        } else {
            System.out.println("La cafetera se encuentra llena");
        }
        System.out.println("Restan " + c1.getCantidadActual() + " Litros de Cafe ");
    }

    public void servirTaza(Cafetera c1) {
        System.out.println("Ingrese la capacidad de la taza");
        int tamanoTaza = Leer.nextInt();
        int cantidadActual = c1.getCantidadActual();
        if (cantidadActual >= tamanoTaza) {
            cantidadActual -= tamanoTaza;
            System.out.println("La taza se llenÃ³ correctamente.");
            c1.setCantidadActual(cantidadActual);
        } else {
            int cantidadServida = cantidadActual;
            cantidadActual = 0;
            c1.setCantidadActual(cantidadActual);
            System.out.println("La taza no se llenÃ³ por completo. Se sirviÃ³ " + cantidadServida + " unidades de cafÃ©.");

        }
        System.out.println("Restan " + c1.getCantidadActual() + " Litros de Cafe ");
    }

    public void vaciarCafetera(Cafetera c1) {
        int cantidadActual = c1.getCantidadActual();
        if (cantidadActual != 0) {
            System.out.println("Se procede a vaciar la cafetera");
            c1.setCantidadActual(0);
        } else {
            System.out.println("La cafetera ya estÃ¡ vacia");
        }
    }

    public void agregarCafe(Cafetera c1) {
        int cantidadActual = c1.getCantidadActual();
        int Cant_Agregar;
        int Cantidadmax =c1.getCapacidadMaxima();
        do {
            System.out.println("Ingrese la cantidad de cafe que desea agregar");
            Cant_Agregar = Leer.nextInt();

        } while (Cantidadmax >= (Cant_Agregar+cantidadActual));

    }


}

