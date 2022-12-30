/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dmist.appmdmq.model;

import java.util.List;
import javax.persistence.Id;

/**
 *
 * @author srcisnerosv
 */
public class Usuarios {
    @Id
    private String identificacion;
    private List<MapUsuarios> usuarios;    
}
