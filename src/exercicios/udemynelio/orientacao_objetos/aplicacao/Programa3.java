package exercicios.udemynelio.orientacao_objetos.aplicacao;

import exercicios.udemynelio.orientacao_objetos.entidades.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Programa3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Nome do aluno: ");
        aluno.nome = sc.nextLine();

        System.out.print("Primeira nota: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Segunda nota: ");
        aluno.nota2 = sc.nextDouble();
        System.out.print("Terceira nota: ");
        aluno.nota3 = sc.nextDouble();
        sc.close();

        System.out.println("Nota final: " + String.format("%.2f", aluno.calcularNota()));
        System.out.println(aluno.aprovaReprova());
    }
}
