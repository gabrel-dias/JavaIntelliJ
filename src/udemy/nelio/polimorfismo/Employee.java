package udemy.nelio.polimorfismo;

public class Employee {
    private String name;
    private int hours;
    private double valuePerHour;

    public Employee(String name, int hours, double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public double payment(){
        return hours*valuePerHour;
    }

}
