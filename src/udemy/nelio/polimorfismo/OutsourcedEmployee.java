package udemy.nelio.polimorfismo;

public class OutsourcedEmployee extends Employee {
    private double additionalCharge;

    public OutsourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }
}
