package udemy.nelio.polimorfismo.exercicio1.entities;

public class Individual extends TaxPayer {

    private double healthExpenditures;

    public Individual(String name, double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double basicTax = 0;
        if (getAnualIncome() < 20000) {
            basicTax = getAnualIncome() * 0.15;
        } else if (getAnualIncome() >= 20000) {
            basicTax = getAnualIncome() * 0.25;
        }
        double healhDeduction = 0;
        if (healthExpenditures > 0) {
            healhDeduction = healthExpenditures * 0.50;
        }
        return basicTax - healhDeduction;
    }
}
