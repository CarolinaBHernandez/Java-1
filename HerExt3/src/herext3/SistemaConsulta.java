/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herext3;

import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.Hoteles;
import Entidades.Residencias;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Carolina Hernández
 */
public class SistemaConsulta {
    // Lista de alojamientos
    private static List<Alojamiento> alojamientos = new ArrayList<>();

    // Método para agregar un alojamiento a la lista
    public static void agregarAlojamiento(Alojamiento alojamiento) {
        alojamientos.add(alojamiento);
    }

    // Método para obtener todos los alojamientos
    public static List<Alojamiento> obtenerTodosAlojamientos() {
        return alojamientos;
    }

    // Método para obtener todos los hoteles de más caro a más barato
    public static List<Hoteles> obtenerHotelesOrdenadosPorPrecio() {
        List<Hoteles> hoteles = new ArrayList<>();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hoteles) {
                hoteles.add((Hoteles) alojamiento);
            }
        }
        Collections.sort(hoteles, new Comparator<Hoteles>() {
            @Override
            public int compare(Hoteles hotel1, Hoteles hotel2) {
                // Compara por precio de habitación de forma descendente
                return Double.compare(hotel2.getPrecioHab(), hotel1.getPrecioHab());
            }
        });
        return hoteles;
    }

    // Método para obtener todos los campings con restaurante
    public static List<Camping> obtenerCampingsConRestaurante() {
        List<Camping> campings = new ArrayList<>();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping) {
                Camping camping = (Camping) alojamiento;
                if (camping.isResto()) {
                    campings.add(camping);
                }
            }
        }
        return campings;
    }

    // Método para obtener todas las residencias que tienen descuento
    public static List<Residencias> obtenerResidenciasConDescuento() {
        List<Residencias> residencias = new ArrayList<>();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Residencias) {
                Residencias residencia = (Residencias) alojamiento;
                if (residencia.isDescuentos()) {
                    residencias.add(residencia);
                }
            }
        }
        return residencias;
    }
}
