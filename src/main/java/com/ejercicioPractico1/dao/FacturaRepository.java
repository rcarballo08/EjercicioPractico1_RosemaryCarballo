/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejercicioPractico1.dao;
 
import com.ejercicioPractico1.domain.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface FacturaRepository extends JpaRepository<Factura, Long> {
}
