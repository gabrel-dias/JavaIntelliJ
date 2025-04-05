package udemy.nelio.orientacao_objetos.aplicacao;

import udemy.nelio.orientacao_objetos.entidades.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        System.out.println("Digite a largura e altura do retângulo:");
        System.out.print("Largura: ");
        retangulo.largura = sc.nextDouble();
        System.out.print("Altura: ");
        retangulo.altura = sc.nextDouble();
        sc.close();

        System.out.printf("Área do retângulo: %.2f%n", retangulo.area());
        System.out.printf("Perímetro do retângulo: %.2f%n", retangulo.perimetro());
        System.out.printf("Diagonal do retângulo: %.2f%n", retangulo.diagonal());
    }
}
