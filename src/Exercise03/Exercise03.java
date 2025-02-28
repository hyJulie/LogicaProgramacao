package Exercise03;

//3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
//
//caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
//
//imprimir seu valor na tela.

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int A = scan.nextInt();

        System.out.println("Digite o valor de B: ");
        int B = scan.nextInt();

        int C;

        if (A == B) {
            C = A + B;
            System.out.println("O valor da soma de A + B é: " + C);
        } else {
            C = (A * B);
            System.out.println("O valor da multiplicação de A * B é: "+C);

        }

        scan.close();
    }
}
