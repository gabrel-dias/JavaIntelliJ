// https://www.youtube.com/watch?v=gj80JEqk5ms
// https://github.com/devsuperior/aulao004

package exercicios.udemynelio.composicao.exercicio3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
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
        Order order = null;
        List<OrderItem> orderItems = new ArrayList<>();
        Product product = null;
        OrderItem orderItem = null;
        System.out.print("How many items to this order? ");
        int quantityItens = sc.nextInt();
        for (int i = 0; i < quantityItens; i++) {
            System.out.println("Enter #" + (i + 1) + " item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer productQuantity = sc.nextInt();
            product = new Product(productName, productPrice);
            orderItem = new OrderItem(productQuantity, product.getPrice(), product);
            orderItems.add(orderItem);
            order = new Order(LocalDateTime.now(), status, orderItems, client);
        }
        System.out.println("Order summary:");
        System.out.println("Order moment: " + formatter.format(order.getMoment()));
        System.out.println("Order status: " + status);
        System.out.println("Client: " + client.getName() + " (" + formatter.format(client.getBirthDate()) + ") - " + client.getEmail());
        for (int i = 0; i < quantityItens; i++) {
            System.out.println("Order items:\n" + product.getName() + ", $" + product.getPrice() + ", Quantity: " + orderItem.getQuantity() + ", Subtotal: $" + orderItem.subtotal());
            System.out.println("Total price: $" + orderItem.subtotal());
        }
    }
}
