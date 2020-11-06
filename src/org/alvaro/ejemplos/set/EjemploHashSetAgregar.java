package org.alvaro.ejemplos.set;

import java.util.*;

public class EjemploHashSetAgregar {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");

        boolean b = hs.add("tres");
        System.out.println("permite elementos duplicados = " + b);
        System.out.println(hs);

    }
}
