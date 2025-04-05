package udemy.nelio.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int[] numeros = new int[n];

        // for que adiciona os números no vetor
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Números negativos:");
        for (int negativo : numeros) {
            if (negativo <= 0) {
                System.out.println(negativo);
            }
        }
    }
}
