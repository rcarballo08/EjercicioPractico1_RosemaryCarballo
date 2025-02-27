/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicioPractico1.service.impl;
 
import com.ejercicioPractico1.dao.ClienteRepository;
import com.ejercicioPractico1.domain.Cliente;
import com.ejercicioPractico1.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
 
@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
 
    @Override
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }
 
    @Override
    public void guardarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }
 
    @Override
    public void eliminarCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}