/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicioPractico1.controller;
 
import com.ejercicioPractico1.domain.Producto;
import com.ejercicioPractico1.service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller
public class ProductoController {
 
    @Autowired
    private ProductoService productoService;
 
    @GetMapping("/")
    public String inicio(Model model) {
        List<Producto> productos = productoService.listarProductos();
        model.addAttribute("productos", productos);
        model.addAttribute("producto", new Producto());
        return "inicio"; 
    }
 
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Producto producto) {
        productoService.guardarProducto(producto);
        return "redirect:/";
    }
 
    @GetMapping("/eliminar")
    public String eliminar(@RequestParam Long id) {
        productoService.eliminarProducto(id);
        return "redirect:/";
    }
}
