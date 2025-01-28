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
        System.out.print("Quantidade em estoque: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);
        System.out.println("Dados do produto: " + product);

        System.out.println("Digite a quantidade do produto que será atualizada no estoque: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Dados do produto atualizados: " + product);
        System.out.println("Digite a quantidade do produto que será reduzida da estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Dados do produto atualizados: " + product);
        sc.close();
    }
}
