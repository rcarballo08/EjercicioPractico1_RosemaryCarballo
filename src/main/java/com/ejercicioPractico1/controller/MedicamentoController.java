/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicioPractico1.controller;
 
import com.ejercicioPractico1.domain.Medicamento;
import com.ejercicioPractico1.service.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
 
@Controller
public class MedicamentoController {
    @Autowired
    private MedicamentoService medicamentoService;
 
    @GetMapping("/medicamentos")
    public String listarMedicamentos(Model model) {
        model.addAttribute("medicamentos", medicamentoService.listarMedicamentos());
        return "medicamentos";
    }
 
    @PostMapping("/guardarMedicamento")
    public String guardarMedicamento(Medicamento medicamento) {
        medicamentoService.guardarMedicamento(medicamento);
        return "redirect:/medicamentos";
    }
 
    @GetMapping("/eliminarMedicamento")
    public String eliminarMedicamento(Long id) {
        medicamentoService.eliminarMedicamento(id);
        return "redirect:/medicamentos";
    }
}
