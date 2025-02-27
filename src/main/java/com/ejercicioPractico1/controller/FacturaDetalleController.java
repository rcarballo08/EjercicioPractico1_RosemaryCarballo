/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicioPractico1.controller;
 
import com.ejercicioPractico1.domain.FacturaDetalle;
import com.ejercicioPractico1.service.FacturaDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
 
@Controller
public class FacturaDetalleController {
    @Autowired
    private FacturaDetalleService facturaDetalleService;
 
    @GetMapping("/detalles")
    public String listarDetalles(Model model) {
        model.addAttribute("detalles", facturaDetalleService.listarDetalles());
        return "detalles";
    }
 
    @PostMapping("/guardarDetalle")
    public String guardarDetalle(FacturaDetalle detalle) {
        facturaDetalleService.guardarDetalle(detalle);
        return "redirect:/detalles";
    }
 
    @GetMapping("/eliminarDetalle")
    public String eliminarDetalle(Long id) {
        facturaDetalleService.eliminarDetalle(id);
        return "redirect:/detalles";
    }
}
