package Exercise19;

//19 - Faça um algoritmo que imprima na tela a tabuada de 1 até 10.

public class Exercise19 {
    public static void main(String[] args) {
        int numero = 1;

        System.out.println("Tábuada de "+numero+": ");
        for (int i = 1; i <= 10;i++){
            System.out.println(numero+" x "+i+" = "+(numero * i));
        }

    }
}
