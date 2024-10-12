package exercicios;

import java.util.Arrays;
import java.util.List;

public class TesteList {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "João", "Maria", "José");
        List<String> nomesFiltrados = nomes.stream().filter(name -> name.startsWith("A")).map(String::toUpperCase).toList();
        System.out.println(nomesFiltrados);
    }
}
