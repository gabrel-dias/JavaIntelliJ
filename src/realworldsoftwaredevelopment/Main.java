package realworldsoftwaredevelopment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        final String ARQUIVOCSV = "src/resources/bank-data-simple.csv";
        final Path CAMINHO = Paths.get(ARQUIVOCSV);
        final List<String> LINHAS = Files.readAllLines(CAMINHO);
        double total = 0d;

        for (String linha : LINHAS) {
            final String[] colunas = linha.split(",");
            total += Double.parseDouble(colunas[1]);
        }
        System.out.println("O total de todas as transações é " + total);
    }

}