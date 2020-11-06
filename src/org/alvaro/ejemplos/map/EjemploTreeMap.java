package org.alvaro.ejemplos.map;

import java.util.*;

public class EjemploTreeMap {
    public static void main(String[] args) {

        Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length));
        persona.put("nombre", "Alvaro");
        persona.put("apellido", "Arguelles");
        persona.put("email", "alvaro@gmail.com");
        persona.put("edad", "21");

        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
    }
}
