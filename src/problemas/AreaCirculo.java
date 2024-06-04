package problemas;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o raio do seu círculo: ");
        double raio = Double.parseDouble(entrada.nextLine());
        System.out.println(raio);
        double area = Math.PI * (raio * raio);
        System.out.println("A área do raio do seu círculo é: " + area);
        // também pode ser feita com o math.pow

    }
}
