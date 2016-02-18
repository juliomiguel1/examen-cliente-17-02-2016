/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.bean.colegio;

import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import net.daw.bean.colegio.TipoAsignatura;

/**
 *
 * @author rafa
 */
public class Asignatura {



    @Expose
    private Integer id;
    @Expose
    private String nombre;
    @Expose
    private ArrayList<Estudiante> Estudiantes;
    @Expose
    private TipoAsignatura Tipo;
    @Expose
    private Profesor Profesor;

    public Asignatura(Integer id) {
        this.Estudiantes = new ArrayList<>();
        this.id = id;
    }

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

    public ArrayList<Estudiante> getEstudiantes() {
        return Estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> Estudiantes) {
        this.Estudiantes = Estudiantes;
    }

    public TipoAsignatura getTipo() {
        return Tipo;
    }

    public void setTipo(TipoAsignatura Tipo) {
        this.Tipo = Tipo;
    }

    public Profesor getProfesor() {
        return Profesor;
    }

    public void setProfesor(Profesor Profesor) {
        this.Profesor = Profesor;
    }


    

}
