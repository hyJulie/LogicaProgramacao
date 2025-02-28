package Exercise02;

//2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        if (num % 2 == 0 && num > 0){
            System.out.println("O número "+num+" é par e positivo");
        }else {
            System.out.println("O número é negativo e ímpar");
        }

        scan.close();
    }
}
