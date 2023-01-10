/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dmist.appmdmq.controller;

import com.dmist.appmdmq.model.Tecnologias;
import com.dmist.appmdmq.service.TecnologiasService;
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
public class TecnologiasController {

    @Autowired
    private TecnologiasService tecnologiasService;
    
    @GetMapping("/obtenerTecnologias")
    public List<Tecnologias> obtenerTecnologias(){
        return tecnologiasService.listarTecnologias();
    }
    
    @PostMapping("/grabarTecnologia")
    public Tecnologias grabarTecnologia(@RequestBody Tecnologias tecnologia){
        try {
           
            return  tecnologiasService.grabarTecnologia(tecnologia);

        } catch (Exception e) {
            return null;
        }
    }
       
    
}
