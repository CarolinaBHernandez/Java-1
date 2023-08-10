/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancias;

import estancias.servicios.MenuEstancia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Carolina Hernández
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/estancias_exterior?useSSL=false";
        
        try (Connection conexion = DriverManager.getConnection(urlBaseDeDatos, "root", "root")) {
      
            MenuEstancia menu = new MenuEstancia(conexion);
          
            menu.mostrarMenu();
          
        }
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
    }
}

