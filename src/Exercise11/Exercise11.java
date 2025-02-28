package Exercise11;

//11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas,
// imprima na tela o nome do aluno e
//
// se o aluno foi aprovado ou reprovado.
// Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("----Sistema de Notas----");

        System.out.println("Digite o nome do aluno: ");
        String aluno = scan.nextLine();

        System.out.println("Digite a primeira nota: ");
        double primeiraNota = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double segundaNota = scan.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double terceiraNota = scan.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double quartaNota = scan.nextDouble();

        double media =  (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

        if (media >= 7){
            System.out.println("O aluno "+aluno+" foi aprovado com a média de "+media);
        }else {
            System.out.println("O aluno "+aluno+"foi reprovado");
        }

        scan.close();
    }
}
