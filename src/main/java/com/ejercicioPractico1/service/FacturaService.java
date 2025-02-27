/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejercicioPractico1.service;
 
import com.ejercicioPractico1.domain.Factura;
import java.util.List;
 
public interface FacturaService {
    List<Factura> listarFacturas();
    void guardarFactura(Factura factura);
    void eliminarFactura(Long id);
}
