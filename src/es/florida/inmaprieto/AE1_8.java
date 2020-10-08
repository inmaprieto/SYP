package es.florida.inmaprieto;

import java.util.Scanner;

public class AE1_8 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int num1, num2;
         AE1_8 intervalo = new AE1_8();
         long time_start, time_end;
         time_start = System.currentTimeMillis();

         System.out.print("Introduce el primer número para calcular un rango de valores: ");
         num1 = scanner.nextInt();
         System.out.print("Introduce el segundo número para calcular un rango de valores: ");
         num2 = scanner.nextInt();

         if (num1 > num2){
            intervalo.intervaloNum(num2,num1);
         }else {
             intervalo.intervaloNum(num1,num2);
         }

        time_end = System.currentTimeMillis();
        System.out.println("El tiempo de ejecución de este programa han sido: "+ ( (time_end - time_start)/1000 ) +" segundos");


    }

    public void intervaloNum (int n1, int n2){
        // n1 = min n2 = max
        String mensaje = "";
        for (int i = n1; i <= n2; i++) {
            int contador = 2;
            boolean primo = true;
         // saco los numeros del rango de valores
            while (primo && (contador != i)) { // calculo si cada número del rango es primo, se empieza por 2 porque el número 1 siempre es primo
                if (i % contador == 0){
                    // si el resto es cero, es un número primo
                    mensaje = i + " No es un número primo";
                    primo = false;
                }else {
                    mensaje = i + " es un número primo";
                    primo = true;
                }
                contador++;
            }
            System.out.println(mensaje);

        }

    }


}
