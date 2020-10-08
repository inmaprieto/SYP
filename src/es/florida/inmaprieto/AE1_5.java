package es.florida.inmaprieto;

public class AE1_5 {

    public static void main(String[] args) {
        Integer[] numeros = new Integer[]{81,8,12,5000,9,4,6,80,85};
        AE1_5 numeroMayor = new AE1_5();
        int resultado = numeroMayor.mayor(numeros);
        System.out.print(resultado);
    }

    public int mayor(Integer[] numeros){
        int mayor = 0;
        int actual;
        for (Integer numero : numeros) {
            actual = numero; // 5
            if (mayor < actual) {
                mayor = actual;
            }
            //System.out.println(mayor);
        }

        return mayor;
    }

}
