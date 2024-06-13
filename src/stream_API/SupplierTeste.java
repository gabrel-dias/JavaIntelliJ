package stream_API;

import java.util.List;
import java.util.stream.Stream;

public class SupplierTeste {
    public static void main(String[] args) {
        /*
        Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
        Comumente usado para criar ou fornecer novos objetos de um determinado tipo.
        */

        //Supplier<String> saudacao = () -> "Olá";

        List<String> listaSaudacoes = Stream.generate(() -> "Olá").limit(3).toList();

        listaSaudacoes.forEach(System.out::println);
    }
}
