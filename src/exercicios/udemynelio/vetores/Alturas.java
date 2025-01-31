package exercicios.udemynelio.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        Pessoa[] pessoa = new Pessoa[n];
        String nome;
        int idade;
        double altura;

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            nome = sc.nextLine();
            System.out.print("Idade: ");
            idade = sc.nextInt();
            System.out.print("Altura: ");
            altura = sc.nextDouble();
            pessoa[i] = new Pessoa(nome, idade, altura);
        }
        System.out.printf("Altura média: %.2f m%n%n" , Pessoa.alturaMedia(pessoa));
        Pessoa.porcentagemIdade16(pessoa);
    }
}

class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public static double alturaMedia(Pessoa[] pessoa) {
        double somaAltura = 0d;
        for (int i = 0; i < pessoa.length; i++) {
            somaAltura += pessoa[i].getAltura();
        }
        return somaAltura / pessoa.length;
    }

    public static void porcentagemIdade16(Pessoa[] pessoa) {
        int qtd16 = 0;
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getIdade() < 16) qtd16++;
            System.out.println("Nome: " + pessoa[i].getNome());
            System.out.println("Idade: " + pessoa[i].getIdade());
            System.out.println("----------------");
        }
        double porcentagem = ((double) qtd16 / pessoa.length * 100);
        System.out.println("Porcentagem de pessoas menores de 16 anos: " + porcentagem + "%");
    }
}