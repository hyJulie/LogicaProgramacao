package Exercise10;

//Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double primeiraNota = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double segundaNota = scan.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double terceiraNota = scan.nextDouble();

        double media =  (primeiraNota + segundaNota + terceiraNota) / 3;

        System.out.println("A média das notas foi: "+media);

        scan.close();
    }
}
