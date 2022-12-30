/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dmist.appmdmq.controller;

import com.dmist.appmdmq.model.MapAplicaciones;
import com.dmist.appmdmq.service.AppService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
    
    @GetMapping
    public List<MapAplicaciones> obtenerTodos(){
        return appService.obtenerTodos();
    }
    
    @PostMapping("/grabarApp")
    public MapAplicaciones grabarApp(@RequestBody MapAplicaciones app) {
        appService.grabarApp(app);
        return app;
    }
}
