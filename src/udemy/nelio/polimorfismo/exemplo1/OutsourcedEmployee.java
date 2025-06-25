package udemy.nelio.polimorfismo.exemplo1;

public class OutsourcedEmployee extends Employee {
    private double additionalCharge;

    public OutsourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    @Override
    public double paymentValue() {
        return (additionalCharge * 1.1) + super.paymentValue();
    }
}
