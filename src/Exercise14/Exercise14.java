package Exercise14;

//14 - Faça um algoritmo que receba um valor A e B,
// e troque o valor de A por B e o valor de B por A e imprima na tela os valores.

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int A = scan.nextInt();

        System.out.println("Digite o valor de B: ");
        int B = scan.nextInt();

        System.out.println("\nAntes da troca de valores: ");
        System.out.println("Valor de A: "+A);
        System.out.println("Valor de B: "+B);

        int temp = A; //para armazenar e salvar o valor original de A
        A = B;
        B = temp;

        System.out.println("\nDepois da troca: ");
        System.out.println("Valor de A: "+A);
        System.out.println("Valor de B: "+B);

        scan.close();
    }
}
