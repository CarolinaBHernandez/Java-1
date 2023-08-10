/*

 */
package tienda.persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tienda.entidad.Producto;

/**
 *
 * @author Carolina Hernández
 */
public class EntidadDaoExt extends DAO {

    public List<Producto> obtenerTodosLosProductos() throws SQLException, Exception {
        List<Producto> productos = new ArrayList<>();
        String query = "SELECT * FROM producto";
        try {
            consultarBase(query);
            while (resultado.next()) {
                int codigo = resultado.getInt("codigo");
                String nombre = resultado.getString("nombre");
                double precio = resultado.getDouble("precio");
                int codigoFabricante = resultado.getInt("codigo_fabricante");

                Producto producto = new Producto(codigo, nombre, precio, codigoFabricante);
                productos.add(producto);
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            desconectarBase();
        }
        return productos;
    }

    public void insertarProducto(Producto producto) throws SQLException, Exception {
        String sql = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante) VALUES ("
                + producto.getCodigo() + ", '"
                + producto.getNombre() + "', "
                + producto.getPrecio() + ", "
                + producto.getCodigoFabricante() + ")";
        try {
            instarModificarEliminar(sql);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void actualizarProducto(Producto producto) throws SQLException, Exception {
        String sql = "UPDATE producto SET nombre = '"
                + producto.getNombre() + "', precio = "
                + producto.getPrecio() + ", codigo_fabricante = "
                + producto.getCodigoFabricante() + " WHERE codigo = "
                + producto.getCodigo();
        try {
            instarModificarEliminar(sql);
        } catch (Exception ex) {
            throw ex;
        }
    }

    public void eliminarProducto(int codigo) throws SQLException, Exception {
        String sql = "DELETE FROM producto WHERE codigo = " + codigo;
        try {
            instarModificarEliminar(sql);
        } catch (Exception ex) {
            throw ex;
        }
    }

}
    

