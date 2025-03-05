package exercicios.udemynelio.heranca.exemplo1;

public class Account {
    private Integer number;
    private String holder;
    // o protected permite que o atributo seja acessado por classes dentro do mesmo pacote e por classes que estejam
    // em qualquer pacote, contanto que sejam subclasses
    protected Double balance;

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw completed, current balance: $" + getBalance());
        } else System.out.println("Amount to withdraw greater than balance. Transaction denied!");
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit completed, current balance: $" + getBalance());
    }
}
