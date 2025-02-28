package Exercise22;

//22 - Faça um algoritmo que leia dois valores inteiros A e B,
// imprima na tela o quociente e o resto da divisão inteira entre eles.

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int A = scan.nextInt();

        System.out.println("Digite o valor de B: ");
        int B = scan.nextInt();

        int quociente = A / B;
        int resto = A % B;

        System.out.println("Quociente: "+quociente);
        System.out.println("Resto: "+resto);

        scan.close();
    }
}
