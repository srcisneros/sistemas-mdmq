/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Service.java to edit this template
 */
package com.dmist.appmdmq.service;

import com.dmist.appmdmq.model.ServiciosConsume;
import com.dmist.appmdmq.repository.ServiciosConsumeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author oportero
 */
@Service
public class ServiciosConsumeService {
    @Autowired
    private ServiciosConsumeRepository serviciosConsumeRepository;

    public List<ServiciosConsume> listarServiciosConsume() {
        try {
            return serviciosConsumeRepository.findAll();
        } catch (Exception e) {
            return null;
        }
    }

    public ServiciosConsume grabarServiciosConsume(ServiciosConsume serviciosConsume) {
        try {
            return serviciosConsumeRepository.save(serviciosConsume);
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }    
}
