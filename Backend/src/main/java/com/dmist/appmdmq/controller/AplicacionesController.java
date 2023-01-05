/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dmist.appmdmq.controller;

import com.dmist.appmdmq.model.Aplicaciones;
import com.dmist.appmdmq.service.AplicacionesService;
import com.dmist.appmdmq.service.AppService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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

public class AplicacionesController {
    @Autowired
    private AplicacionesService aplicacionesService;

    @GetMapping("/ObtenerAplicaciones")
    List<Aplicaciones> ObtenerAplicaciones(){
        return aplicacionesService.obtenerAplicaciones();
    }
}
