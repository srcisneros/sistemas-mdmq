/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dmist.appmdmq.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.LinkedHashMap;
import java.util.Map;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author srcisnerosv
 
 */
@Data
@Document(value = "aplicaciones")

public class MapAplicaciones {
    Map<String, Object> mapAplicaciones = new LinkedHashMap<>();
        
    @JsonAnyGetter
    public Map<String, Object> getApp(){
        return mapAplicaciones;
    }
    
    @JsonAnySetter
    public void setApp(String Key, Object value){
        mapAplicaciones.put(Key, value);
    }
}
