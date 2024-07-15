package exercicios.javaguanabara;

import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
        Locale local = Locale.getDefault(); // pega os valores padrões do sistema no qual a JVM está instalada
        System.out.println("O país do usuário é: " + local.getDisplayCountry());
        System.out.println("O idioma do usuário é: " + local.getDisplayLanguage());

        // testes
        System.out.println(System.getProperty("user.language"));
    }
}
