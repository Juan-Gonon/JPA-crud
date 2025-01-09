package com.mycompany.jpaprueba.logica;

import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void createAlumno(Alumno alu) {
        this.controlPersis.crearAlumno(alu);
    }

    public void deleteAlumno(int id) {
        this.controlPersis.deleteAlumno(id);
    }

    public void editAlumno(Alumno alu) {
        controlPersis.editAlumno(alu);
    }

    public Alumno findAlumno(int id) {

        return controlPersis.findAlumno(id);
    }

    public ArrayList<Alumno> getAlumnos() {
        return this.controlPersis.getAlumnos();
    }

    // Carrera
    public void createCarrera(Carrera carr) {
        this.controlPersis.createCarrera(carr);
    }

    public void deleteCarrera(int id) {
        this.controlPersis.deleteCarrera(id);
    }

    public void editCarrera(Carrera carr) {
        controlPersis.editCarrera(carr);
    }

    public Carrera findCarrera(int id) {

        return controlPersis.findCarrera(id);
    }

    public ArrayList<Carrera> getCarreras() {
        return this.controlPersis.getCarreras();
    }

}
