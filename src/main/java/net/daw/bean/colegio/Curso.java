package net.daw.bean.colegio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import net.daw.bean.colegio.Asignatura;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;

/**
 *
 * @author rafa
 */
public class Curso {

    @Expose
    private Integer id;
    @Expose
    private String nombre;
    @Expose
    private ArrayList<Asignatura> Asignaturas;

    public Curso(int contador2) {
        id = contador2;
        Asignaturas=new ArrayList<>();
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

    public ArrayList<Asignatura> getAsignaturas() {
        return Asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> Asignaturas) {
        this.Asignaturas = Asignaturas;
    }

}
