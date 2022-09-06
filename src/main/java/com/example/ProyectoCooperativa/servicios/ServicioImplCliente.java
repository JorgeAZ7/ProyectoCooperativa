package com.example.ProyectoCooperativa.servicios;

import com.example.ProyectoCooperativa.entidades.Cliente;
import com.example.ProyectoCooperativa.repositorio.RepositorioCliente;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServicioImplCliente implements ServicioCliente{
    @Autowired
    private RepositorioCliente repositorioCliente;

    @Override
    public List<Cliente> listarCliente() {
        return repositorioCliente.findAll();
    }

    @Override
    public Cliente guardarClientes(Cliente cli) {
        return repositorioCliente.save(cli);
    }

    @Override
    public Cliente consultarClientesPorId(Integer documento) {
        return repositorioCliente.findById(documento).get();
    }

    @Override
    public Cliente actualizarClientes(Cliente cli) {
        return repositorioCliente.save(cli);
    }

    @Override
    public void eliminarClientes(Integer documento) {
        repositorioCliente.deleteById(documento);
    }
}
