package Exercise08;

//8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

import java.util.Arrays;
import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valueOne = scan.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valueTwo = scan.nextInt();

        System.out.println("Digite o terceiro valor: ");
        int valueThree = scan.nextInt();

    int[] values = {valueOne, valueTwo, valueThree};

        Arrays.sort(values);

    for (int i = values.length - 1; i >=0 ; i--){
        System.out.print(values[i] + " ");
    }

    scan.close();
    }
}
