package exercicios.udemynelio.exemplos.banco.aplicacao;

import exercicios.udemynelio.exemplos.banco.entidades.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numeroConta = Integer.parseInt(sc.nextLine());
        System.out.print("Digite o nome do titular: ");
        String titular = sc.nextLine();
        System.out.print("Deseja fazer o primeiro depósito (s/n)? ");
        Character opcaoDeposito = sc.next().charAt(0);
        double deposito = 0d;

        // se houver deposito inicial
        if (opcaoDeposito.equals('s')) {
            System.out.println("Digite o valor do depósito inicial: ");
            deposito = sc.nextDouble();
        }
        Conta conta = new Conta(numeroConta, titular);
        if (deposito >= 0d)
            conta.depositoInicial(deposito);

        System.out.println("Dados da conta:\n" + conta);

        System.out.print("Digite o valor do depósito: ");
        deposito = sc.nextDouble();
        conta.fazerDeposito(deposito);
        System.out.println("Saldo atualizado:\n" + conta);

        System.out.print("Digite um valor para saque: ");
        double saque = sc.nextDouble();
        conta.fazerSaque(saque);

        System.out.println("Saldo atualizado:\n" + conta);
    }
}
