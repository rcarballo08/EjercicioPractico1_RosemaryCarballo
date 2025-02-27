/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejercicioPractico1.service;
 
import com.ejercicioPractico1.domain.Producto;
import java.util.List;
 
public interface ProductoService {
    List<Producto> listarProductos();
    void guardarProducto(Producto producto);
    void eliminarProducto(Long id);
}
