package exercicios.udemynelio.estrutura_sequencial;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
         */
        int codigoPeca1, codigoPeca2, quantidadePeca1, quantidadePeca2;
        double precoPeca1, precoPeca2, total;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código da primeira peça:");
        codigoPeca1 = sc.nextInt();
        System.out.println("Digite a quantidade da primeria peça:");
        quantidadePeca1 = sc.nextInt();
        System.out.println("Digite o valor unitário da primeira peça");
        precoPeca1 = sc.nextDouble();

        System.out.println("Digite o código da segunda peça:");
        codigoPeca2 = sc.nextInt();
        System.out.println("Digite a quantidade da segunda peça:");
        quantidadePeca2 = sc.nextInt();
        System.out.println("Digite o valor unitário da segunda peça");
        precoPeca2 = sc.nextDouble();

        total = (precoPeca1 * quantidadePeca1) + (precoPeca2 * quantidadePeca2);

        System.out.printf("Valor a pagar: R$ %.2f", total);
    }
}
