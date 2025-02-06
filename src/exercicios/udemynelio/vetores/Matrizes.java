package exercicios.udemynelio.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.print("=======Matriz=======\nLinhas: ");
        m = sc.nextInt();
        System.out.print("Colunas: ");
        n = sc.nextInt();
        int[][] matriz = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Digite um número que será buscado na matriz: ");
        int x = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("Posição: " + i + ", " + j);
                    if (j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Cima: " + matriz[i - 1][j]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("Direita: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Baixo: " + matriz[i + 1][j]);
                    }
                }
            }
        }
    }
}