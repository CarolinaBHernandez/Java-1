/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.entidades.persistencia;

import java.util.List;
import javax.persistence.TypedQuery;
import libreria.entidades.Editorial;

/**
 *
 * @author Carolina Hernández
 */
public class EditorialDAO extends DAO<Editorial> {

    public Editorial buscarEditorial(Integer id) {
        conectar();
        Editorial editorial = em.find(Editorial.class, id);
        desconectar();
        return editorial;
    }

    public void crearEditorial(Editorial editorial) {
        guardar(editorial);
    }

    public void actualizarEditorial(Editorial editorial) {
        editar(editorial);
    }

    public void eliminarEditorial(Editorial editorial) {
        eliminar(editorial);
    }

    public void cambiarEstadoEditorial(Integer id, boolean estado) {
        Editorial editorial = buscarEditorial(id);
        if (editorial != null) {
            editorial.setAlta(estado);
            conectar();
            em.getTransaction().begin();
            em.merge(editorial);
            em.getTransaction().commit();
            desconectar();
        } else {
            System.out.println("La editorial no existe");
        }
    }

    public void editarEditorial(Editorial editorial) {
        Editorial editorialExistente = buscarEditorial(editorial.getId());
        if (editorialExistente != null) {
            editorialExistente.setNombre(editorial.getNombre());
            conectar();
            em.getTransaction().begin();
            em.merge(editorialExistente);
            em.getTransaction().commit();
            desconectar();
        } else {
            System.out.println("La editorial no existe");
        }
    }
    public List<Editorial> buscarPorNombre(String nombre) {
    conectar();
    TypedQuery<Editorial> query = em.createQuery("SELECT e FROM Editorial e WHERE e.nombre = :nombre", Editorial.class);
    query.setParameter("nombre", nombre);
    List<Editorial> editoriales = query.getResultList();
    desconectar();
    return editoriales;
}
    public List<Editorial> obtenerTodasEditoriales() {
    conectar();
    TypedQuery<Editorial> query = em.createQuery("SELECT e FROM Editorial e", Editorial.class);
    List<Editorial> editoriales = query.getResultList();
    desconectar();
    return editoriales;
}

}





