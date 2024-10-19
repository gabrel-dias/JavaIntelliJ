package poo.heranca;

public class Funcionario extends Pessoa {
    private String matricula;
    private String cargo;
    private int salario;

    public Funcionario(String nome, String cpf, int idade, String matricula, String cargo, int salario) {
        // recebe is atributos da SUPER classe, a quem está herdando
        super(nome, cpf, idade);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void apresentarFuncionario(Pessoa p1) { // precisa de um objeto como parâmetro
        System.out.println("Meu nome é " + p1.getNome() + ", sou portador do CPF " + p1.getCpf() + " e tenho " + p1.getIdade() + " anos." +
                // acessa os atributos criados do objeto por meio dos métodos acessores
                " Minha matrícula é " + matricula + " meu cargo é " + cargo + " e meu salario é " + salario);
        // mostra os atributos de funcionário

    }
}
