package cdl.mobile;

import java.util.Locale;
import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o preço do litro do alcool:");
        double alcool = sc.nextDouble();
        System.out.println("Digite o preço do litro da gasolina:");
        double gasolina = sc.nextDouble();

        double divisao = alcool / gasolina;
        System.out.printf("%.2f\n", divisao);

        if (alcool / gasolina < 0.7) {
            System.out.println("Vale a pena usar alcool!");
        } else
            System.out.println("Vale a pena usar gasolina!");

    }
}