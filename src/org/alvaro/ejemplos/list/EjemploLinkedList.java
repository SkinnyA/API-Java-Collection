package org.alvaro.ejemplos.list;

import org.alvaro.ejemplos.modelo.Alumno;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class EjemploLinkedList {
    public static void main(String[] args) {

        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("esta vacia = " + enlazada.isEmpty());
        enlazada.add(new Alumno("Alvaro", 10));
        enlazada.add(new Alumno("Natalia", 10));
        enlazada.add(new Alumno("Pepe", 5));
        enlazada.add(new Alumno("Ernesto", 7));
        enlazada.add(new Alumno("Juan", 7)); //el set reemplaza Pepe por Juan

        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.addFirst(new Alumno("Zeus", 5));
        enlazada.addLast(new Alumno("Atenea", 6));
        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println("Primero = " + enlazada.getFirst());
        System.out.println("Ultimo = " + enlazada.getLast());

        ListIterator<Alumno> li = enlazada.listIterator();
        while(li.hasNext()){
            Alumno a = li.next();
            System.out.println(a);
//            System.out.println(li.next());
        }

        System.out.println("============================");

        while(li.hasPrevious()){
            Alumno a = li.next();
            System.out.println(a);
        }

    }
}
