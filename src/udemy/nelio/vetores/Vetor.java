package udemy.nelio.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Quantas alturas devo ler? ");
        int qtdAltura = sc.nextInt();

        double[] alturas = new double[qtdAltura];
        for (int i = 0; i < alturas.length; i++) {
            alturas[i] = sc.nextDouble();
        }
        sc.close();
        double mediaAltura = 0d;
        for (double altura : alturas) {
            mediaAltura += altura;
        }
        System.out.print("Média da altura = " + String.format("%.2f", mediaAltura / alturas.length));
    }
}
