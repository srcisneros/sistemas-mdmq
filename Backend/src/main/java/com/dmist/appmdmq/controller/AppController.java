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
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin("*")
@RequiredArgsConstructor

public class AppController {
    @Autowired
    private AppService appService;
    
    @GetMapping("/obtenerApp")
    public List<MapAplicaciones> obtenerApp(){
        return appService.obtenerApp();
    }
    
    @PostMapping("/grabarApp")
    public MapAplicaciones grabarApp(@RequestBody MapAplicaciones app) {
        appService.grabarApp(app);
        return app;
    }
    
}
