package udemy.nelio.polimorfismo.exemplo2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Product> productList = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:\nCommon, used or imported (c/u/i)?");
            char productType = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (productType == 'c') {
                productList.add(new Product(name, price));
            } else if (productType == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String dateString = sc.next();
                LocalDate manufactureDate = LocalDate.parse(dateString, formatter);
                productList.add(new UsedProduct(name, price, manufactureDate));
            } else if (productType == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                productList.add(new ImportedProduct(name, price, customsFee));
            }
            sc.close();
        }
        for (Product product : productList) {
            System.out.println(product.priceTag());
        }
    }
}
