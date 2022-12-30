/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dmist.appmdmq.repository;

import com.dmist.appmdmq.model.MapUsuarios;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author srcisnerosv
 */
public interface UsuariosRepository extends MongoRepository<MapUsuarios, String>{
    
}
