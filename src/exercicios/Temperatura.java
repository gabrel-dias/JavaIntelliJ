/*
1. Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K),
Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8;
Ra = C * 1.8 + 32 + 459.67
 */
package exercicios;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double c, k, re, ra, f;
        System.out.println("Digite a temperatura em Celsius que será convertida: ");
        c = Double.parseDouble(entrada.nextLine());

        System.out.println("Escolha a unidade para converter a temperatura " + c + "°C\n" +
                "[1] => Fahrenheit (F)\n" +
                "[2] => Kelvin (K)\n" +
                "[3] => Réaumur (Re)\n" +
                "[4] => Rankine (Ra)");

        // atribuição das temperaturas convertidas
        int escolhaTemp = entrada.nextInt();
        switch (escolhaTemp) {
            case 1:
                f = c * 1.8d + 32d;
                System.out.println("A temperatura " + c + "°C foi convertida para graus Fahrenheit e ficou " + f + "°F");
                break;
            case 2:
                k = c + 273.15d;
                System.out.println("A temperatura " + c + "°C foi convertida para graus Kelvin e ficou " + k + "°K");
                break;
            case 3:
                re = c * 0.8d;
                System.out.println("A temperatura " + c + "°C foi convertida para graus Réaumur e ficou " + re + "°Re");
                break;
            case 4:
                ra = c * 1.8d + 32d + 459.67d;
                System.out.println("A temperatura " + c + "°C foi convertida para graus Rankine e ficou " + ra + "°Ra");
                break;
        }
    }
}
