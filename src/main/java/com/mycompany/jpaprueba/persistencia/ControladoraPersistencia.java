package com.mycompany.jpaprueba.persistencia;

import com.mycompany.jpaprueba.logica.Alumno;

public class ControladoraPersistencia {
    
    AlumnoJpaController aluJpa = new AlumnoJpaController();

    public void crearAlumno(Alumno alu) {
        this.aluJpa.create(alu);
    }
    
}
