/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancias.servicios;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */
public class MenuEstancia {

    private Scanner scanner;
    private CasasServicio casasServicio;
    private ClientesServicio clientesServicio;
    private ComentariosServicio comentariosServicio;
    private EstanciasServicio estanciasServicio;
    private FamiliasServicio familiasServicio;

    public MenuEstancia(Connection conexion) {
        scanner = new Scanner(System.in);
        casasServicio = new CasasServicio(conexion);
        clientesServicio = new ClientesServicio(conexion);
        comentariosServicio = new ComentariosServicio(conexion);
        familiasServicio = new FamiliasServicio(conexion);
    }

    public void mostrarMenu() {
        boolean salir = false;
        while (!salir) {
            System.out.println("--------- MENÚ ---------");
            System.out.println("a) Listar familias con al menos 3 hijos menores de 10 años y con edad máxima inferior a 10 años.");
            System.out.println("b) Buscar casas disponibles en Reino Unido entre el 1 y el 31 de agosto de 2020.");
            System.out.println("c) Encontrar familias con dirección de correo Hotmail.");
            System.out.println("d) Consultar casas disponibles a partir de una fecha y número de días específico.");
            System.out.println("e) Listar datos de clientes que realizaron una estancia y la descripción de la casa.");
            System.out.println("f) Listar estancias reservadas por un cliente y la información de la casa.");
            System.out.println("g) Incrementar el precio por día en un 5% de todas las casas del Reino Unido.");
            System.out.println("h) Obtener el número de casas por país.");
            System.out.println("i) Listar casas del Reino Unido que están 'limpias'.");
            System.out.println("j) Insertar nuevos datos en la tabla de estancias.");
            System.out.println("salir) Salir del programa");
            System.out.print("\nElija una opción:");

            String opcion = scanner.nextLine().trim();

            switch (opcion) {
                case "a":
                    familiasServicio.listarFamilias();
                    break;
                case "b":
                    casasServicio.listarCasas();
                    break;
                case "c":
                    familiasServicio.encuentraHotmail();
                    break;
                case "d":
                    casasServicio.casasDisponibles();
                    break;
                case "e":
                    clientesServicio.listarClientes();
                    break;
                case "f":
                    estanciasServicio.listarEstancias();
                    break;
                case "g":
                    casasServicio.incrementarPrecio();
                    break;
                case "h":
                    casasServicio.obtenerNumCasas();
                    break;
                case "i":
                    comentariosServicio.listarCasasLimpias();
                    break;
                case "j":
                    estanciasServicio.insertarEstancias();
                    break;
                case "salir":
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            System.out.println();
        }
    }
}
