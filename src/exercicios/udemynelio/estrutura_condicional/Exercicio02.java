package exercicios.udemynelio.estrutura_condicional;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        int opcao = 1;
        Scanner sc = new Scanner(System.in);
        while (opcao == 1) {
            int numero = sc.nextInt();
            System.out.println((numero % 2 == 0) ? "PAR" : "IMPAR");
            System.out.println("Continuar?\n[1] Sim\n[2] Não");
            opcao = sc.nextInt();
        }
    }
}
