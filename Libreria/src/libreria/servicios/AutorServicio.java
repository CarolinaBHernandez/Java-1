/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import libreria.entidades.Autor;
import libreria.entidades.persistencia.AutorDAO;

/**
 *
 * @author Carolina Hernández
 */
public class AutorServicio {

    private AutorDAO autorDAO = new AutorDAO();

       private static int contadorIds = 1;

    private int nuevoId() {
        return contadorIds++;
    }

    public void guardarAutor(Autor autor) {
        int id = nuevoId();
        autor.setId(id);
        autorDAO.guardar(autor);
    }

    public void actualizarAutor(Autor autor) {
        autorDAO.actualizar(autor);
    }

    public void eliminarAutor(Autor autor) {
        autorDAO.eliminar(autor);
    }

    public Autor buscarAutorPorId(Integer id) {
        return autorDAO.buscarPorId(id);
    }
     public List<Autor> buscarAutorPorNombre(String nombre) {
        return autorDAO.buscarPorNombre(nombre);
    }

    public List<Autor> obtenerTodosAutores() {
        return autorDAO.obtenerTodos();
    }

   
}



