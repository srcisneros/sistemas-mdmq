/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Service.java to edit this template
 */
package com.dmist.appmdmq.service;

import com.dmist.appmdmq.model.Tecnologias;
import com.dmist.appmdmq.repository.TecnologiasRepository;
import java.text.SimpleDateFormat;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author oportero
 */
@Service
public class TecnologiasService {

    @Autowired
    private TecnologiasRepository tecnologiasRepository;

    public List<Tecnologias> listarTecnologias() {
        try {
            return tecnologiasRepository.findAll();
        } catch (Exception e) {
            return null;
        }
    }

    public Tecnologias grabarTecnologia(Tecnologias tecnologias) {
        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            var fechaCrea = tecnologias.getFechaCreacion();
//            var fechaModifica = tecnologias.getFechaModificacion();
//            tecnologias.setFechaCreacion(sdf.parse(fechaCrea));
//            tecnologias.setFechaModificacion(sdf.parse(fechaModifica));

            return tecnologiasRepository.save(tecnologias);
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }
}
