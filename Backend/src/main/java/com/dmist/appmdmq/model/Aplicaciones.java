/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dmist.appmdmq.model;

import com.dmist.appmdmq.model.MapAplicaciones;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author srcisnerosv
 */
@Data
@Document(value = "aplicaciones")
public class Aplicaciones {
    @Id
    @Field("_id")
    private String identify;
    
    @Field("mapAplicaciones")
    Map<String, Object> aplicaciones = new LinkedHashMap<>();

    @JsonAnyGetter
    public Map<String, Object> getApp(){
        return (Map<String, Object>) aplicaciones;
    }
    
    @JsonAnySetter
    public void setApp(String Key, Object value){
        aplicaciones.put(Key, value);
    }    
}