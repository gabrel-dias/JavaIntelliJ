package stream_API;

import java.util.List;
import java.util.stream.Stream;
/**
* Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
* Comumente usado para criar ou fornecer novos objetos de um determinado tipo.
*/

public class SupplierTeste {
    public static void main(String[] args) {

        //Supplier<String> saudacao = () -> "Olá";

        List<String> listaSaudacoes = Stream.generate(() -> "Olá").limit(3).toList();

        listaSaudacoes.forEach(System.out::println);
    }
}
