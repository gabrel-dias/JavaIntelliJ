package exercicios.udemynelio.composicao.exercicio3;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Double subtotal() {
        return quantity * price;
    }
}
