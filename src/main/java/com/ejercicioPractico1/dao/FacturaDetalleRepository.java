/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejercicioPractico1.dao;
 
import com.ejercicioPractico1.domain.FacturaDetalle;
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface FacturaDetalleRepository extends JpaRepository<FacturaDetalle, Long> {
}
