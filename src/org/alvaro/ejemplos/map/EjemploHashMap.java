package org.alvaro.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String, Object> persona = new HashMap<>();
        persona.put("nombre", "Alvaro");
        persona.put("apellido", "Arguelles");
        persona.put("email", "alvaro@gmail.com");
        persona.put("edad", "21");

        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");

        System.out.println("persona = " + persona);

        String nombre = (String) persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = (String) persona.get("apellido");
        System.out.println("apellido = " + apellido);

        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion");
        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad");

        String valorApellido = (String) persona.remove("apellido");
//        boolean b = persona.remove("apellido");
        System.out.println("eliminado = " + valorApellido);

        boolean b = persona.containsKey("apellido");
        System.out.println("b = " + b);

        b = persona.containsValue("Arguelles");
        System.out.println("b = " + b);

        System.out.println("================================= values");
        Collection<Object> valores = persona.values();
        for(Object v: valores){
            System.out.println(v);
        }

        System.out.println("================================= keySet");
        Set<String> llaves = persona.keySet();
        for(String k: llaves){
            System.out.println("k = " + k);
        }

        System.out.println("================================= entryset");
        for(Map.Entry<String, Object> par: persona.entrySet()){
            Object valor = par.getValue();
            if(valor instanceof Map){
                String nom = (String) persona.get("nombre");
                Map<String, String> direccionMap = (Map<String, String>) valor;
                for(Map.Entry<String, String> parDir: direccionMap.entrySet()){
                    System.out.println(parDir.getKey() + " => " + parDir.getValue());
                }
            }else{
                System.out.println(par.getKey() + " => " + par.getValue());
            }

        }

        System.out.println("================================= keyset");
        for(String llave: persona.keySet()){
            Object valor = persona.get(llave);
            if(valor instanceof Map){
                String nom = (String) persona.get("nombre");
                Map<String, String> direccionMap = (Map<String, String>) valor;
                System.out.println("El pais de " + nom + ": " + direccionMap.get("pais"));
                System.out.println("La ciudad de " + nom + ": " + direccionMap.get("ciudad"));
            }else{
                System.out.println(llave + " => " + valor);
            }

        }

        System.out.println("================================= java 8 foreach");
        persona.forEach((llave, valor) -> {
            System.out.println(llave + " => " + valor);
        });


    }
}
