package net.daw.bean.colegio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import net.daw.bean.colegio.Curso;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;

/**
 *
 * @author rafa
 */
public class Estudio {

    @Expose
    private Integer id;
    @Expose
    private String descripcion;
    @Expose
    private ArrayList<Curso> Cursos;   

    public Estudio(Integer id) {
        this.id = id;
        this.Cursos = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Curso> getCursos() {
        return Cursos;
    }

    public void setCursos(ArrayList<Curso> Cursos) {
        this.Cursos = Cursos;
    }

   
    
    
}
