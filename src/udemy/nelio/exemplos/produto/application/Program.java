package udemy.nelio.exemplos.produto.application;

import udemy.nelio.exemplos.produto.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de produtos que serão adicionados: ");
        int qtd = sc.nextInt();
        Product[] product = new Product[qtd];

        for (int i = 0; i < product.length; i++) {
            System.out.print("Digite os dados do produto:\nNome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Preço: ");
            double price = sc.nextDouble();
            product[i] = new Product(name, price);
        }
        double somaValores = 0d;
        for (Product value : product) {
            somaValores += value.getPrice();
        }
        System.out.printf("Média dos preços dos produtos: %.2f%n", somaValores / product.length);
        System.out.print("Qual produto editar? ");
        int index = sc.nextInt();
//        product[index].setName(name);
//        product[index].setPrice(price);

        System.out.println("Dados do produto: " + product[index]);
        System.out.println("Digite a quantidade do produto que será atualizada no estoque: ");
        int quantity = sc.nextInt();
        product[index].addQuantityProducts(quantity);
        System.out.println("Dados do produto atualizados: " + product[index]);
        System.out.println("Digite a quantidade do produto que será reduzida do estoque: ");
        quantity = sc.nextInt();
        product[index].removeQuantityProducts(quantity);
        System.out.println("Dados do produto atualizados: " + product[index]);
        sc.close();
    }
}