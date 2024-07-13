package desafios_dio.ultima_transacao;

import java.util.Scanner;

public class UltimaTransacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();
        String[] partes = entrada.split(",");
        // Solicita ao usuário que forneça os valores necessários para criar uma Transação.
        // Detalhe: todos os dados devem ser separados por vírgula para utilização do método split().

        String data = partes[0].trim();
        String hora = partes[1].trim();
        String descricao = partes[2].trim();
        double valor = Double.parseDouble(partes[3].trim()); // converte o trecho da string que
        // foi digitada por ultimo para double
        Transacao transacao = new Transacao(data, hora, descricao, valor);
        transacao.imprimir();
    }
}

class Transacao {
    private String data;
    private String hora;
    private String descricao;
    private double valor;

    public Transacao(String data, String hora, String descricao, double valor) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void imprimir() {
        System.out.println(this.descricao);
        System.out.println(this.data);
        System.out.println(this.hora);
        System.out.printf("%.2f", this.valor);
    }
}