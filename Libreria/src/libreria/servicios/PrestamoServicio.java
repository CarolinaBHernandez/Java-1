/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import libreria.entidades.Prestamo;
import libreria.entidades.persistencia.PrestamoDAO;

/**
 *
 * @author Carolina Hernández
 */

public class PrestamoServicio {

    private PrestamoDAO prestamoDAO;

    public PrestamoServicio() {
        prestamoDAO = new PrestamoDAO();
    }

    public void guardarPrestamo(Prestamo prestamo) {
        prestamoDAO.guardarPrestamo(prestamo);
    }

    public void actualizarPrestamo(Prestamo prestamo) {
        prestamoDAO.actualizarPrestamo(prestamo);
    }

    public void eliminarPrestamo(Prestamo prestamo) {
        prestamoDAO.eliminarPrestamo(prestamo);
    }

    public Prestamo buscarPrestamoPorId(Integer id) {
    return prestamoDAO.buscarPrestamoPorId(id);
}
       public List<Prestamo> listarPrestamoPorId(Integer id) {
    return prestamoDAO.listarPrestamoPorId(id);
}

}

