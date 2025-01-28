package exercicios.udemynelio.exemplos.produto.entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addQuantityProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeQuantityProducts(int quantity) {
        this.quantity -= quantity;

    }

    public String toString() {
        return name
                + " R$ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " unidades\nTotal: " + String.format("%.2f", totalValueInStock()) + "\n";
    }
}
