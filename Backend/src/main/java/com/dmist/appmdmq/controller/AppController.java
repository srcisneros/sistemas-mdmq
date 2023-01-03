/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dmist.appmdmq.controller;

import com.dmist.appmdmq.model.MapAplicaciones;
import com.dmist.appmdmq.model.Tecnologias;
import com.dmist.appmdmq.service.AppService;
import com.dmist.appmdmq.service.TecnologiasService;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author srcisnerosv
 */
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor

public class AppController {
    @Autowired
    private AppService appService;
    
    @Autowired
    private TecnologiasService tecnologiasService;
    
    @GetMapping("/obtenerApp")
    public List<MapAplicaciones> obtenerTodos(){
        return appService.obtenerTodos();
    }
    
    @PostMapping("/grabarApp")
    public MapAplicaciones grabarApp(@RequestBody MapAplicaciones app) {
        appService.grabarApp(app);
        return app;
    }
    
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
