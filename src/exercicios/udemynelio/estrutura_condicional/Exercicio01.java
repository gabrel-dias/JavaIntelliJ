package exercicios.udemynelio.estrutura_condicional;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        /*
        Fazer um programa para ler um número inteiro, e depois dizer se
        este número é negativo ou não.
         */
        System.out.println("Digite um número inteiro:");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        if (numero < 0){
            System.out.println("NEGATIVO");
        } else
            System.out.println("POSITIVO");
    }
}
