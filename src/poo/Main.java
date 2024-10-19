package poo;

import poo.heranca.Funcionario;
import poo.heranca.Pessoa;

public class Main {
    public static void main(String[] args) {
        // obrigatório criar uma pessoa para se ter um objeto para usar no método do funcionário
        Pessoa p1 = new Pessoa("Gabriel", "075", 24);

        Funcionario f1 = new Funcionario("Gabriel", "075", 24, "018", "Assistente de TI", 1800);
        p1.apresentarPessoa();
        // coloca o objeto criado nos parâmetros
        f1.apresentarFuncionario(p1);
    }
}
