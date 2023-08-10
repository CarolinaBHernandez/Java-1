/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.entidades.persistencia;

import java.util.List;
import javax.persistence.TypedQuery;
import libreria.entidades.Libro;

/**
 *
 * @author Carolina Hernández
 */
public class LibroDAO extends DAO<Libro> {

    public Libro buscarLibro(Long isbn) {
        conectar();
        Libro libro = em.find(Libro.class, isbn);
        desconectar();
        return libro;
    }
    @Override
    public void guardar(Libro libro) {
    conectar();
    em.getTransaction().begin();
    em.persist(libro);
    em.getTransaction().commit();
    desconectar();
}

    public void crearLibro(Libro libro) {
        guardar(libro);
    }

    public void actualizarLibro(Libro libro) {
        editar(libro);
    }

    public void eliminarLibro(Long isbn) {
        conectar();
        em.getTransaction().begin();
        Libro libro = em.find(Libro.class, isbn);
        if (libro != null) {
            em.remove(libro);
        }
        em.getTransaction().commit();
        desconectar();
    }

    public void cambiarEstadoLibro(Long isbn, boolean estado) {
        conectar();
        em.getTransaction().begin();
        Libro libro = em.find(Libro.class, isbn);
        if (libro != null) {
            libro.setAlta(estado);
            em.getTransaction().commit();
        } else {
            System.out.println("El libro no existe");
        }
        desconectar();
    }

    public void editarLibro(Libro libro) {
        conectar();
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
        desconectar();
    }

    public List<Libro> buscarPorTitulo(String titulo) {
        conectar();
        TypedQuery<Libro> query = em.createQuery("SELECT l FROM Libro l WHERE l.titulo = :titulo", Libro.class);
        query.setParameter("titulo", titulo);
        List<Libro> libros = query.getResultList();
        desconectar();
        return libros;
    }

    public List<Libro> buscarLibrosPorNombreAutor(String nombreAutor) {
        conectar();
        TypedQuery<Libro> query = em.createNamedQuery("Libro.buscarPorNombreAutor", Libro.class);
        query.setParameter("nombreAutor", nombreAutor);
        List<Libro> libros = query.getResultList();
        desconectar();
        return libros;
    }
 
    public List<Libro> obtenerTodosLibros() {
    conectar();
    TypedQuery<Libro> query = em.createQuery("SELECT l FROM Libro l", Libro.class);
    List<Libro> libros = query.getResultList();
    desconectar();
    return libros;
}
    public List<Libro> buscarLibrosPorEditorial(String nombreEditorial) {
    conectar();
    TypedQuery<Libro> query = em.createQuery("SELECT l FROM Libro l WHERE l.editorial.nombre = :nombreEditorial", Libro.class);
    query.setParameter("nombreEditorial", nombreEditorial);
    List<Libro> libros = query.getResultList();
    desconectar();
    return libros;
}

}
