/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.entidades.persistencia;


import java.util.List;
import javax.persistence.TypedQuery;
import libreria.entidades.Autor;

/**
 *
 * @author Carolina Hernández
 */
public class AutorDAO extends DAO<Autor> {

    @Override
    public void eliminar(Autor objeto) {
        conectar();
        em.getTransaction().begin();
        em.remove(em.merge(objeto));
        em.getTransaction().commit();
        desconectar();
    }


    @Override
    protected void editar(Autor objeto) {
        super.editar(objeto); 
    }

    @Override
    public void guardar(Autor objeto) {
        super.guardar(objeto); 
    }

    public Autor buscarPorId(Integer id) {
        conectar();
        Autor autor = em.find(Autor.class, id);
        desconectar();
        return autor;
    }
      public void actualizar(Autor autor) {
        editar(autor);
    }

    public void cambiarEstadoAutor(Integer id, boolean estado) {
        Autor autor = buscarPorId(id);
        if (autor != null) {
            autor.setAlta(estado);
            editar(autor);
        } else {
            System.out.println("El autor no existe");
        }
    }

   
     public List<Autor> buscarPorNombre(String nombre) {
        conectar();
        TypedQuery<Autor> query = em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre", Autor.class);
        query.setParameter("nombre", nombre);
        List<Autor> autores = query.getResultList();
        desconectar();
        return autores;
    }

    public List<Autor> obtenerTodos() {
        conectar();
        TypedQuery<Autor> query = em.createQuery("SELECT a FROM Autor a", Autor.class);
        List<Autor> autores = query.getResultList();
        desconectar();
        return autores;
    }

}


