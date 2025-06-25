package udemy.nelio.polimorfismo.exemplo2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
    private LocalDate manufactureDate;

    public UsedProduct(String name, double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    @Override
    public String priceTag() {
        return getName() + " (used) $ " + getPrice() + " (Manufacture date: " + getManufactureDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
    }
}
