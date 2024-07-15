/*
2. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas.
Fazer um algoritmo que calcule e escreva:
a) a maior e a menor altura do grupo;
b) média de altura dos homens;
c) o número de mulheres.
*/
package exercicios;

import java.util.Scanner;

public class HomensMulheres {
    public static void main(String[] args) {
        int sexo, qtHomens = 0, qtMulheres = 0;
        double mediaAlturaHomem, alturaHomem, alturaMulher, maiorAltura, menorAltura;

        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            System.out.println("A " + (i+1) + " pessoa, será:\n" +
                    "[1] homem\n" +
                    "[2] mulher");
            sexo = entrada.nextInt();

            if (sexo == 1) {
                qtHomens = qtHomens + 1;
                System.out.println("Digite a altura do homem: ");
                alturaHomem= entrada.nextDouble();
                mediaAlturaHomem = alturaHomem / 10;
            }
        }
    }
}
