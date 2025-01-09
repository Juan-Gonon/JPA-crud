package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.Controladora;
import com.mycompany.jpaprueba.logica.Materia;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class JpaPrueba {

    public static void main(String[] args) {
        Controladora control = new Controladora();

        Materia mate1 = new Materia(58, "Programación I");
        Materia mate2 = new Materia(59, "Programación II");
        Materia mate3 = new Materia(60, "Programación III");

        control.createMateria(mate1);
        control.createMateria(mate2);
        control.createMateria(mate3);

        LinkedList<Materia> listaMateria = new LinkedList();

        listaMateria.add(mate1);
        listaMateria.add(mate2);
        listaMateria.add(mate3);

        Carrera carrera = new Carrera(25, "Programación", listaMateria);

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
