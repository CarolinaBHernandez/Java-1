package tienda.servicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class ServicioProducto {
    private Connection conexion;
    private Scanner scanner;

    public ServicioProducto(Connection conexion) {
        this.conexion = conexion;
        this.scanner = new Scanner(System.in);
    }

   public void listarProductos() {
    try (Statement sentencia = conexion.createStatement()) {
        String sql = "SELECT nombre FROM producto";
        ResultSet resultado = sentencia.executeQuery(sql);

        System.out.println("Consulta: Lista de todos los productos");
        while (resultado.next()) {
            String nombre = resultado.getString("nombre");
            System.out.println(nombre);
        }
    } catch (SQLException e) {
        System.out.println("Error al listar los productos: " + e.getMessage());
    }
}


    public void listarNombresYPrecios() {
        try {
            String sql = "SELECT nombre, precio FROM producto";
            try (Statement sentencia = conexion.createStatement(); ResultSet resultado = sentencia.executeQuery(sql)) {
                
                System.out.println("Consulta: Lista de nombres y precios de todos los productos");
                while (resultado.next()) {
                    String nombre = resultado.getString("nombre");
                    double precio = resultado.getDouble("precio");
                    System.out.println(nombre + " - " + precio);
                }
                
            }
        } catch (SQLException e) {
            System.out.println("Error al listar los productos: " + e.getMessage());
        }
    }

public void listarProductosPorPrecio(double precioMinimo, double precioMaximo) {
    try {
        String sql = "SELECT nombre, precio FROM producto WHERE precio BETWEEN ? AND ?";
        try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
            preparedStatement.setDouble(1, precioMinimo);
            preparedStatement.setDouble(2, precioMaximo);
            try (ResultSet resultado = preparedStatement.executeQuery()) {
                System.out.println("Consulta: Lista de productos por rango de precio");
                while (resultado.next()) {
                    String nombre = resultado.getString("nombre");
                    double precio = resultado.getDouble("precio");
                    System.out.println(nombre + " - " + precio);
                }
            }
        }
    } catch (SQLException e) {
        System.out.println("Error al listar los productos: " + e.getMessage());
    }
}


    public void listarPortatiles() {
        try {
            String sql = "SELECT nombre, precio FROM producto WHERE nombre LIKE '%Portátil%'";
            try (Statement sentencia = conexion.createStatement(); ResultSet resultado = sentencia.executeQuery(sql)) {
                
                System.out.println("Consulta: Lista de Portátiles");
                while (resultado.next()) {
                    String nombre = resultado.getString("nombre");
                    double precio = resultado.getDouble("precio");
                    System.out.println(nombre + " - " + precio);
                }
                
            }
        } catch (SQLException e) {
            System.out.println("Error al listar los productos: " + e.getMessage());
        }
    }

    public void listarProductoMasBarato() {
        try {
            String sql = "SELECT nombre, precio FROM producto ORDER BY precio ASC LIMIT 1";
            try (Statement sentencia = conexion.createStatement(); ResultSet resultado = sentencia.executeQuery(sql)) {
                
                System.out.println("Consulta: Producto más barato");
                if (resultado.next()) {
                    String nombre = resultado.getString("nombre");
                    double precio = resultado.getDouble("precio");
                    System.out.println(nombre + " - " + precio);
                }
                
            }
        } catch (SQLException e) {
            System.out.println("Error al listar el producto más barato: " + e.getMessage());
        }
    }

    public void agregarProducto() {
        try {
            System.out.println("Ingrese el nombre del producto:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el precio del producto:");
            double precio = scanner.nextDouble();
            scanner.nextLine(); 

            String sql = "INSERT INTO producto (nombre, precio) VALUES (?, ?)";
            int filasAfectadas;
            try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
                preparedStatement.setString(1, nombre);
                preparedStatement.setDouble(2, precio);
                filasAfectadas = preparedStatement.executeUpdate();
            }

            System.out.println("Producto agregado exitosamente. Filas afectadas: " + filasAfectadas);
        } catch (SQLException e) {
            System.out.println("Error al agregar el producto: " + e.getMessage());
        }
    }
    
    public void editarProducto() {
    try {
        System.out.println("Ingrese el ID del producto a editar:");
        int idProducto = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Ingrese el nuevo nombre del producto:");
        String nuevoNombre = scanner.nextLine();
        System.out.println("Ingrese el nuevo precio del producto:");
        double nuevoPrecio = scanner.nextDouble();
        scanner.nextLine(); 

        String sql = "UPDATE producto SET nombre = ?, precio = ? WHERE id = ?";
        int filasAfectadas;
        try (PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
            preparedStatement.setString(1, nuevoNombre);
            preparedStatement.setDouble(2, nuevoPrecio);
            preparedStatement.setInt(3, idProducto);
            filasAfectadas = preparedStatement.executeUpdate();
        }

        System.out.println("Producto editado exitosamente. Filas afectadas: " + filasAfectadas);
    } catch (SQLException e) {
        System.out.println("Error al editar el producto: " + e.getMessage());
    }
}

    
}
