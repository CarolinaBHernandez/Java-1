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
public class FamiliasServicio {

    private Connection conexion;
    private Scanner scanner;

    public FamiliasServicio(Connection conexion) {
        this.conexion = conexion;
        this.scanner = new Scanner(System.in);
    }

    public void listarFamilias() {
        try {
            String sql = "SELECT nombre FROM familias WHERE num_hijos >= 3 AND edad_maxima < 10";

            PreparedStatement statement = conexion.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();

            System.out.println("Familias con al menos 3 hijos y edad máxima inferior a 10 años:");

            while (resultado.next()) {

                String nombre = resultado.getString("nombre");

                System.out.println("Apellido de la familia: " + nombre);

                System.out.println("--------------------");
            }

            resultado.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    }
       public void encuentraHotmail() {
    String sql = "SELECT * FROM familias WHERE email LIKE '%hotmail%';";

    try (PreparedStatement statement = conexion.prepareStatement(sql);
         ResultSet resultado = statement.executeQuery()) {

        System.out.println("Familias con dirección de correo Hotmail:");

        while (resultado.next()) {
            int id_familia = resultado.getInt("id_familia");
            System.out.println("Id familia: " + id_familia);

            String nombre = resultado.getString("nombre");
            System.out.println("Nombre: " + nombre);

            int edad_minima = resultado.getInt("edad_minima");
            System.out.println("Edad mínima: " + edad_minima);

            int edad_maxima = resultado.getInt("edad_maxima");
            System.out.println("Edad máxima: " + edad_maxima);

            int num_hijos = resultado.getInt("num_hijos");
            System.out.println("Número de hijos: " + num_hijos);

            String email = resultado.getString("email");
            System.out.println("Email: " + email);

            int id_casa_familia = resultado.getInt("id_casa_familia");
            System.out.println("Id Casa: " + id_casa_familia);

            System.out.println("--------------------");
        }
    } catch (SQLException e) {
        System.out.println("Error al ejecutar la consulta: " + e.getMessage());
    }
}

    }

