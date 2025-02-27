/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicioPractico1.service.impl;
 
import com.ejercicioPractico1.dao.CategoriaRepository;
import com.ejercicioPractico1.domain.Categoria;
import com.ejercicioPractico1.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;
 
@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;
 
    @Override
    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }
 
    @Override
    public void guardarCategoria(Categoria categoria) {
        categoriaRepository.save(categoria);
    }
 
    @Override
    public void eliminarCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }
}
