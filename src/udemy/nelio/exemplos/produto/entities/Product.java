package udemy.nelio.exemplos.produto.entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
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
