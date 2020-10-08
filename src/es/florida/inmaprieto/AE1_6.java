package es.florida.inmaprieto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AE1_6 {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        int numero, sizeLista, contador = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Introduce un número: ");
            numero = scanner.nextInt();
            lista.add(numero);
            sizeLista = lista.size();
            contador += contador+numero;
        }while(sizeLista < 5);

        // se crea una nueva lista que contendrá el array invertido que devuelve el método
        List<Integer> listaInvertida = invertirArray(lista);
        System.out.println(listaInvertida);
        System.out.print("La suma total de los números introducidos es: "+contador);
    }

    // Método que recibe un arraylist y usa reverse de la librería Collections para invertir el contenido
    public static List<Integer> invertirArray(List<Integer> list){
        List<Integer> reverse = new ArrayList<>(list);
        Collections.reverse(reverse);
        return reverse;
    }


}
