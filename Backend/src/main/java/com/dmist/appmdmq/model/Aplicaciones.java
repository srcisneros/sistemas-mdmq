/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dmist.appmdmq.model;

import com.dmist.appmdmq.model.MapAplicaciones;
import java.util.List;
import javax.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author srcisnerosv
 */
@Data
@Document(value = "aplicaciones")
public class Aplicaciones {
    @Id
    private String nombre;    
    private List<MapAplicaciones> aplicaciones;
    
}