package Exercise05;

import java.util.Scanner;

//5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
//
//usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double salarioMin = 1293.20;

        System.out.println("Digite o valor do salário: ");
        double salario = scan.nextDouble();

        double quantidadeSalarios = salario / salarioMin;

        System.out.printf("Você recebe aproximadamente %.2f salários mínimos.%n", quantidadeSalarios);

        scan.close();
    }
}
