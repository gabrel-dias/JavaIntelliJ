package stream_API;

import java.util.Arrays;
import java.util.List;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor boolean.
 * Comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */
public class PredicateTeste {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "python", "c++", "c#", "javascript");

        // não é preciso especificar a saída do Predicate pois ela sempre será um boolean
//        Predicate<String> maisDeCinco = palavra -> palavra.length() > 5;

        palavras.stream().filter(s -> s.length() < 5).forEach(System.out::println);
    }
}
