package exercicios.udemynelio.exemplos.banco.entidades;

public class Conta {
    private final int numeroConta;
    private String titular;
    private double saldo;


    /* o depósito inicial é na abertura da conta é opcional
    TODO titular mudar de nome em caso de casamento
    o saldo da conta não pode ser alterado livremente (implementar mecanismo para proteger)
    o saldo só aumenta com depósitos e diminui nos saques, nos quais é cobrado uma taxa de R$ 5
    a conta pode ficar com saldo negativo se ele não for suficiente para realizar o saque e/ou pagar a taxa
    TODO fazer o programa de criação da conta
    dar opção para que seja depositado o valor inicial ou não
    realizar um depósito e depois um saque, sempre mostrando os dados da conta após cada operação
    */

    public Conta(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositoInicial(double depositoInicial) {
        setSaldo(depositoInicial);
    }

    public void fazerDeposito(double deposito) {
        saldo += deposito;
    }

    public void fazerSaque(double saque) {
        saldo -= saque + 5d;
    }

    @Override
    public String toString() {
        return "Conta " + numeroConta +
                ", Titular: " + titular +
                ", Saldo: R$ " + saldo;
    }
}
