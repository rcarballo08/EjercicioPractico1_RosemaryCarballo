/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejercicioPractico1.service;
 
import com.ejercicioPractico1.domain.Cliente;
import java.util.List;
 
public interface ClienteService {
    List<Cliente> listarClientes();
    void guardarCliente(Cliente cliente);
    void eliminarCliente(Long id);
}
