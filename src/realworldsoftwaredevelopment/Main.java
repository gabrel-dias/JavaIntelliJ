package realworldsoftwaredevelopment;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        final String ARQUIVOCSV = "src/resources/bank-data-simple.csv";
        final Path caminho = Paths.get(ARQUIVOCSV);
        final List<String> linhas = Files.readAllLines(caminho);
        double total =0d;

        for (String linha : linhas){
            String[] colunas = linha.split(",");
            total += colunas[1];
        }
    }

}