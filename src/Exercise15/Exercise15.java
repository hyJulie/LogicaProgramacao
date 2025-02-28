package Exercise15;

//15 - Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na tela quantos anos,
// meses e dias essa pessoa ja viveu. Leve em
//
//consideração o ano com 365 dias e o mês com 30 dias.

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite o ano em que você nasceu: ");
        int anoNascimento = scan.nextInt();

        System.out.println("Digite o ano atual: ");
        int anoAtual = scan.nextInt();

        int idadeAnos = anoAtual - anoNascimento;

        int idadeMeses = idadeAnos * 12;
        int idadeDias = idadeAnos * 365;

        System.out.println("Você viveu aproximadamente: ");
        System.out.println(idadeAnos+" anos");
        System.out.println(idadeMeses+" meses");
        System.out.println(idadeDias+" dias");


        scan.close();
    }
}
