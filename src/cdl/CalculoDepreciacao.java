package cdl;

import java.util.Scanner;

public class CalculoDepreciacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite o custo do bem: ");
        double custoDoBem = scanner.nextDouble();

        System.out.println("Digite o valor residual do bem: ");
        double valorResidual = scanner.nextDouble();

        System.out.println("Digite a vida útil do bem (em anos): ");
        int vidaUtil = scanner.nextInt();

        // Cálculo da depreciação anual
        double depreciacaoAnual = (custoDoBem - valorResidual) / vidaUtil;

        // Saída do resultado
        System.out.println("A depreciação anual do bem é: R$ " + depreciacaoAnual);

        scanner.close();
    }
}
