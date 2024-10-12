package exercicios;

import java.util.Random;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner sc = new Scanner(System.in);
        int resposta;
        do {
            int[] vetorAleatorio = new int[aleatorio.nextInt(1, 10)];
            System.out.println("Tamanho do vetor: " + vetorAleatorio.length + "\nDeseja gerar outro tamanho?\n[0] Não [1] Sim");
            resposta = sc.nextInt();

        } while (resposta != 0);
    }
}
