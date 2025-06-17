package udemy.nelio.polimorfismo;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbert of employees: ");
        int employees = sc.nextInt();
        for (int i = 0; i < employees; i++) {
            System.out.println("Employee #" + i + 1 + " data:");

        }
    }
}
