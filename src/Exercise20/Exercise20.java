package Exercise20;

//20 - Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        System.out.println("Tábuada de "+num+" :");
        for (int i = 1;i <= 10;i++){
            System.out.println(num+" x "+i+" = "+(num * i));
        }

        scan.close();
    }
}
