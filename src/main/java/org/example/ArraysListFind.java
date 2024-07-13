package org.example;

import java.util.ArrayList;

public class ArraysListFind {
    public static void main(String[] args) {
        /*
        Lo que entiendo por este termino es que es una coleccion de java, en si es un aestructura de datos
        que permite almacenar elementos de forma dinamica. Una de sus mejoras en comparacion con los arrays normal,
        es que pueden cambiar su tamaño si se eliminan o añaden datos

        Unas de sus caracteristicas son:
        permite almacenar cualquier tipo de dato,
        mantiene el orden de insercion de los elementos,
        permite elementos duplicados
        y una de sus principales caracteristicas es que permite manipular y acceder a los elementos a traves de metodos
         */

        // Crear un ArrayList de String
        ArrayList<String> lista = new ArrayList<>();

        // Agregar elementos
        lista.add("A");
        lista.add("B");
        lista.add("C");

        // Insertar un elemento en una posición específica
        lista.add(1, "D");

        // Acceder a un elemento
        System.out.println("Elemento en la posición 1: " + lista.get(1));

        // Reemplazar un elemento
        lista.set(2, "E");

        // Verificar si contiene un elemento
        System.out.println("Contiene 'B': " + lista.contains("B"));

        // Eliminar un elemento por posición
        lista.remove(1);

        // Eliminar un elemento por valor
        lista.remove("C");

        // Tamaño del ArrayList
        System.out.println("Tamaño del ArrayList: " + lista.size());

        // Recorrer el ArrayList
        System.out.println("Elementos del ArrayList:");
        for (String elemento : lista) {
            System.out.println(elemento);
        }

        // Limpiar el ArrayList
        lista.clear();
        System.out.println("Tamaño después de limpiar: " + lista.size());
    }
}
