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

public class MapUsuarios {
      Map<String, Object> mapUsuarios = new LinkedHashMap<>();
    
        
    @JsonAnyGetter
    public Map<String, Object> getApp(){
        return mapUsuarios;
    }
    
    @JsonAnySetter
    public void setApp(String Key, Object value){
        mapUsuarios.put(Key, value);
    }
}
