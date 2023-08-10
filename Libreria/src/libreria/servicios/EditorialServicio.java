/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import libreria.entidades.Editorial;
import libreria.entidades.persistencia.EditorialDAO;

/**
 *
 * @author Carolina Hernández
 */
public class EditorialServicio {
    private final EditorialDAO editorialDAO;

    public EditorialServicio() {
        this.editorialDAO = new EditorialDAO();
    }
          private static int contadorIds = 1;

    private int nuevoId() {
        return contadorIds++;
    }

    public void guardarEditorial(Editorial editorial) {
        int id = nuevoId();
        editorial.setId(id);
        editorialDAO.crearEditorial(editorial);
    }

    public void actualizarEditorial(Editorial editorial) {
        editorialDAO.actualizarEditorial(editorial);
    }

    public void eliminarEditorial(Editorial editorial) {
        editorialDAO.eliminarEditorial(editorial);
    }

    public Editorial buscarEditorial(Integer id) {
        return editorialDAO.buscarEditorial(id);
    }
    public List<Editorial> buscarEditorialPorNombre(String nombre) {
        return editorialDAO.buscarPorNombre(nombre);
    }
    public List<Editorial> obtenerTodasEditoriales() {
    return editorialDAO.obtenerTodasEditoriales();
}

}
