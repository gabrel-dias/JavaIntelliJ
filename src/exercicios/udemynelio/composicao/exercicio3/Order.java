package exercicios.udemynelio.composicao.exercicio3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();
    private Client client;


    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void remove(OrderItem item) {
        items.remove(item);

    }

    public Double total() {
        Double total = 0d;
        return total;
    }
}
