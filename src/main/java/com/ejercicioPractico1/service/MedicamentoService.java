/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejercicioPractico1.service;
 
import com.ejercicioPractico1.domain.Medicamento;
import java.util.List;
 
public interface MedicamentoService {
    List<Medicamento> listarMedicamentos();
    void guardarMedicamento(Medicamento medicamento);
    void eliminarMedicamento(Long id);
}
