package com.mycompany.jpaprueba.logica;

import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void createAlumno (Alumno alu){
        this.controlPersis.crearAlumno(alu);
    }
    
    public void deleteAlumno (int id){
        this.controlPersis.deleteAlumno(id);
    }
    
}
