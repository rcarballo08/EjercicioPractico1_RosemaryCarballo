/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicioPractico1.dao;
 
import com.ejercicioPractico1.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
