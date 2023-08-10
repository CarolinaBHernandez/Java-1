/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.entidades.persistencia;

import libreria.entidades.Cliente;

/**
 *
 * @author Carolina Hernández
 */


public class ClienteDAO extends DAO<Cliente> {

    public ClienteDAO() {
        super();
    }

    public void guardarCliente(Cliente cliente) {
        conectar();
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        desconectar();
    }

    public void actualizarCliente(Cliente cliente) {
        editar(cliente);
    }

    public void eliminarCliente(Cliente cliente) {
        eliminar(cliente);
    }

    public Cliente buscarClientePorId(Integer id) {
        conectar();
        Cliente cliente = em.find(Cliente.class, id);
        desconectar();
        return cliente;
    }
}

    

