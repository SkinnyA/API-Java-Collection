package org.alvaro.ejemplos.set;

import org.alvaro.ejemplos.modelo.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {

        Set<Alumno> setalumno = new TreeSet<>((a, b) -> b.getNota().compareTo(a.getNota()));
        setalumno.add(new Alumno("Alvaro", 10));
        setalumno.add(new Alumno("Natalia", 10));
        setalumno.add(new Alumno("Pepe", 5));
        setalumno.add(new Alumno("Juan", 7));
        setalumno.add(new Alumno("Juan", 7));
    }
}
