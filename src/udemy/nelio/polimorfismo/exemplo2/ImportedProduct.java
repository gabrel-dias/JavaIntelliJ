package udemy.nelio.polimorfismo.exemplo2;

public class ImportedProduct extends Product {
    private double customsFee;

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public double totalPrice() {
        return getPrice() + getCustomsFee();
    }

    @Override
    public String priceTag() {
        return getName() + " " + totalPrice() + " $ (Customs fee: " + getCustomsFee() + ")";
    }
}
