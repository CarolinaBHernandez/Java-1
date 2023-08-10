/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicio;


import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */
public class MenuPrincipal {

    private Scanner scanner;
    private ServicioProducto productoServicio;
    private ServicioFabricante fabricanteServicio;

    public MenuPrincipal(Connection conexion) {
        scanner = new Scanner(System.in);
        productoServicio = new ServicioProducto(conexion);
        fabricanteServicio = new ServicioFabricante(conexion);
    }

        public void mostrarMenu() {
            boolean salir = false;
            while (!salir) {
                System.out.println("--------- MENÚ ---------");
                System.out.println("a) Lista el nombre de todos los productos");
                System.out.println("b) Lista los nombres y precios de todos los productos");
                System.out.println("c) Listar productos por rango de precio");
                System.out.println("d) Buscar y listar todos los Portátiles");
                System.out.println("e) Listar el nombre y precio del producto más barato");
                System.out.println("f) Ingresar un producto a la base de datos");
                System.out.println("g) Ingresar un fabricante a la base de datos");
                System.out.println("h) Editar un producto");
                System.out.println("salir) Salir del programa");
                System.out.print("\nElija una opción:");
                
                String opcion = scanner.nextLine().trim();

                switch (opcion) {
                    case "a":
                        productoServicio.listarProductos();
                        break;
                    case "b":
                        productoServicio.listarNombresYPrecios();
                        break;
                    case "c":
                        productoServicio.listarProductosPorPrecio(120, 202) ;
                        break;
                    case "d":
                        productoServicio.listarPortatiles();
                        break;
                    case "e":
                        productoServicio.listarProductoMasBarato();
                        break;
                    case "f":
                        productoServicio.agregarProducto();
                        break;
                    case "g":
                        fabricanteServicio.ingresarFabricante();
                        break;
                    case "h":
                        productoServicio.editarProducto();
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

