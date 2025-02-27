/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicioPractico1.controller;
 
import com.ejercicioPractico1.domain.Categoria;
import com.ejercicioPractico1.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
 
@Controller
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;
 
    @GetMapping("/categorias")
    public String listarCategorias(Model model) {
        model.addAttribute("categorias", categoriaService.listarCategorias());
        return "categorias";
    }
 
    @PostMapping("/guardarCategoria")
    public String guardarCategoria(Categoria categoria) {
        categoriaService.guardarCategoria(categoria);
        return "redirect:/categorias";
    }
 
    @GetMapping("/eliminarCategoria")
    public String eliminarCategoria(Long id) {
        categoriaService.eliminarCategoria(id);
        return "redirect:/categorias";
    }
}

