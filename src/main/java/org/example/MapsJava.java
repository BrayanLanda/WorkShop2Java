package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapsJava {
    public static void main(String[] args) {
        /*
        El map es una coleccion que me permite almacenar pares clave-valor, teniendo en cuanta que cada
        clave es unica y es asociada a un unico valor. Esto nos permite asociar datos relacionados de manera que
        podamos buscar un valor basado en una clave

        Pude encontrar unos tipos de map:
        --HashMap--TreeMap---LinkedHashMap

        Tambien es importante saber que para utilizarse map de debe importar del paquete java.util
         */

        Map<String, String> map = new HashMap<>();

        // Agregar elementos
        map.put("uno", "One");
        map.put("dos", "Two");
        map.put("tres", "Three");

        // Acceder a un elemento
        System.out.println("Clave 'dos': " + map.get("dos"));

        // Verificar si contiene una clave
        System.out.println("Contiene clave 'uno': " + map.containsKey("uno"));

        // Verificar si contiene un valor
        System.out.println("Contiene valor 'Three': " + map.containsValue("Three"));

        // Tamaño del mapa
        System.out.println("Tamaño del mapa: " + map.size());

        // Recorrer el mapa
        System.out.println("Recorriendo el mapa:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        // Eliminar un elemento
        map.remove("dos");

        // Mostrar después de eliminar
        System.out.println("Después de eliminar:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        // Limpiar el mapa
        map.clear();
        System.out.println("Tamaño después de limpiar: " + map.size());
    }
}
