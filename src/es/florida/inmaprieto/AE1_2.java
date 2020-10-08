package es.florida.inmaprieto;

import java.util.Arrays;

public class AE1_2 {

    public static void main(String[] args) {
        String[] alumnos = new String[]{"Alumno 1", "Alumno 2", "Alumno 3", "Alumno 4", "Alumno 5", "Inma Prieto"};

        // Punto a
        for (String alumno : alumnos) {
            System.out.println(alumno);
        }

        // Punto b
        System.out.println(Arrays.asList(alumnos));
    }
}
