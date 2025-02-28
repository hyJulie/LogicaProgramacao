package Exercise24;

/*
24 - Faça um algoritmo que calcule a quantidade de litros de combustível gastos em uma viagem,
sabendo que o carro faz 12km com um litro.
Deve-se fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média,
distância percorrida e a quantidade de litros utilizados para fazer a viagem.

Fórmula: distância = tempo x velocidade.

            litros usados = distância / 12.
 */

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tempo gasto na viagem, em horas: ");
        double tempo = scan.nextDouble();

        System.out.println("Digite a velocidade média, em km: ");
        double velocidade = scan.nextDouble();

        double distancia = tempo * velocidade;

        double litrosUsados = distancia / 12;

        System.out.println("\n---Viagem---");
        System.out.println("Distância percorrida na viagem: "+distancia);
        System.out.printf("Litros usados na viagem: %.2f",litrosUsados);

        scan.close();
    }
}
