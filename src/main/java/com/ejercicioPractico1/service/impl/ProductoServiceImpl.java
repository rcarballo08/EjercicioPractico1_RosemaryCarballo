/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicioPractico1.service.impl;
 
import com.ejercicioPractico1.dao.ProductoRepository;
import com.ejercicioPractico1.domain.Producto;
import com.ejercicioPractico1.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;
 
@Service
public class ProductoServiceImpl implements ProductoService {
    @Autowired
    private ProductoRepository productoRepository;
 
    @Override
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }
 
    @Override
    public void guardarProducto(Producto producto) {
        productoRepository.save(producto);
    }
 
    @Override
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }
}
