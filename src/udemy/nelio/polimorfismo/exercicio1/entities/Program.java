package udemy.nelio.polimorfismo.exercicio1.entities;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Tax payer #"+i+ " data:");
            System.out.print("Individual or company (i/c)? ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Individual or company (i/c)? ");
        }
    }
}
