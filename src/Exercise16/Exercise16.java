package Exercise16;

//16 - Faça um algoritmo que leia três valores que representam os três lados de um triângulo e
// verifique se são válidos, determine se o triângulo é
//
//equilátero, isósceles ou escaleno.

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro lado do triângulo: ");
        double primeiroLado = scan.nextDouble();

        System.out.println("Digite o segundo lado do triângulo: ");
        double segundoLado = scan.nextDouble();

        System.out.println("Digite o terceiro lado do triângulo: ");
        double terceiroLado = scan.nextDouble();

        //verificar se é um triangulo

        if (ehTriangulo(primeiroLado, segundoLado,terceiroLado)){
            if (primeiroLado == segundoLado && segundoLado == terceiroLado ){
                System.out.println("É um triângulo equilátero, todos os lados são iguais");
            }else if(primeiroLado == segundoLado || primeiroLado == terceiroLado || segundoLado == terceiroLado){
                System.out.println("é um triângulo isósceles, dois lados são iguais");
            }else{
                System.out.println("É um triângulo Escaleno, todos os lados diferentes");
            }
        }

        scan.close();
    }

    //para conferir se é triangulo
    //A soma de dois lados deve ser sempre maior que o terceiro lado
    public static boolean ehTriangulo(double a, double b, double c){
        return ((a + b > c)&&(a + c > b)&&(b + c > a));
    }

}
//desigualdade tringular -> A soma de dois lados deve ser sempre maior que o terceiro lado.