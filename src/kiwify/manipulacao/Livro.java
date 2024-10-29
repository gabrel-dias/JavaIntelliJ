package kiwify.manipulacao;

import java.io.*;

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
    String genero;
    int qtdPaginas;

    public Livro(String titulo, String autor, int anoPublicacao, String genero, int qtdPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.qtdPaginas = qtdPaginas;
    }

    public void limparArquivo() {
        try (FileOutputStream fileOutputStream = new FileOutputStream("src/poo/manipulacao/LivrosArrumados.csv");
        ) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void gerarArquivo(int numeroLivro) {
        try (
                OutputStream outputStream = new FileOutputStream("src/poo/manipulacao/LivrosArrumados.csv", true);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
                BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)
        ) {
            bufferedWriter.write("Livro " + numeroLivro + "\n");
            bufferedWriter.write("Título: " + titulo + "\n");
            bufferedWriter.write("Autor: " + autor + "\n");
            bufferedWriter.write("Ano de publicação: " + anoPublicacao + "\n");
            bufferedWriter.write("Gênero: " + genero + "\n");
            bufferedWriter.write("Quatidade de páginas: " + qtdPaginas + "\n");
            bufferedWriter.write("===================\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
