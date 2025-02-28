package Exercise07;

//7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor lógico: ");
        boolean a = scan.nextBoolean();

        System.out.println("Digite o segundo valor lógico: ");
        boolean b = scan.nextBoolean();

        if (a && b){
            System.out.println("Os dois são verdadeiros");
        } else if (!a && !b) {
            System.out.println("Os dois valores são falsos");
        }else {
            System.out.println("Os valores são diferentes");
        }

        scan.close();
    }
}
