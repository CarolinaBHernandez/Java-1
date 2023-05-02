/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones6;

import Entidad.Tienda;
import Servicio.ServicioTienda;
import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */
public class Colecciones6 {

   @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Scanner scan = new Scanner(System.in).useDelimiter("\n");
        ServicioTienda ts = new ServicioTienda();
        Tienda tienda = ts.crearTienda();
        
         
        boolean salir = false;
        
        while (!salir) {
            System.out.println("======= MENÚ =======");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Cambiar precio de un producto");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            
            int opcion = scan.nextInt();
            scan.nextLine();  //Capture el salto de linea del Int
            System.out.println(""); 
            switch (opcion) {
                case 1:
                    ts.agregarProductos(tienda);
                    break;
                case 2:
                    System.out.println(" -- Lista de productos --");
                    ts.mostrarProductos(tienda);
                    break;
                case 3:
                    System.out.print("Ingrese producto a eliminar: ");
                    ts.eliminarProducto(tienda, scan.nextLine());
                    break;
                case 4:
                    System.out.print("Ingrese producto a modificar: ");
                    ts.modificarPrecio(tienda, scan.nextLine());
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
                default:
                    System.out.println("--Opción inválida--");
            }
            
            System.out.println(); 
        }
        
        scan.close();
    }

}

