package udemy.nelio.composicao.exercicio3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();
    private Client client;
    static DateTimeFormatter localDateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    static DateTimeFormatter localDateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void remove(OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        double total = 0d;
        for (OrderItem i : items) {
            total += i.subtotal();
        }
        return total;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order summary:\n");
        sb.append("Order moment: " + getMoment().format(localDateTimeFormatter) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client.getName() + " (" + localDateFormatter.format(client.getBirthDate()) + ") - " + client.getEmail() + "\n");
        sb.append("Order items:\n");
        for (OrderItem i : items) {
            sb.append(i + "\n");
        }
        sb.append("Total price: $" + String.format("%.2f", total()));

        return sb.toString();
    }
}
