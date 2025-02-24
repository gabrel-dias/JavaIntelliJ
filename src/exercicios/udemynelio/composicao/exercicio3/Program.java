package exercicios.udemynelio.composicao.exercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // dados para criação de um cliente
        System.out.print("Enter client data:\nName: ");
        String name = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Birth date: ");
        LocalDate birthDate = LocalDate.parse(sc.nextLine(), formatter);
        Client client = new Client(name, email, birthDate);

        System.out.print("Enter order data:\nSelect the status of the order:\n");
        OrderStatus[] statuses = OrderStatus.values();
        OrderStatus status;
        boolean validChoice = false;
        for (int i = 0; i < statuses.length; i++) {
            System.out.println((i + 1) + ". " + statuses[i]);
        }
        while (!validChoice) {
            int choice = sc.nextInt();
            if (choice > 0 && choice <= statuses.length) {
                status = statuses[choice - 1];
                validChoice = true;
            } else System.out.println("Invalid option!");
        }

    }
}
