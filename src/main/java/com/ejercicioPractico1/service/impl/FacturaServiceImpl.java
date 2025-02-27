/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicioPractico1.service.impl;
 
import com.ejercicioPractico1.dao.FacturaRepository;
import com.ejercicioPractico1.domain.Factura;
import com.ejercicioPractico1.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;
 
@Service
public class FacturaServiceImpl implements FacturaService {
    @Autowired
    private FacturaRepository facturaRepository;
 
    @Override
    public List<Factura> listarFacturas() {
        return facturaRepository.findAll();
    }
 
    @Override
    public void guardarFactura(Factura factura) {
        facturaRepository.save(factura);
    }
 
    @Override
    public void eliminarFactura(Long id) {
        facturaRepository.deleteById(id);
    }
}
