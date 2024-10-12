package exercicios;

import java.util.Random;
import java.util.Scanner;

public class TamanhoArrayAleatorio {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner sc = new Scanner(System.in);
        int tamanhoVetor;
        int resposta;
        do {
            tamanhoVetor = aleatorio.nextInt(100);
            System.out.println("Tamanho do array gerado aleatoriamente: " + tamanhoVetor + "\nDeseja gerar outro tamanho de array?\n[1] Sim [2] Digitar um tamanho de array [0] Não ");
            resposta = sc.nextInt();

            if (resposta > 2) {
                System.out.println("Opção inválida! Digite apenas o que foi mostrado");
            } else if (resposta == 2) {
                System.out.print("Digite o valor que você deseja: ");
                tamanhoVetor = sc.nextInt();
                break;
            }
        } while (resposta != 0);

        int[] vetor = new int[tamanhoVetor];
        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] = aleatorio.nextInt(1000);
            System.out.println("Valor do índice: " + i + " = " + vetor[i]);
        }
    }
}
