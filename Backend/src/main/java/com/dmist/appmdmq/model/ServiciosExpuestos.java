/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dmist.appmdmq.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author oportero
 */
@Data
public class ServiciosExpuestos implements Serializable{
@Id
@Field("_id")
private String identificador;
private String aplicativo;
private String urlDesarrollo;
private String urlTest;
private String nombre;
private String descripcion;
private String tipo;
private Boolean certificadoSeguridad;
private String usuarioCreacion;
private String usuarioModificacion;
@Temporal(TemporalType.TIMESTAMP)
private Date fechaCreacion;
@Temporal(TemporalType.TIMESTAMP)
private Date fechaModificacion;
private String ipCreacion;
private String ipModificacion;

}
