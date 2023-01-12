/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Service.java to edit this template
 */
package com.dmist.appmdmq.service;

import com.dmist.appmdmq.model.ServiciosExpuestos;
import com.dmist.appmdmq.repository.ServiciosExpuestosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author oportero
 */
@Service
public class ServiciosExpuestosService {
    @Autowired
    private ServiciosExpuestosRepository serviciosExpuestosRepository;

    public List<ServiciosExpuestos> listarServiciosExpuestos() {
        try {
            return serviciosExpuestosRepository.findAll();
        } catch (Exception e) {
            return null;
        }
    }

    public ServiciosExpuestos grabarServiciosExpuestos(ServiciosExpuestos serviciosExpuestos) {
        try {
            return serviciosExpuestosRepository.save(serviciosExpuestos);
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }    
}
