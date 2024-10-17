package poo;

import poo.heranca.Funcionario;
import poo.heranca.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p2 = new Pessoa("Gabriel", "075", 24);

        Funcionario f1 = new Funcionario("Gabriel", "075", 24, "018", "Assistente de TI", 1800);
        f1.apresentarFuncionario(p2);
    }
}
