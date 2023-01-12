/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dmist.appmdmq.controller;

import com.dmist.appmdmq.model.ServiciosExpuestos;
import com.dmist.appmdmq.service.ServiciosExpuestosService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author oportero
 */
@RestController
@RequestMapping("/api")
@CrossOrigin("*")
@RequiredArgsConstructor
public class ServiciosExpuestosController {
    
    @Autowired
    private ServiciosExpuestosService serviciosExpuestosService;
    
    @GetMapping("/obtenerServiciosExpuestos")
    public List<ServiciosExpuestos> obtenerServiciosExpuestos(){
        return serviciosExpuestosService.listarServiciosExpuestos();
    }
    
    @PostMapping("/grabarServiciosExpuestos")
    public ServiciosExpuestos grabarServiciosExpuestos(@RequestBody ServiciosExpuestos serviciosExpuestos){
        try {
           
            return  serviciosExpuestosService.grabarServiciosExpuestos(serviciosExpuestos);

        } catch (Exception e) {
            return null;
        }
    }
    
}
