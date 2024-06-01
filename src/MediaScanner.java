import java.util.Scanner;

public class MediaScanner {
    public static void main(String[] args) {
        Scanner entradaNota = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;

        System.out.println("Digite a 1ª nota");
        nota1 = entradaNota.nextInt();
        System.out.println("Digite a 2ª nota");
        nota2 = entradaNota.nextInt();
        System.out.println("Digite a 3ª nota");
        nota3 = entradaNota.nextInt();
        System.out.println("Digite a 4ª nota");
        nota4 = entradaNota.nextInt();
        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A sua média final é: " + media);
    }
}

