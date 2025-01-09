package com.mycompany.jpaprueba.logica;

import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void createAlumno (Alumno alu){
        this.controlPersis.crearAlumno(alu);
    }
    
    public void deleteAlumno (int id){
        this.controlPersis.deleteAlumno(id);
    }
    
    public void editAlumno (Alumno alu){
        controlPersis.editAlumno(alu);
    }
    
    public Alumno findAlumno (int id){
        
        return controlPersis.findAlumno(id);
    }
    
    public ArrayList<Alumno> getAlumnos(){
        return this.controlPersis.getAlumnos();
    }
  
}
