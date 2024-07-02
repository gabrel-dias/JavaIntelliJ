package desafios.resolvidos.abrindo_contas;

import java.util.Scanner;

public class AbrindoContas {

    public static void main(String[] args) {
        // Lendo os dados de Entrada:

        Scanner scanner = new Scanner(System.in);
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
        String nomeTitular = scanner.nextLine();
        double saldo = scanner.nextDouble();

        // Cria uma instância de "ContaBancaria" com os valores de Entrada.
        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldo);


        System.out.println("Informações:");
        // Imprime as informações da conta usando o objeto criado acima.
        System.out.println(conta); // depois eu descobri que é só implementar os getters dos atributos da conta
        // e chamá-los na saída do terminal
    }
}

class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    //Método construtor pro retorno não ser o endereço na memória
    @Override
    public String toString() {
        return "Conta: " + numero + "\nTitular: " + titular + "\nSaldo: R$ " + saldo;
    }

    //Construtor da classe
    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
}