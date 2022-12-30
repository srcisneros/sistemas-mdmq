/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dmist.appmdmq.repository;

import com.dmist.appmdmq.model.MapAplicaciones;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author srcisnerosv
 */
@Repository
public interface AppRepository extends MongoRepository<MapAplicaciones, String>{
    
}
