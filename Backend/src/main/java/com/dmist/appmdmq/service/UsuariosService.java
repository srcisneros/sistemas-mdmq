/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Service.java to edit this template
 */
package com.dmist.appmdmq.service;

import com.dmist.appmdmq.model.MapAplicaciones;
import com.dmist.appmdmq.model.MapUsuarios;
import com.dmist.appmdmq.repository.AppRepository;
import com.dmist.appmdmq.repository.UsuariosRepository;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author srcisnerosv
 */
@Service
public class UsuariosService {
    @Autowired
     private UsuariosRepository usuariosRepository;
     
     public List<MapUsuarios> obtenerUsuarios(){
         return usuariosRepository.findAll();
     }
     
     
     public void grabarApp(MapUsuarios mapUsuarios) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            var fecha = mapUsuarios.getMapUsuarios().get("fechaCreacion").toString();
            mapUsuarios.getMapUsuarios().put("fechaCreacion", sdf.parse(fecha));
            usuariosRepository.save(mapUsuarios);
        } catch (ParseException e) {
            System.err.println(e);
        }
    }
}
