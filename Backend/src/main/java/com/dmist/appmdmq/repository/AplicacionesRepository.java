/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dmist.appmdmq.repository;

import com.dmist.appmdmq.model.Aplicaciones;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author oportero
 */
public interface AplicacionesRepository extends MongoRepository<Aplicaciones, Object>{
    
}
