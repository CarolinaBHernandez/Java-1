/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import tienda.servicio.MenuPrincipal;



/**
 *
 * @author Carolina Hernández
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
    // Establecer la conexión a la base de datos
    try {
        String urlBaseDeDatos = "jdbc:mysql://localhost:3306/tienda?useSSL=false";
        Connection conexion = DriverManager.getConnection(urlBaseDeDatos, "root", "root");

        // Crear instancia del menú principal
        MenuPrincipal menu = new MenuPrincipal(conexion);

        // Mostrar el menú principal
        menu.mostrarMenu();

        // Cerrar la conexión a la base de datos
        conexion.close();
    } catch (SQLException e) {
        System.out.println("Error al conectar con la base de datos: " + e.getMessage());
    }
    }
}

