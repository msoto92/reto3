/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.reto3;

import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class Reto3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Obra obra = new Obra();

        // Crear arrays y probar.
        ArrayList<Integer> a = obra.clases(new ArrayList<Integer>());
        ArrayList<Integer> b = obra.meFaltanDeLaClase(new ArrayList<Integer>(), new ArrayList<Integer>(), 0);
        ArrayList<Integer> c = obra.noTengo(new ArrayList<Integer>(), new ArrayList<Integer>());
        Integer e = obra.puedoCambiar(new ArrayList<Integer>(), new ArrayList<Integer>());
    }
}
