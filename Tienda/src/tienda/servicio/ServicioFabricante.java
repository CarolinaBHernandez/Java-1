/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */
public class ServicioFabricante {

    private Connection conexion;
    private Scanner scanner;

    public ServicioFabricante(Connection conexion) {
        this.conexion = conexion;
        this.scanner = new Scanner(System.in);
    }

    public void ingresarFabricante() {
        try {
            System.out.println("Ingrese el nombre del fabricante:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el país del fabricante:");
            String pais = scanner.nextLine();

            String sql = "INSERT INTO fabricante (nombre, pais) VALUES (?, ?)";
            int filasAfectadas;
            try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
                preparedStatement.setString(1, nombre);
                preparedStatement.setString(2, pais);
                filasAfectadas = preparedStatement.executeUpdate();
            }

            System.out.println("Fabricante agregado exitosamente. Filas afectadas: " + filasAfectadas);
        } catch (SQLException e) {
            System.out.println("Error al ingresar el fabricante: " + e.getMessage());
        }
    }

}

    

