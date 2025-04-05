package udemy.nelio.exemplos.banco.aplicacao;

import udemy.nelio.exemplos.banco.entidades.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Aplicativo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;
        System.out.print("Digite o número da conta: ");
        int numeroConta = Integer.parseInt(sc.nextLine());
        System.out.print("Digite o nome do titular: ");
        String titular = sc.nextLine();
        char opcaoDeposito;
        double deposito;
        do {
            System.out.println("Deseja fazer o primeiro depósito (s/n)? ");
            opcaoDeposito = sc.next().toLowerCase().charAt(0);

            // verificando se há depósito inicial ou não para instanciar o objeto
            if (opcaoDeposito == 's') {
                System.out.println("Digite o valor do depósito inicial: ");
                deposito = sc.nextDouble();
                conta = new Conta(numeroConta, titular, deposito);
            } else conta = new Conta(numeroConta, titular);
            if (opcaoDeposito != 's' && opcaoDeposito != 'n')
                System.out.println("Opção inválida digite apenas \"Sim\" ou \"Não\"");
        } while (opcaoDeposito != 's' && opcaoDeposito != 'n');

        System.out.println("Dados da conta criada:\n" + conta);

        System.out.print("Digite o valor do depósito: ");
        deposito = sc.nextDouble();
        conta.fazerDeposito(deposito);
        System.out.println("Saldo atualizado:\n" + conta);

        System.out.print("Digite um valor para saque: ");
        double saque = sc.nextDouble();
        conta.fazerSaque(saque);

        System.out.println("Saldo atualizado:\n" + conta);

        char opcaoTrocaNome;
        do {
            System.out.println("Deseja mudar o nome do titular (s/n)? ");
            opcaoTrocaNome = sc.next().toLowerCase().charAt(0);
            if (opcaoTrocaNome == 's') {
                System.out.println("Digite o novo nome do titular: ");
                sc.nextLine();
                String novoNomeTitular = sc.nextLine();
                conta.setTitular(novoNomeTitular);
                System.out.println("Dados do titular atualizados:\n" + conta);
            } else if (opcaoTrocaNome == 'n') {
                System.out.println("O nome do titular não foi alterado.");
            } else
                System.out.println("Opção inválida digite apenas \"Sim\" ou \"Não\"");
        } while (opcaoTrocaNome != 's' && opcaoTrocaNome != 'n');
        System.out.println("Encerrando programa...");
        sc.close();
    }
}
