/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicioPractico1.controller;
 
import com.ejercicioPractico1.domain.Cliente;
import com.ejercicioPractico1.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
 
@Controller
public class ClienteController {
    @Autowired
    private ClienteService clienteService;
 
    @GetMapping("/clientes")
    public String listarClientes(Model model) {
        model.addAttribute("clientes", clienteService.listarClientes());
        return "clientes";
    }
 
    @PostMapping("/guardarCliente")
    public String guardarCliente(Cliente cliente) {
        clienteService.guardarCliente(cliente);
        return "redirect:/clientes";
    }
 
    @GetMapping("/eliminarCliente")
    public String eliminarCliente(Long id) {
        clienteService.eliminarCliente(id);
        return "redirect:/clientes";
    }
}
