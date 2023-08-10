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

/**
 *
 * @author Carolina Hernández
 */
public class ClientesServicio {
    
    private Connection conexion;

    public ClientesServicio(Connection conexion) {
        this.conexion = conexion;
    }
    
     public void listarClientes() {

    try {
        String sql = "SELECT e.*, c.*, casa.*, com.comentario " +
                     "FROM estancias e " +
                     "JOIN clientes c ON e.id_cliente = c.id_cliente " +
                     "JOIN casas casa ON e.id_casa = casa.id_casa " +
                     "LEFT JOIN comentarios com ON casa.id_casa = com.id_casa";

        PreparedStatement statement = conexion.prepareStatement(sql);
        ResultSet resultado = statement.executeQuery();

        System.out.println("Estancias con Cliente y Casa:");

        while (resultado.next()) {
            int id_estancia = resultado.getInt("e.id_estancia");
            int id_cliente = resultado.getInt("e.id_cliente");
            int id_casa = resultado.getInt("e.id_casa");
            String nombre_huesped = resultado.getString("e.nombre_huesped");
            java.sql.Date fecha_desde = resultado.getDate("e.fecha_desde");
            java.sql.Date fecha_hasta = resultado.getDate("e.fecha_hasta");
            String nombre_cliente = resultado.getString("c.nombre");
            String calle = resultado.getString("casa.calle");
            int numero = resultado.getInt("casa.numero");
            String codigo_postal = resultado.getString("casa.codigo_postal");
            String ciudad = resultado.getString("casa.ciudad");
            String pais = resultado.getString("casa.pais");
            String comentario = resultado.getString("com.comentario");

            System.out.println("ID Estancia: " + id_estancia);
            System.out.println("ID Cliente: " + id_cliente);
            System.out.println("ID Casa: " + id_casa);
            System.out.println("Nombre Huésped: " + nombre_huesped);
            System.out.println("Fecha Desde: " + fecha_desde);
            System.out.println("Fecha Hasta: " + fecha_hasta);
            System.out.println("Nombre Cliente: " + nombre_cliente);
            System.out.println("Dirección: " + calle + " " + numero + ", " + codigo_postal + " " + ciudad + ", " + pais);
            System.out.println("Comentario: " + comentario);
            System.out.println("--------------------");
        }

        resultado.close();
        statement.close();
    } catch (SQLException e) {
        System.out.println("Error al ejecutar la consulta: " + e.getMessage());
    }
}
}
