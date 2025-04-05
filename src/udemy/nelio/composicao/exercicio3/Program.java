// https://www.youtube.com/watch?v=gj80JEqk5ms
// https://github.com/devsuperior/aulao004

package udemy.nelio.composicao.exercicio3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // dados para criação de um cliente
        System.out.print("Enter client data:\nName: ");
        String name = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        LocalDate birthDate = LocalDate.parse(sc.nextLine(), formatter);
        Client client = new Client(name, email, birthDate);

        // dados para criação de um pedido
        System.out.print("Enter order data:\nSelect the status of the order:\n");
        OrderStatus[] statuses = OrderStatus.values();
        OrderStatus status = null;
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
        Order order = new Order(LocalDateTime.now(), status, client);

        System.out.print("How many items to this order? ");
        int quantityItens = sc.nextInt();
        for (int i = 0; i < quantityItens; i++) {
            System.out.println("Enter #" + (i + 1) + " item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();
            Product product = new Product(productName, productPrice);
            OrderItem item = new OrderItem(productQuantity, productPrice, product);
            order.addItem(item);
        }
        sc.close();
        System.out.print("\n" + order);
    }
}
