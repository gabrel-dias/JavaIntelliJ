package exercicios.udemynelio.exemplos.banco.entidades;

public class Conta {
    private final int numeroConta;
    private String titular;
    private double saldo;

    // TODO titular mudar de nome em caso de casamento

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

    public void mudarNomeTitular(String nome){
        setTitular(nome);
    }

    @Override
    public String toString() {
        return "Conta " + numeroConta +
                ", Titular: " + titular +
                ", Saldo: R$ " + saldo;
    }
}
