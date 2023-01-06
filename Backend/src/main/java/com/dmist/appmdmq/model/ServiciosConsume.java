/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dmist.appmdmq.model;

import java.io.Serializable;
import javax.persistence.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author oportero
 */
@Data
public class ServiciosConsume implements Serializable{
@Id
@Field("_id")
private String identificador;
private String urlDesarrollo;
private String urlTest;
private String descripcion;
    
}
