/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.bean.colegio;

import com.google.gson.annotations.Expose;


/**
 *
 * @author rafa
 */
public class Aula {

  
    

    public Aula() {
       
    }

 
    @Expose
    private Integer id;
    @Expose
    private String nombre;    
    @Expose
    private String situación;   

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
