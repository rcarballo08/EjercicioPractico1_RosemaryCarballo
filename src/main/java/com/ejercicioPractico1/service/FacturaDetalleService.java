/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejercicioPractico1.service;
 
import com.ejercicioPractico1.domain.FacturaDetalle;
import java.util.List;
 
public interface FacturaDetalleService {
    List<FacturaDetalle> listarDetalles();
    void guardarDetalle(FacturaDetalle detalle);
    void eliminarDetalle(Long id);
}
