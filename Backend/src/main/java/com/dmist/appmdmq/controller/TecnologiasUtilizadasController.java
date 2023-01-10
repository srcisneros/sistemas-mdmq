/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dmist.appmdmq.controller;

import com.dmist.appmdmq.model.TecnologiasUtilizadas;
import com.dmist.appmdmq.service.TecnologiasUtilizadasService;
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
public class TecnologiasUtilizadasController {
    @Autowired
    private TecnologiasUtilizadasService tecnologiasUtilizadasService;
    
    @GetMapping("/obtenerTecnologiasUtilizadas")
    public List<TecnologiasUtilizadas> obtenerTecnologiasUtilizadas(){
        return tecnologiasUtilizadasService.listarTecnologiasUtilizadas();
    }
    
    @PostMapping("/grabarTecnologiasUtilizadas")
    public TecnologiasUtilizadas grabarTecnologia(@RequestBody TecnologiasUtilizadas tecnologiasUtilizadas){
        try {
           
            return  tecnologiasUtilizadasService.grabarTecnologiasUtilizadas(tecnologiasUtilizadas);

        } catch (Exception e) {
            return null;
        }
    }
    
}
