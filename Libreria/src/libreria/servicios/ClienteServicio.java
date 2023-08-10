/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;
import libreria.entidades.Cliente;
import libreria.entidades.persistencia.ClienteDAO;

/**
 *
 * @author Carolina Hernández
 */


public class ClienteServicio {
    private final ClienteDAO clienteDAO;

    public ClienteServicio() {
        clienteDAO = new ClienteDAO();
    }

    public void guardarCliente(Cliente cliente) {
        clienteDAO.guardarCliente(cliente);
    }

    public void actualizarCliente(Cliente cliente) {
        clienteDAO.actualizarCliente(cliente);
    }

    public void eliminarCliente(Cliente cliente) {
        clienteDAO.eliminarCliente(cliente);
    }

    public Cliente buscarClientePorId(Integer id) {
        return clienteDAO.buscarClientePorId(id);
    }
}
