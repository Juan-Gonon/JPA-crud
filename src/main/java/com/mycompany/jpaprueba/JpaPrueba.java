package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Controladora;
import java.util.ArrayList;
import java.util.Date;

public class JpaPrueba {

    public static void main(String[] args) {
        Controladora control = new Controladora();
        // Alumno alu2 = new Alumno(23, "Paco", "Lopez", new Date());

        //control.createAlumno(alu2);
        //control.deleteAlumno(30);
        //alu.setApellido("de Paula");
        //control.editAlumno(alu);
        
        Alumno alu = control.findAlumno(15);
        System.out.println("----------- Búsqueda Individual ______________");
        System.out.println("El alumno es: " + alu.toString());
        System.out.println("____________ Busqueda de TODOS ________________");
        
        ArrayList<Alumno> listAlumnos = control.getAlumnos();
        
        for(Alumno alumno: listAlumnos){
            System.out.println("El alumno es: " + alumno.toString());
        }
     
    }
}
