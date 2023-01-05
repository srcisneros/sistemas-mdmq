/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Service.java to edit this template
 */
package com.dmist.appmdmq.service;

import com.dmist.appmdmq.model.Aplicaciones;
import com.dmist.appmdmq.repository.AplicacionesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author oportero
 */
@Service
public class AplicacionesService {
    
    @Autowired
    private AplicacionesRepository aplicacionesRepository;

     public List<Aplicaciones> obtenerAplicaciones(){

         return aplicacionesRepository.findAll();
     }
         
}
