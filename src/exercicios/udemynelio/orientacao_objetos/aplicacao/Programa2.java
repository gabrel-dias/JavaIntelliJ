package exercicios.udemynelio.orientacao_objetos.aplicacao;

import exercicios.udemynelio.orientacao_objetos.entidades.Empregado;

import java.util.Locale;
import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Empregado empregado = new Empregado();

        System.out.print("Nome: ");
        empregado.nome = sc.nextLine();
        System.out.print("Salário bruto: ");
        empregado.salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        empregado.imposto = sc.nextDouble();

        System.out.println("Empregado: " + empregado.nome + ", " + "R$ " + String.format("%.2f", empregado.salarioLiquido()));
        System.out.println("Em quantos porcento aumentar o salário? ");
        double porcentagem = sc.nextDouble();
        empregado.aumentarSalario(porcentagem);
        sc.close();

        System.out.println("Salário atualizado: " + empregado.nome + ", " + "R$ " + String.format("%.2f", empregado.salarioLiquido()));
    }
}
