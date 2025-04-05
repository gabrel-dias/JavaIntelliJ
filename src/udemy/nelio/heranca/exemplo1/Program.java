package udemy.nelio.heranca.exemplo1;

public class Program {
    public static void main(String[] args) {
        BusinessAccount account = new BusinessAccount(5555, "Gabrel Dias", 0d, 20d);
        account.deposit(30);
        account.withdraw(10);
        account.loan(10);
    }
}
