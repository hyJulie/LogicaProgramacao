package Exercise23;

//21 - Faça um algoritmo que efetue o cálculo do salário líquido de um professor.
// As informações fornecidas serão: valor da hora aula,
// número de aulas lecionadas no mês e percentual de desconto do INSS.
// Imprima na tela o salário líquido final.

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da aula-hora: ");
        double aulaHora = scan.nextDouble();

        System.out.println("Digite o número de aulas lecionadas no mês: ");
        int numeroAulas = scan.nextInt();

        System.out.println("Digite o percentual de desconto do INSS: ");
        double percentualINSS = scan.nextDouble();

        //calculo do salário bruto
        double salarioBruto = aulaHora * numeroAulas;

        //calculo do desconto
        double descontoINSS = (percentualINSS / 100) * salarioBruto;

        double salarioLiquido = salarioBruto - descontoINSS;

        System.out.println("\n----Cálculo de Salários----");
        System.out.println("Salário Bruto: R$"+salarioBruto);
        System.out.println("Desconto INSS: R$"+descontoINSS);
        System.out.println("Salário Líquido: R$"+salarioLiquido);

        scan.close();

    }
}
