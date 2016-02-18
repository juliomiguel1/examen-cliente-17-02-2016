package net.daw.bean.colegio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rafa
 */
public class Centro {

    @Expose
    private Integer id;
    @Expose
    private String nombre;
    @Expose
    private ArrayList<Estudio> Estudios;

    public Centro(Integer id) {
        this.id = id;
        this.Estudios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ArrayList<Estudio> getEstudios() {
        return Estudios;
    }

    public void setEstudios(ArrayList<Estudio> Estudios) {
        this.Estudios = Estudios;
    }

}
