package mobile;

import java.util.Random;

public class DisciplinaMobile2 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
            int numero = 0;
        do {
            System.out.println(numero);
            numero = aleatorio.nextInt(11);
        } while (numero!=10);
        if (numero==10) System.out.println(numero);

    }
}
