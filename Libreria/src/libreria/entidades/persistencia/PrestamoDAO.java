/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.entidades.persistencia;
import java.util.List;
import javax.persistence.Query;
import libreria.entidades.Prestamo;
/**
 *
 * @author Carolina Hernández
 */

public class PrestamoDAO extends DAO<Prestamo> {

    public PrestamoDAO() {
        super();
    }

    public void guardarPrestamo(Prestamo prestamo) {
        conectar();
        em.getTransaction().begin();
        em.persist(prestamo);
        em.getTransaction().commit();
        desconectar();
    }

    public void actualizarPrestamo(Prestamo prestamo) {
        editar(prestamo);
    }

    public void eliminarPrestamo(Prestamo prestamo) {
        eliminar(prestamo);
    }

    public Prestamo buscarPrestamoPorId(Integer id) {
        conectar();
        Prestamo prestamo = em.find(Prestamo.class, id);
        desconectar();
        return prestamo;
    }
     public List<Prestamo> listarPrestamoPorId(Integer idCliente) {
    conectar();
    Query query = em.createQuery("SELECT p FROM Prestamo p WHERE p.cliente.id = :idCliente");
    query.setParameter("idCliente", idCliente);
    List<Prestamo> prestamos = query.getResultList();
    desconectar();
    return prestamos;
}

    
}
