package com.mycompany.jpaprueba.logica;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Carrera implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Basic
    private String nombre;

    @OneToMany(mappedBy="carrera")
    private LinkedList<Materia> listaMateria;

    public Carrera() {
    }

    public Carrera(int id, String nombre, LinkedList<Materia> listaMateria) {
        this.id = id;
        this.nombre = nombre;
        this.listaMateria = listaMateria;
    }

    public LinkedList<Materia> getListaMateria() {
        return listaMateria;
    }

    public void setListaMateria(LinkedList<Materia> listaMateria) {
        this.listaMateria = listaMateria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
