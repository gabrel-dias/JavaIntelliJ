package udemy.nelio.exemplos;

import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];

        for (int i = 0; i < 3; i++) {
            numeros[i] = sc.nextInt();
        }
        System.out.println("O maior número é: " + descobreMaiorNumero(numeros[0], numeros[1], numeros[2]));
    }

    public static int descobreMaiorNumero(int a, int b, int c) {
        int maior;
        if (a > b && a > c) {
            maior = a;
        } else if (b > c) {
            maior = b;
        } else maior = c;
        return maior;
    }
}