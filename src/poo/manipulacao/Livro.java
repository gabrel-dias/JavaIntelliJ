package poo.manipulacao;

import java.io.*;

public class Livro {
    String titulo;
    String autor;
    short anoPublicacao;
    String genero;
    short qtdPaginas;

    public Livro(String titulo, String autor, short anoPublicacao, String genero, short qtdPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.qtdPaginas = qtdPaginas;
    }

    public void mostrarLivro() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + anoPublicacao);
        System.out.println("Gênero: " + genero);
        System.out.println("Quatidade de págias: " + qtdPaginas);
        System.out.println("==========================");
    }

    public void limparArquivo() {
        try (FileOutputStream fileOutputStream = new FileOutputStream("src/poo/manipulacao/LivrosArrumados.csv");
        ) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escreverLivro(int numeroLivro) {
        try (
                FileOutputStream fileOutputStream = new FileOutputStream("src/poo/manipulacao/LivrosArrumados.csv", true);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
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