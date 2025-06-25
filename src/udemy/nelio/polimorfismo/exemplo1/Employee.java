package udemy.nelio.polimorfismo.exemplo1;

import java.util.List;

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

    public double paymentValue() {
        return hours * valuePerHour;
    }

    public static String paymentList(List<Employee> employeeList) {
        StringBuilder sb = new StringBuilder("PAYMENTS:\n");
        for (Employee employee : employeeList)
            sb.append(employee.getName()).append(" - $ ").append(employee.paymentValue()).append("\n");
        return sb.toString();
    }

}
