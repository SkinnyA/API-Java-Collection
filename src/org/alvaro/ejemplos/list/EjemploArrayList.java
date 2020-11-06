package org.alvaro.ejemplos.list;

import org.alvaro.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class EjemploArrayList {
    public static void main(String[] args) {

        List<Alumno> setalumno = new ArrayList<>();
        System.out.println(setalumno + ", size = " + setalumno.size());
        System.out.println("esta vacia = " + setalumno.isEmpty());
        setalumno.add(new Alumno("Alvaro", 10));
        setalumno.add(new Alumno("Natalia", 10));
        setalumno.add(new Alumno("Pepe", 5));
        setalumno.add(2, new Alumno("Ernesto", 7));
        setalumno.set(3, new Alumno("Juan", 7)); //el set reemplaza Pepe por Juan

        System.out.println(setalumno + ", size = " + setalumno.size());

        setalumno.remove(new Alumno("Ernesto", 7));
//        setalumno.remove(3);
        System.out.println(setalumno + ", size = " + setalumno.size());

        boolean b = setalumno.contains(new Alumno("Ernesto", 7));
        System.out.println("La lista contiene a Ernesto = " + b);

        Object a[] = setalumno.toArray();
        for(int i=0; i < a.length; i++){
            System.out.println("Desde el array = " + a[i]);
        }

    }
}
