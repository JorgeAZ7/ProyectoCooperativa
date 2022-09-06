package com.example.ProyectoCooperativa.servicios;

import com.example.ProyectoCooperativa.entidades.Cliente;

import java.util.List;

public interface ServicioCliente {
    public List<Cliente> listarCliente();
    public Cliente guardarClientes(Cliente cli);
    public Cliente consultarClientesPorId(Integer documento);
    public Cliente actualizarClientes(Cliente cli);
    public void eliminarClientes(Integer documento);

}
