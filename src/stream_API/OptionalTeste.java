package stream_API;

import java.util.Optional;

public class OptionalTeste {
    public static void main(String[] args) {
        Optional<String> valeu = Optional.ofNullable(null);
        String resultado = valeu.orElse("Default");
        System.out.println(resultado);
    }
}
