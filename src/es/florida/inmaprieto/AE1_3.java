package es.florida.inmaprieto;

import java.util.Scanner;

public class AE1_3 {

    public static void main(String[] args) {
        int numero, resultado;
        Scanner teclado = new Scanner( System.in );

        System.out.print( "Introduzca un número entero: " );
        numero = teclado.nextInt();

        AE1_3 sumatorio = new AE1_3();
        resultado = sumatorio.sumaPares(numero);
        System.out.print(resultado);
    }

    public int sumaPares(int numero){
        int contador = 0, resultado = 0;

        while (contador <= numero){
            if ( contador % 2 == 0 ) {
                resultado += contador;
            }
            contador++;
        }

        return resultado;
    }

}
