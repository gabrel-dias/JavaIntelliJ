package cdl.mobile;

import java.util.Scanner;

public class DisciplinaMobile3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int n = sc.nextInt();
        System.out.println("O dobro de " + n + " é: " + n * 2);
        sc.close(); // poupa recursos e não deixa o scanner "aberto"
    }
}
