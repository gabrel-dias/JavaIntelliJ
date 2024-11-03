/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
 */

package exercicios;

import java.util.Scanner;

public class Nivelamento4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matricula, horasTrabalhadas;
        double valorHora, salario;

        System.out.println("Digite a matrícula do funcionário: ");
        matricula = sc.nextInt();
        System.out.println("Digite a quantidade de horas trabalhadas do funcionário: ");
        horasTrabalhadas = sc.nextInt();
        System.out.println("Digite o valor da sua hora trabalhada: ");
        valorHora = sc.nextDouble();


    }
}
