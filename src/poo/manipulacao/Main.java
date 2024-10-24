package poo.manipulacao;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("src/poo/manipulacao/livros.csv"); // representa uma corrente de dados de entrada (stream) e recebe o caminho de um arquivo que será manipulado
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream); // converte bytes, provenientes da corrente de dados do InputStream, para caracteres no formato de um Reader
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader); // adiciona funcionalidade de buffer a um Reader


            String[] texto = new String[5];
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                texto = linha.split(",");
                System.out.println(texto[0]);
            }

            inputStream.close();
            inputStreamReader.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
