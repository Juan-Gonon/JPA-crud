package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Controladora;
import java.util.Date;

public class JpaPrueba {

    public static void main(String[] args) {
        Controladora control = new Controladora();
        // Alumno alu = new Alumno(15, "Kamila", "Lopez", new Date());

        //control.createAlumno(alu);
        control.deleteAlumno(30);

    }
}
