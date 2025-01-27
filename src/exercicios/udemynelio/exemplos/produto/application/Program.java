package exercicios.udemynelio.exemplos.produto.application;

import exercicios.udemynelio.exemplos.produto.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Digite os dados do produto:");
        System.out.print("Nome: ");
        product.name = sc.nextLine();
        System.out.print("Preço: ");
        product.price = sc.nextDouble();
        System.out.print("Quantidade em estoque: ");
        product.quantity = sc.nextInt();
        System.out.println("Dados do produto: " + product);

        System.out.println("Digite a quantidade do produto que será atualizada no estoque: ");
        int quantidade = sc.nextInt();
        product.addProducts(quantidade);
        System.out.println("Dados do produto atualizados: " + product);
        System.out.println("Digite a quantidade do produto que será reduzida da estoque: ");
        quantidade = sc.nextInt();
        product.removeProducts(quantidade);
        System.out.println("Dados do produto atualizados: " + product);
        sc.close();
    }
}
