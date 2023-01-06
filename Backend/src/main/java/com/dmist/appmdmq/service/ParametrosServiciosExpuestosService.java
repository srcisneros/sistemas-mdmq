/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Service.java to edit this template
 */
package com.dmist.appmdmq.service;

import com.dmist.appmdmq.model.ParametrosServiciosExpuestos;
import com.dmist.appmdmq.repository.ParametrosServiciosExpuestosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author oportero
 */
@Service
public class ParametrosServiciosExpuestosService {
    @Autowired
    private ParametrosServiciosExpuestosRepository parametrosServiciosExpuestosRepository;

    public List<ParametrosServiciosExpuestos> listarParametrosServiciosExpuestos() {
        try {
            return parametrosServiciosExpuestosRepository.findAll();
        } catch (Exception e) {
            return null;
        }
    }

    public ParametrosServiciosExpuestos grabarParametrosSeviciosExpuestos(ParametrosServiciosExpuestos parametrosServiciosExpuestos) {
        try {
            return parametrosServiciosExpuestosRepository.save(parametrosServiciosExpuestos);
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }
    
}
