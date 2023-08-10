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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Carolina Hernández
 */
public class CasasServicio {

    private Connection conexion;
    private Scanner scanner;

    public CasasServicio(Connection conexion) {
        this.conexion = conexion;
        this.scanner = new Scanner(System.in);
    }

    public void listarCasas() {
        try {
            String sql = "SELECT * FROM casas WHERE pais = 'Reino Unido' AND fecha_desde <= '2020-08-31' AND fecha_hasta >= '2020-08-01'";

            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();

            System.out.println("Casas disponibles en Reino Unido entre el 1 y el 31 de agosto de 2020:");

            while (resultado.next()) {
                int idCasa = resultado.getInt("id_casa");
                String calle = resultado.getString("calle");
                int numero = resultado.getInt("numero");
                String codigoPostal = resultado.getString("codigo_postal");
                String ciudad = resultado.getString("ciudad");
                String pais = resultado.getString("pais");

                System.out.println("ID: " + idCasa);
                System.out.println("Calle: " + calle);
                System.out.println("Número: " + numero);
                System.out.println("Código Postal: " + codigoPostal);
                System.out.println("Ciudad: " + ciudad);
                System.out.println("País: " + pais);
                // Imprimir los demás datos de la casa

                System.out.println("--------------------");
            }

            resultado.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    }

    public void casasDisponibles() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese la fecha de inicio (formato dd/MM/yyyy): ");
            String fechaInicioStr = scanner.nextLine();
            System.out.print("Ingrese el número de días: ");
            int numDias = scanner.nextInt();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaInicio = dateFormat.parse(fechaInicioStr);

            // Calcular fecha final sumando el número de días a la fecha de inicio
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTime(fechaInicio);
            calendar.add(java.util.Calendar.DAY_OF_MONTH, numDias);
            Date fechaFin = calendar.getTime();

            String sql = "SELECT * FROM casas WHERE fecha_desde <= ? AND fecha_hasta >= ?";

            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setDate(1, new java.sql.Date(fechaInicio.getTime()));
            statement.setDate(2, new java.sql.Date(fechaFin.getTime()));

            ResultSet resultado = statement.executeQuery();

            System.out.println("Casas disponibles desde " + fechaInicio + " durante " + numDias + " días:");

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

                System.out.println("ID: " + id_casa);
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

            scanner.close();
        } catch (ParseException e) {
            System.out.println("Error al analizar la fecha: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    }
    
       public void incrementarPrecio() {
        try {
            String sql = "SELECT id_casa, precio_habitacion FROM casas WHERE pais = 'Reino Unido'";

            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();

            while (resultado.next()) {
                int id_casa = resultado.getInt("id_casa");
                double precio_habitacion = resultado.getDouble("precio_habitacion");

                // Calcular el incremento del 5%
                double incremento = precio_habitacion * 0.05;
                double nuevo_precio = precio_habitacion + incremento;

                // Actualizar el precio en la base de datos
                String updateSql = "UPDATE casas SET precio_habitacion = ? WHERE id_casa = ?";
                PreparedStatement updateStatement = conexion.prepareStatement(updateSql);
                updateStatement.setDouble(1, nuevo_precio);
                updateStatement.setInt(2, id_casa);
                updateStatement.executeUpdate();

                updateStatement.close();
            }

            resultado.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    }
         public void obtenerNumCasas() {
        try {
            String sql = "SELECT pais, COUNT(*) AS num_casas FROM casas GROUP BY pais";

            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();

            System.out.println("Número de casas por país:");

            while (resultado.next()) {
                String pais = resultado.getString("pais");
                int num_casas = resultado.getInt("num_casas");

                System.out.println("País: " + pais);
                System.out.println("Número de casas: " + num_casas);
                System.out.println("--------------------");
            }

            resultado.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    }

   
}




