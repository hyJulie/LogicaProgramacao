package Exercise04;

//4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        int ant = num - 1;
        int suc = num + 1;

        System.out.println("O antecessor do número "+num+" é: "+ant);
        System.out.println("O sucessor do número "+num+" é: "+suc);


        scan.close();
    }
}
