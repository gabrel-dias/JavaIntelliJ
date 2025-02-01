package exercicios.udemynelio.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String nome;
        String email;
        int quarto;

        System.out.print("Quantos hóspedes irão alugar quartos? ");
        int n = sc.nextInt();
        Aluguel[] alugueis = new Aluguel[10];

        for (int i = 0; i < n; i++) {
            System.out.println("Aluguel #" + (i + 1));
            System.out.print("Nome: ");
            sc.nextLine();
            nome = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            System.out.print("Quarto: ");
            quarto = sc.nextInt();
            alugueis[quarto] = new Aluguel(nome, email);
        }
        Aluguel.quartosOcupados(alugueis);
    }
}

class Aluguel {
    private String nome;
    private String email;

    public Aluguel(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public static void quartosOcupados(Aluguel[] alugueis) {
        System.out.println("Quartos ocupados:\n");
        for (int i = 0; i < alugueis.length; i++) {
            if (alugueis[i] != null) {
                System.out.println(i + ": " + alugueis[i].getNome() + ", " + alugueis[i].getEmail());
            }
        }
    }
}