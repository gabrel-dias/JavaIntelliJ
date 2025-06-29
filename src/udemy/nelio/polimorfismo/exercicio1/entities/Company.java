package udemy.nelio.polimorfismo.exercicio1.entities;

public class Company extends TaxPayer {
    private int numberEmployees;

    public Company(String name, double anualIncome, int numberEmployees) {
        super(name, anualIncome);
        this.numberEmployees = numberEmployees;
    }

    @Override
    public double tax() {
        double taxRate = numberEmployees > 10 ? 0.14 : 0.16;
        return getAnualIncome() * taxRate;
    }
}