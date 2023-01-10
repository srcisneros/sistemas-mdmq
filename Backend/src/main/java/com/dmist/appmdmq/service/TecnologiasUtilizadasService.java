/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Service.java to edit this template
 */
package com.dmist.appmdmq.service;

import com.dmist.appmdmq.model.TecnologiasUtilizadas;
import com.dmist.appmdmq.repository.TecnologiasUtilizadasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author oportero
 */
@Service
public class TecnologiasUtilizadasService {
    @Autowired
    private TecnologiasUtilizadasRepository tecnologiasUtilizadasRepository;

    public List<TecnologiasUtilizadas> listarTecnologiasUtilizadas() {
        try {
            return tecnologiasUtilizadasRepository.findAll();
        } catch (Exception e) {
            return null;
        }
    }

    public TecnologiasUtilizadas grabarTecnologiasUtilizadas(TecnologiasUtilizadas tecnologiasUtilizadas) {
        try {
            return tecnologiasUtilizadasRepository.save(tecnologiasUtilizadas);
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }
    
}
