package udemy.nelio.heranca.exemplo1;

public class BusinessAccount extends Account {
    private Double loanLimit;

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount;
            System.out.println("Loan granted, current balance: $" + getBalance());
        } else System.out.println("Loan denied!");
    }
}
