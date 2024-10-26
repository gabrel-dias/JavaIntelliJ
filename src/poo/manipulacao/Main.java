package poo.manipulacao;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //criando uma fonte de dados que será usada para manipulação
        try {
            InputStream inputStream = new FileInputStream("src/poo/manipulacao/livros.csv"); // representa uma corrente de dados de entrada (stream) e recebe o caminho de um arquivo que será manipulado
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream); // converte bytes, provenientes da corrente de dados do InputStream, para caracteres no formato de um Reader
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader); // adiciona funcionalidade de buffer a um Reader

            // variáveis para manipular as strings
            String[] texto;
            String linha;

            // variáveis para criar um objeto de Livro
            Livro livro;
            String titulo;
            String autor;
            short anoPublicacao;
            String genero;
            short qtdPaginas;

            ArrayList<Livro> livrosArray = new ArrayList<>();

            while ((linha = bufferedReader.readLine()) != null) {
                // separa todos os valores das linhas por vírgulas e os atribui em um array
                texto = linha.split(",");
                // utilizando o índice, todos os elementos da linha são armazenados em suas respectivas variáveis para uso no novo objeto de Livro
                titulo = texto[0];
                autor = texto[1];
                anoPublicacao = Short.parseShort(texto[2]);
                genero = texto[3];
                qtdPaginas = Short.parseShort(texto[4]);

                // usa como parâmetro as variáveis contendo os elementos extraídos da linha e mostra os objetos
                livro = new Livro(titulo, autor, anoPublicacao, genero, qtdPaginas);
                livrosArray.add(livro);
                livro.limparArquivo();
            }
            // fecha os objetos para evitar vazamento de recursos
            inputStream.close();
            inputStreamReader.close();
            bufferedReader.close();

            // acessa a lista de arrays que foi criada com os objetos de livros
            for (int i = 0; i < livrosArray.size(); i++) {
                livrosArray.get(i).escreverLivro(i + 1);
            }
            System.out.println("Arquivo criado com sucesso!");

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
