package Exercise13;

//13 - Faça algoritmo que leia o nome e a idade de uma peso e imprima na tela o nome da pessoa e se ela é maior ou menor de idade.

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomePessoa = scan.nextLine();

        System.out.println("Digite sua idade: ");
        int idadePessoa = scan.nextInt();

        if (idadePessoa > 18){
            System.out.println("A pessoa "+nomePessoa+" tem "+idadePessoa+" anos e é maior de idade.");
        }else {
            System.out.println("A pessoa "+nomePessoa+" tem "+idadePessoa+" anos e é menor de idade.");
        }

        scan.close();
    }
}
