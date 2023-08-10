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
import java.util.Date;


/**
 *
 * @author Carolina Hernández
 */
public class ComentariosServicio {
        private Connection conexion;
   

    public ComentariosServicio(Connection conexion) {
        this.conexion = conexion;
      
    }
    
       
    public void listarCasasLimpias() {
    try {
        String sql = "SELECT c.* " +
                     "FROM casas c " +
                     "JOIN comentarios com ON c.id_casa = com.id_casa " +
                     "WHERE c.pais = 'Reino Unido' AND com.comentario LIKE '%limpia%'";

        PreparedStatement statement = conexion.prepareStatement(sql);
        ResultSet resultado = statement.executeQuery();

        System.out.println("Casas limpias en el Reino Unido:");

        while (resultado.next()) {
            int id_casa = resultado.getInt("id_casa");
            String calle = resultado.getString("calle");
            int numero = resultado.getInt("numero");
            String codigo_postal = resultado.getString("codigo_postal");
            String ciudad = resultado.getString("ciudad");
            String pais = resultado.getString("pais");
            Date fecha_desde = resultado.getDate("fecha_desde");
            Date fecha_hasta = resultado.getDate("fecha_hasta");
            int tiempo_minimo = resultado.getInt("tiempo_minimo");
            int tiempo_maximo = resultado.getInt("tiempo_maximo");
            double precio_habitacion = resultado.getDouble("precio_habitacion");
            String tipo_vivienda = resultado.getString("tipo_vivienda");

            System.out.println("ID Casa: " + id_casa);
            System.out.println("Dirección: " + calle + " " + numero + ", " + codigo_postal + " " + ciudad + ", " + pais);
            System.out.println("Fecha desde: " + fecha_desde);
            System.out.println("Fecha hasta: " + fecha_hasta);
            System.out.println("Tiempo mínimo de estadía: " + tiempo_minimo + " días");
            System.out.println("Tiempo máximo de estadía: " + tiempo_maximo + " días");
            System.out.println("Precio de la habitación: " + precio_habitacion);
            System.out.println("Tipo de vivienda: " + tipo_vivienda);
            System.out.println("--------------------");
        }

        resultado.close();
        statement.close();
    } catch (SQLException e) {
        System.out.println("Error al ejecutar la consulta: " + e.getMessage());
    }
}



}
