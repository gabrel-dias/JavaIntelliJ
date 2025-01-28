package exercicios.udemynelio.exemplos.produto.application;

import exercicios.udemynelio.exemplos.produto.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do produto:");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Preço: ");
        double price = sc.nextDouble();

        Product product = new Product();

        product.setName(name);
        product.setPrice(price);

        System.out.println("Dados do produto: " + product);
        System.out.println("Digite a quantidade do produto que será atualizada no estoque: ");
        int quantity = sc.nextInt();
        product.addQuantityProducts(quantity);
        System.out.println("Dados do produto atualizados: " + product);
        System.out.println("Digite a quantidade do produto que será reduzida do estoque: ");
        quantity = sc.nextInt();
        product.removeQuantityProducts(quantity);
        System.out.println("Dados do produto atualizados: " + product);
        sc.close();
    }
}