package udemy.nelio.polimorfismo.exercicio1.entities;

public class Individual extends TaxPayer {

    private double healthExpenditures;

    public Individual(String name, double anualIncome, double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    @Override
    public double tax() {
        double income = this.getAnualIncome();
        if (income < 20000) {
            income *= 0.15;
        } else if (income >= 20000) {
            income *= 0.25;
        }
        if (healthExpenditures > 0){
            income -= healthExpenditures * 0.50;
        }
        return income;
    }
}
