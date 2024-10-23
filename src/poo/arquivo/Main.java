package poo.arquivo;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("src/poo/arquivo/livros.csv"); // recebe o caminho de um arquivo que será manipulado
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream); // preparada a estrutura para começar a ler os dados que foram passado pelo InputStream
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader); // manipula os dados

            String linha = bufferedReader.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = bufferedReader.readLine();
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
