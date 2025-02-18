package cdlPOO;

import java.util.Scanner;

public class POO1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor de B: ");
        double b = sc.nextDouble();

        Equacao equacao = new Equacao(a, b);
        System.out.print("O resultado da equação de 1º grau é: " + equacao.calcularRaiz(a, b));
    }

}

class Equacao {
    private double a;
    private double b;

    public Equacao(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calcularRaiz(double a, double b) {
        return -b / a;
    }

}