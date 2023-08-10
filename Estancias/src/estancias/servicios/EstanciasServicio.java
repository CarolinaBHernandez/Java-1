/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancias.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */
public class EstanciasServicio {

    private Connection conexion;
    private Scanner scanner;

    public EstanciasServicio(Connection conexion) {
        this.conexion = conexion;
        this.scanner = new Scanner(System.in);
    }

public void listarEstancias() {
    try {
        String sql = "SELECT e.*, c.*, casa.* " +
                     "FROM estancias e " +
                     "JOIN clientes c ON e.id_cliente = c.id_cliente " +
                     "JOIN casas casa ON e.id_casa = casa.id_casa";

        PreparedStatement statement = conexion.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        System.out.println("Estancias:");

        while (resultSet.next()) {
            int id_estancia = resultSet.getInt("e.id_estancia");
            int id_cliente = resultSet.getInt("e.id_cliente");
            int id_casa = resultSet.getInt("e.id_casa");
            String nombre_huesped = resultSet.getString("e.nombre_huesped");
            java.sql.Date fecha_desde = resultSet.getDate("e.fecha_desde");
            java.sql.Date fecha_hasta = resultSet.getDate("e.fecha_hasta");
            String nombre_cliente = resultSet.getString("c.nombre");
            String calle = resultSet.getString("casa.calle");
            int numero = resultSet.getInt("casa.numero");
            String codigo_postal = resultSet.getString("casa.codigo_postal");
            String ciudad = resultSet.getString("casa.ciudad");
            String pais = resultSet.getString("casa.pais");

            System.out.println("ID Estancia: " + id_estancia);
            System.out.println("ID Cliente: " + id_cliente);
            System.out.println("ID Casa: " + id_casa);
            System.out.println("Nombre Huésped: " + nombre_huesped);
            System.out.println("Fecha Desde: " + fecha_desde);
            System.out.println("Fecha Hasta: " + fecha_hasta);
            System.out.println("Nombre Cliente: " + nombre_cliente);
            System.out.println("Dirección: " + calle + " " + numero + ", " + codigo_postal + " " + ciudad + ", " + pais);
            System.out.println("--------------------");
        }

        resultSet.close();
        statement.close();
    } catch (SQLException e) {
        System.out.println("Error al ejecutar la consulta: " + e.getMessage());
    }
}

    
        public void insertarEstancias() {
      

        System.out.println("Ingrese el ID del cliente: ");
        int idCliente = scanner.nextInt();

        System.out.println("Ingrese el ID de la casa: ");
        int idCasa = scanner.nextInt();

        System.out.println("Ingrese el nombre del huésped: ");
        String nombreHuesped = scanner.nextLine();

        System.out.println("Ingrese la fecha de inicio (en formato YYYY-MM-DD): ");
        String fechaDesdeStr = scanner.nextLine();
        java.sql.Date fechaDesde = java.sql.Date.valueOf(fechaDesdeStr);

        System.out.println("Ingrese la fecha de fin (en formato YYYY-MM-DD): ");
        String fechaHastaStr = scanner.nextLine();
        java.sql.Date fechaHasta = java.sql.Date.valueOf(fechaHastaStr);

        try {
            String sql = "INSERT INTO estancias (id_cliente, id_casa, nombre_huesped, fecha_desde, fecha_hasta) " +
                         "VALUES (?, ?, ?, ?, ?)";

            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, idCliente);
            statement.setInt(2, idCasa);
            statement.setString(3, nombreHuesped);
            statement.setDate(4, fechaDesde);
            statement.setDate(5, fechaHasta);

            int filasInsertadas = statement.executeUpdate();

            if (filasInsertadas > 0) {
                System.out.println("La estancia se ha insertado correctamente.");
            } else {
                System.out.println("No se ha podido insertar la estancia.");
            }

            statement.close();
        } catch (SQLException e) {
            System.out.println("Error al insertar la estancia: " + e.getMessage());
        }
    }

}
