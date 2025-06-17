package udemy.nelio.polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbert of employees: ");
        int employees = sc.nextInt();
        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < employees; i++) {
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char out = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valueHour = sc.nextDouble();

            if (out == 'y') {
                System.out.print("Additional charge: ");
                double charge = sc.nextDouble();
                employeeList.add(new OutsourcedEmployee(name, hours, valueHour, charge));
            } else {
                employeeList.add(new Employee(name, hours, valueHour));
            }
        }
        for (Employee employee : employeeList) {
            System.out.println(employee.getName());
        }
    }
}
