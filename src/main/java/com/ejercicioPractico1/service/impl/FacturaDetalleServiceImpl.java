/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicioPractico1.service.impl;
 
import com.ejercicioPractico1.dao.FacturaDetalleRepository;
import com.ejercicioPractico1.domain.FacturaDetalle;
import com.ejercicioPractico1.service.FacturaDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;
 
@Service
public class FacturaDetalleServiceImpl implements FacturaDetalleService {
    @Autowired
    private FacturaDetalleRepository facturaDetalleRepository;
 
    @Override
    public List<FacturaDetalle> listarDetalles() {
        return facturaDetalleRepository.findAll();
    }
 
    @Override
    public void guardarDetalle(FacturaDetalle detalle) {
        facturaDetalleRepository.save(detalle);
    }
 
    @Override
    public void eliminarDetalle(Long id) {
        facturaDetalleRepository.deleteById(id);
    }
}
