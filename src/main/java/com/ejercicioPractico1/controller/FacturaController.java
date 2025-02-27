/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicioPractico1.controller;
 
import com.ejercicioPractico1.domain.Factura;
import com.ejercicioPractico1.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
 
@Controller
public class FacturaController {
    @Autowired
    private FacturaService facturaService;
 
    @GetMapping("/facturas")
    public String listarFacturas(Model model) {
        model.addAttribute("facturas", facturaService.listarFacturas());
        return "facturas";
    }
 
    @PostMapping("/guardarFactura")
    public String guardarFactura(Factura factura) {
        facturaService.guardarFactura(factura);
        return "redirect:/facturas";
    }
 
    @GetMapping("/eliminarFactura")
    public String eliminarFactura(Long id) {
        facturaService.eliminarFactura(id);
        return "redirect:/facturas";
    }
}
