package com.mycompany.jpaprueba.persistencia;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    AlumnoJpaController aluJpa = new AlumnoJpaController();
    CarreraJpaController carrJpa = new CarreraJpaController();

    public void crearAlumno(Alumno alu) {
        this.aluJpa.create(alu);
    }

    public void deleteAlumno(int id) {
        try {
            this.aluJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editAlumno(Alumno alu) {
        try {
            this.aluJpa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno findAlumno(int id) {
        return this.aluJpa.findAlumno(id);
    }

    public ArrayList<Alumno> getAlumnos() {
        List<Alumno> alumnos = this.aluJpa.findAlumnoEntities();
        ArrayList<Alumno> listAlumnos = new ArrayList<Alumno>(alumnos);
        return listAlumnos;
    }

    public void createCarrera(Carrera carr) {
        this.carrJpa.create(carr);
    }

    public void deleteCarrera(int id) {
        try {
            this.carrJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editCarrera(Carrera carr) {
        try {
            this.carrJpa.edit(carr);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera findCarrera(int id) {
        return this.carrJpa.findCarrera(id);
    }

    public ArrayList<Carrera> getCarreras() {
        List<Carrera> lista = this.carrJpa.findCarreraEntities();
        ArrayList<Carrera> listCarrera = new ArrayList(lista);
        return listCarrera;
    }

}
