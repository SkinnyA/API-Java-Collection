package org.alvaro.ejemplos.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        Set<String> ts = new TreeSet<>((a, b) -> b.compareTo(a));

        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");

        System.out.println("ts = " + ts);

        Set<Integer> enteros = new TreeSet<>();
        enteros.add(1);
        enteros.add(2);
        enteros.add(3);
        enteros.add(10);
    }
}
