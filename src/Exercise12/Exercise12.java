package Exercise12;

//12 - Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago,
// conforme a escolha da forma de pagamento pelo comprador e imprima na tela o valor final do produto a ser pago.
//
//
// Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.
//
//
//
// Tabela de Código de Condições de Pagamento
//
//
//
// 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
//
// 2 - À Vista no cartão de crédito, recebe 10% de desconto
//
// 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
//
// 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valorProduto = scan.nextDouble();

        System.out.println("\n----Exolha a opção de pagamento----");
        System.out.println("1 - À Vista em Dinheiro ou Pix, vai receber 15% de desconto");
        System.out.println("2 - À Vista no cartão de crédito, vai receber 10% de desconto");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes, preço normal do produto mais juros 10%");

        System.out.println("Digite o código da forma de pagamento: ");
        int opcao = scan.nextInt();

        //para fazer o cálculo
        double valorFinal, desconto, juros;

        switch (opcao){
            case 1:
              desconto = valorProduto * 0.15;
              valorFinal = valorProduto - desconto;
                System.out.printf("Desconto de R$ %.2f%n", desconto);
                System.out.printf("Valor final com desconto: R$ %.2f%n", valorFinal);
            break;
            case 2:
                desconto = valorProduto * 0.10;
                valorFinal = valorProduto - desconto;
                System.out.printf("Desconto de R$ %.2f%n", desconto);
                System.out.printf("Valor final com desconto: R$ %.2f%n", valorFinal);
            break;
            case 3:
                valorFinal = valorProduto;
                System.out.printf("Valor final parcelado em 2x: R$ %.2f (2x de R$ %.2f)%n", valorFinal, valorFinal/2);
            break;
            case 4:
                juros = valorProduto * 0.10;
                valorFinal = valorProduto + juros;
                System.out.printf("Juros de R$ %.2f%n", juros);
                System.out.printf("Valor final com juros: R$ %.2f%n", valorFinal);
                System.out.print("Digite o número de parcelas (mínimo 3): ");
                int parcelas = scan.nextInt();

                if (parcelas >= 3) {
                    System.out.printf("Parcelado em %dx de R$ %.2f%n", parcelas, valorFinal / parcelas);
                } else {
                    System.out.println("Número de parcelas inválido! Deve ser 3 ou mais.");
                }
                break;
            default:
                System.out.println("Opção inválida! Escolha um número entre 1 e 4.");
        }

        scan.close();
    }
}
