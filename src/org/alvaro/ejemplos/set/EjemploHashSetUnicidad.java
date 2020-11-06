package org.alvaro.ejemplos.set;

import org.alvaro.ejemplos.modelo.Alumno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        Set<Alumno> setalumno = new HashSet<>();
        setalumno.add(new Alumno("Alvaro", 10));
        setalumno.add(new Alumno("Natalia", 10));
        setalumno.add(new Alumno("Pepe", 5));
        setalumno.add(new Alumno("Juan", 7));
        setalumno.add(new Alumno("Juan", 7));

        System.out.println("Iterando con un foreach");
        for(Alumno a: setalumno){
            System.out.println(a);
        }

        System.out.println("Iterando con un while e iterator");
        Iterator<Alumno> it = setalumno.iterator();
        while (it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando con Stream foreach");
        setalumno.forEach(System.out::println);
    }
}
