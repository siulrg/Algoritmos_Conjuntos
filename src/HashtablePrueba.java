/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

public class HashtablePrueba {

    public static void main(String[] args) {

        String[] ciclo = {"Lansen", "Messaria", "Ripolles", "Waritten", "Delgado", "Kloster", "Bustaria", "Animador",
            "Sanroma", "Juliani"};

        double[] tiempo = {45.40, 45.41, 47.0, 49.0, 51.20, 46.0, 48.0,
            45.6, 52.30, 53.25};
        Hashtable tab = new Hashtable();
// inserta los elementos en la tabla 
        for (int i = 0; i < ciclo.length; i++) {
            tab.put(new Double(tiempo[i]), ciclo[i]);
        }
        System.out.println("Tabla hash creada: " + tab); // búsqueda por clave

        if (tab.containsKey(new Double(49.1))) {
            System.out.println("Corredor encontrado: " + tab.get(new Double(46.0)));
        } else {
            System.out.println("Clave no está en la tabla");
        }
        
       // elimina un elemento
        Object q = tab.remove(new Double(45.6));
        if (q != null) {
            System.out.println(" E l e m e n t o " + q + " e l i m i n a d o ");
        }
// Conjunto de claves
//        Set cv;
//        cv = tab.keySet();
//        System.out.println("Conjunto de claves: " + cv); // Enumeración de valores
//
//        Enumeration en;
//        en = tab.elements();
//        System.out.print("Ciclistas(valores): ");
//        while (en.hasMoreElements()) {
//            System.out.print(en.nextElement());
//
//            if (en.hasMoreElements()) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println();

    }
}
