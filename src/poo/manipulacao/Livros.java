package poo.manipulacao;

public abstract class Livros {
    String titulo;
    String autor;
    short anoPublicacao;
    String genero;
    short qtdPaginas;

    public Livros(String titulo, String autor, short anoPublicacao, String genero, short qtdPaginas) {
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
    }
}
