package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.Controladora;
import java.util.ArrayList;
import java.util.Date;

public class JpaPrueba {

    public static void main(String[] args) {
        Controladora control = new Controladora();
        Carrera carrera = new Carrera(25, "Programación");
        
        
        control.createCarrera(carrera);
        Alumno alu2 = new Alumno(27, "Adelya", "Lopez", new Date(), carrera);
        
        control.createAlumno(alu2);
        
        Alumno alumno = control.findAlumno(27);
        
        System.out.println("______________________________");
        System.out.println("--------- DATOS ALUMNO -------");
        System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Cursa la carrera de: " + alumno.getCarrera().getNombre());
    }
}
