package cdl;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ContaEnergia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String[] bandeira = {"verde", "amarela", "vermelha1", "vermelha2"};
        Random bandeiraAleatoria = new Random();
        int index = bandeiraAleatoria.nextInt(bandeira.length);
        double tarifaBandeira;

        if (bandeira[index].equals("verde")) {
            System.out.println("Bandeira verde: condições favoráveis de geração de energia, sem acréscimo na tarifa.");
            tarifaBandeira = 0.01874;
        } else if (bandeira[index].equals("amarela")) {
            System.out.println("Bandeira amarela: condições de geração menos favoráveis, com acréscimo na tarifa.");
            tarifaBandeira = 0.03971;
        } else if (bandeira[index].equals("vermelha1")) {
            System.out.println("Bandeira vermelha - Patamar 1: condições mais custosas de geração, com acréscimo na tarifa");
            tarifaBandeira = 0.09492;
        } else {
            System.out.println("Bandeira vermelha - Patamar 2: condições ainda mais custosas de geração, com acréscimo na tarifa");
            tarifaBandeira = 0.14200;
        }
        System.out.print("Digite o valor da conta de luz em kWh: ");
        double consumoKWH = sc.nextDouble();
        double tarifaBase = 0.636;
        double resultado = (consumoKWH * tarifaBase) + (consumoKWH * tarifaBandeira);
        System.out.printf("Você gastou: " + "R$%.2f",resultado);

    }
}
