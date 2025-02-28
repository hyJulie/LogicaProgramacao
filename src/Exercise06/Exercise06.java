package Exercise06;

//6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor qualquer: ");
        double num = scan.nextDouble();

        double valorReajuste = num * 1.05;

        System.out.println("O valor do reajuste foi: "+valorReajuste);

        scan.close();

    }
}
