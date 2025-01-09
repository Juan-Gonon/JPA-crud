package com.mycompany.jpaprueba.persistencia;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    AlumnoJpaController aluJpa = new AlumnoJpaController();

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

}
