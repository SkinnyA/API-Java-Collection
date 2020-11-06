package org.alvaro.ejemplos.list;

import org.alvaro.ejemplos.modelo.Alumno;

import java.util.*;

import static java.util.Comparator.comparing;

public class EjemploListComparableComparator {
    public static void main(String[] args) {

        List<Alumno> setalumno = new ArrayList<>();
        setalumno.add(new Alumno("Alvaro", 10));
        setalumno.add(new Alumno("Natalia", 10));
        setalumno.add(new Alumno("Pepe", 5));
        setalumno.add(new Alumno("Juan", 7));
        setalumno.add(new Alumno("Juan", 7));
//        Collections.sort(setalumno, (a, b) -> b.getNota().compareTo(a.getNota()));
//        setalumno.sort((a, b) -> b.getNota().compareTo(a.getNota()));
        setalumno.sort(comparing(Alumno::getNota).reversed());

        System.out.println("Iterando con Stream foreach");
        setalumno.forEach(System.out::println);
    }
}
