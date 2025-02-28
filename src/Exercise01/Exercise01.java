package Exercise01;

import java.util.Scanner;

//1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int A = scan.nextInt();

        System.out.println("Digite o valor de B: ");
        int B = scan.nextInt();

        System.out.println("Digite o valor de C: ");
        int C = scan.nextInt();

        int sum = A + B;

        if (sum > C){
            System.out.println("Soma de A + B: "+sum+", é maior que o valor de C: "+C);
        }else {
            System.out.println("A soma de A + B: "+sum+", não é maior que o valor de C: "+C);
        }

        scan.close();
    }
}
