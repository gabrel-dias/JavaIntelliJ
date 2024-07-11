/*
1. Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K),
Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8;
Ra = C * 1.8 + 32 + 459.67
 */
package exercicios;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner entradaTemp = new Scanner(System.in);
        double c, k, re, ra, f;
        System.out.println("Digite a temperatura em Celsius que será convertida: ");
        c = Double.parseDouble(entradaTemp.nextLine());
    }
}
