/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicioPractico1.serviceImplementation;
 
import com.ejercicioPractico1.dao.MedicamentoRepository;
import com.ejercicioPractico1.domain.Medicamento;
import com.ejercicioPractico1.service.MedicamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;
 
@Service
public class MedicamentoServiceImpl implements MedicamentoService {
    @Autowired
    private MedicamentoRepository medicamentoRepository;
 
    @Override
    public List<Medicamento> listarMedicamentos() {
        return medicamentoRepository.findAll();
    }
 
    @Override
    public void guardarMedicamento(Medicamento medicamento) {
        medicamentoRepository.save(medicamento);
    }
 
    @Override
    public void eliminarMedicamento(Long id) {
        medicamentoRepository.deleteById(id);
    }
}
