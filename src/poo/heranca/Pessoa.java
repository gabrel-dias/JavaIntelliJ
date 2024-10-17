package poo.heranca;

public class Pessoa {
    // atributos são características ou variáveis que armazenam dados e possuem modificadores de acesso
    private String nome;
    private String cpf;
    private int idade;

    // construtores servem para configurar o estado inicial do objeto e garantir que ele esteja válido antes de usar
    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void apresentarPessoa() {
        System.out.println("Meu nome é " + nome + ", sou portador do CPF " + cpf + " e tenho " + idade + " anos");
    }
}
