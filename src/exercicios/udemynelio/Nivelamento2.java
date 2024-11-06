package exercicios.udemynelio;

import java.util.Scanner;

public class Nivelamento2 {
    public static void main(String[] args) {
        /*
        Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        casas decimais conforme exemplos.
        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159
        */
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("""
                    Escolha uma opção:
                    [1] Calcular
                    [2] Encerrar""");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor do raio de círculo");
                    double raio;
                    raio = sc.nextDouble();
                    double area = Math.PI * (Math.pow(raio, 2d));
                    System.out.printf("A = %.4f\n", area);
                    break;
                case 2:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 2);
    }
}
