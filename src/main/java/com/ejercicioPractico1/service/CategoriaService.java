/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejercicioPractico1.service;
 
import com.ejercicioPractico1.domain.Categoria;
import java.util.List;
 
public interface CategoriaService {
    List<Categoria> listarCategorias();
    void guardarCategoria(Categoria categoria);
    void eliminarCategoria(Long id);
}
