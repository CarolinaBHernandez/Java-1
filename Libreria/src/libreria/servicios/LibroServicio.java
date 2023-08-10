/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Libro;
import libreria.entidades.persistencia.LibroDAO;

/**
 *
 * @author Carolina Hernández
 */
public class LibroServicio {

    private LibroDAO libroDAO = new LibroDAO();

    public void guardarLibro(Libro libro) {
        libroDAO.guardar(libro);
    }

    public void actualizarLibro(Libro libro) {
        libroDAO.actualizarLibro(libro);
    }

    public void eliminarLibro(Long isbn) {
        libroDAO.eliminarLibro(isbn);
    }

    public Libro buscarLibroPorISBN(Long isbn) {
        return libroDAO.buscarLibro(isbn);
    }

    public List<Libro> buscarLibroPorTitulo(String titulo) {
        return libroDAO.buscarPorTitulo(titulo);
    }

    public List<Libro> obtenerTodosLibros() {
        return libroDAO.obtenerTodosLibros();
    }
     public List<Libro> buscarLibrosPorNombreAutor(String nombreAutor) {
        return libroDAO.buscarLibrosPorNombreAutor(nombreAutor);
    }

    public List<Libro> buscarLibrosPorEditorial(String nombreEditorial) {
        return libroDAO.buscarLibrosPorEditorial(nombreEditorial);
    }
    public void editarLibro(Libro libro) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();
    
    em.getTransaction().begin();
    Libro libroExistente = em.find(Libro.class, libro.getIsbn());
    if (libroExistente != null) {
        libroExistente.setTitulo(libro.getTitulo());
        libroExistente.setAutor(libro.getAutor());
        libroExistente.setAnio(libro.getAnio());
        libroExistente.setEjemplares(libro.getEjemplares());
        libroExistente.setEjemplaresPrestados(libro.getEjemplaresPrestados());
        libroExistente.setEjemplaresRestantes(libro.getEjemplaresRestantes());
        libroExistente.setEditorial(libro.getEditorial());
        em.getTransaction().commit();
    } else {
        System.out.println("El libro no existe");
    }
    
    em.close();
    emf.close();
}


}
