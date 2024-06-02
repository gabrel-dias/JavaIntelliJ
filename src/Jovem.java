import java.util.Scanner;

public class Jovem {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a sua idade");
        int idade = entrada.nextInt();

        if (idade >= 25) {
            System.out.println("Você é velho!");
        } else if (idade == 24) {
            System.out.println("Você é gay!kkk");
        } else {
            System.out.println("Você é jovem!");
        }

    }
}
