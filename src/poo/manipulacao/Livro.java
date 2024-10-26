package poo.manipulacao;

import java.io.*;

public class Livro {
    String titulo;
    String autor;
    short anoPublicacao;
    String genero;
    short qtdPaginas;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public short getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getGenero() {
        return genero;
    }

    public short getQtdPaginas() {
        return qtdPaginas;
    }

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
        System.out.println("===================");
    }

    public void escreverLivro() throws IOException {
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("src/poo/manipulacao/LivrosArrumados.csv");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        bufferedWriter.write("Título: " + titulo);
    }

}
