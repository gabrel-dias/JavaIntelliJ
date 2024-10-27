package poo.manipulacao;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String linha;
        String[] campos;
        Livro livro;
        ArrayList<Livro> livroArrayList = new ArrayList<>();
        String titulo;
        String autor;
        int anoPublicacao;
        String genero;
        int qtdPaginas;

        try {
            InputStream inputStream = new FileInputStream("src/poo/manipulacao/livros.csv");
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            while ((linha = bufferedReader.readLine()) != null) {
                campos = linha.split(",");
                titulo = campos[0];
                autor = campos[1];
                anoPublicacao = Short.parseShort(campos[2]);
                genero = campos[3];
                qtdPaginas = Short.parseShort(campos[4]);
                livro = new Livro(titulo, autor, anoPublicacao, genero, qtdPaginas);
                livroArrayList.add(livro);
                livro.limparArquivo();
            }
            inputStream.close();
            inputStreamReader.close();
            bufferedReader.close();

            for (int i = 0; i < livroArrayList.size(); i++) {
                livroArrayList.get(i).gerarArquivo(i + 1);
            }
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado!");

        }
    }
}
