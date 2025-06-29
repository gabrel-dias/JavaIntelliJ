package udemy.nelio.polimorfismo.exercicio1.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<TaxPayer> taxPayerList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char typePayer = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if (typePayer == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                taxPayerList.add(new Individual(name, anualIncome, healthExpenditures));
            } else if (typePayer == 'c') {
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();
                taxPayerList.add(new Company(name, anualIncome, numberEmployees));
            }
        }
        System.out.println("TAXES PAID:");
        double sumTaxes = 0;
        for (TaxPayer payer : taxPayerList) {
            System.out.printf(payer.getName() + " $ %.2f%n", payer.tax());
            sumTaxes += payer.tax();
        }
        System.out.printf("TOTAL TAXES: $ %.2f", sumTaxes);
    }
}
