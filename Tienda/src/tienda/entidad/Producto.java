/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.entidad;

/**
 *
 * @author Carolina Hernández
 */
public class Producto {

    private int codigo;
    private String nombre;
    private double precio;
    private int codigoFabricante;

    public Producto() {
    }

    public Producto(int codigo, String nombre, double precio, int codigoFabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.codigoFabricante = codigoFabricante;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigoFabricante() {
        return codigoFabricante;
    }

    public void setCodigoFabricante(int codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }
       @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", codigoFabricante=" + codigoFabricante +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Producto producto = (Producto) obj;
        return codigo == producto.codigo &&
                Double.compare(producto.precio, precio) == 0 &&
                codigoFabricante == producto.codigoFabricante &&
                nombre.equals(producto.nombre);
    }

    @Override
    public int hashCode() {
        int result = codigo;
        result = 31 * result + nombre.hashCode();
        result = 31 * result + Double.hashCode(precio);
        result = 31 * result + codigoFabricante;
        return result;
    }

}
