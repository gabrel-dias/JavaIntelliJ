package exercicios.udemynelio.exemplos.banco.entidades;

public class Conta {
    private final int numeroConta;
    private String titular;
    private double saldo;

    public Conta(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Conta(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
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
