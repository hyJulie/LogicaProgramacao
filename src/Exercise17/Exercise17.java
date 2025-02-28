package Exercise17;

//17 - Faça um algoritmo que leia uma temperatura em Fahrenheit e calcule a temperatura correspondente em grau Celsius.
// Imprima na tela as duas temperaturas.
//
//Fórmula: C = (5 * ( F-32) / 9)

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double F = scan.nextDouble();

        double C = (5 * (F - 32) /9);

        System.out.println("Temperatura em Fahrenheit: "+F);
        System.out.printf("Temperatura de Fahrenheit para Celsius:  %.2f",C);

        scan.close();
    }
}
