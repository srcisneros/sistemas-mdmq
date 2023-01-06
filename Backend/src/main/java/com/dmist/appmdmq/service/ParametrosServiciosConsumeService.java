/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Service.java to edit this template
 */
package com.dmist.appmdmq.service;

import com.dmist.appmdmq.model.ParametrosServiciosConsume;
import com.dmist.appmdmq.repository.ParametrosServiciosConsumeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author oportero
 */
@Service
public class ParametrosServiciosConsumeService {
    
    @Autowired
    private ParametrosServiciosConsumeRepository parametrosServiciosConsumeRepository;

    public List<ParametrosServiciosConsume> listarParametrosServiciosConsume() {
        try {
            return parametrosServiciosConsumeRepository.findAll();
        } catch (Exception e) {
            return null;
        }
    }

    public ParametrosServiciosConsume grabarParametrosSeviciosConsume(ParametrosServiciosConsume parametrosServiciosConsume) {
        try {
            return parametrosServiciosConsumeRepository.save(parametrosServiciosConsume);
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }
    
}
