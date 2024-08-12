package mobile;

import java.util.Scanner;

public class DisciplinaMobile3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número");
        int n = teclado.nextInt();
        System.out.println("O dobro de " + n + " é: " + n * 2);
    }
}
