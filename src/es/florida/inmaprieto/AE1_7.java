package es.florida.inmaprieto;

import java.util.Scanner;

public class AE1_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre, nivel, salario;
        float experiencia;

        System.out.println("Introduce tu nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Introduce los años de experiencia laboral: ");
        experiencia = scanner.nextFloat();

        if (experiencia < 1){
            nivel = "Desarrollador Junior L1";
            salario = "entre 15000-18000";
        }else if (experiencia >= 1 && experiencia <= 2){
            nivel = "Desarrollador Junior L2";
            salario = "entre 18000-22000";
        }else if (experiencia >= 3 && experiencia <= 5){
            nivel = "Desarrollador Senior L1";
            salario = "entre 22000-28000";
        }else if (experiencia > 5 && experiencia <= 8){
            nivel = "Desarrollador Senior L2";
            salario = "entre 28000-36000";
        }else if(experiencia > 8){
            nivel = "Analista / Arquitecto";
            salario = "a convenir en base al rol";
        }else {
            nivel = "Nivel desconocido";
            salario = "desconocido";
        }

        System.out.println(nombre+ " es "+nivel+ " y su salario es "+salario);

    }
}
