/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dmist.appmdmq.service;

import com.dmist.appmdmq.model.Aplicaciones;
import com.dmist.appmdmq.model.MapAplicaciones;
import com.dmist.appmdmq.repository.AppRepository;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author srcisnerosv
 */@Service
 @RequiredArgsConstructor
 
public class AppService {
     
     @Autowired
     private AppRepository appRepository;
     
     public List<MapAplicaciones> obtenerApp(){
         return appRepository.findAll();
     }
     
     public void grabarApp(MapAplicaciones mapAplicaciones) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            var fecha = mapAplicaciones.getApp().get("fechaCreacion").toString();
            mapAplicaciones.getApp().put("fechaCreacion", sdf.parse(fecha));
            appRepository.save(mapAplicaciones);
        } catch (ParseException e) {
            System.err.println(e);
        }
    }
     
//     public List<App> obtenerPorId(String id){
//         List<App> app = appRepository.findAll();
//         List<App> app = new ArrayList<>();
//         app.forEach(item ->{
//         var idSistema = item.getApp().get("idSistema");
//             if (idSistema.toString().equals(id)) {
//                 app.add(item);
//                 
//             }
//         });
//         return app;
//     }
//    
}
