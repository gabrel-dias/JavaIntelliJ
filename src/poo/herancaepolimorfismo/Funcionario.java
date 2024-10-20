package poo.herancaepolimorfismo;

public class Funcionario extends Pessoa implements Pagamento {
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

    public void apresentarFuncionario() {
        System.out.println("Meu nome é " + getNome() + ", sou portador do CPF " + getCpf() + " e tenho " + getIdade() + " anos." +
                " Minha matrícula é " + matricula + ", meu cargo é " + cargo + " e meu salario é " + salario);
    }

    @Override
    public void fazerPix(String chavePix) {
        System.out.printf("Pix feito para a chave %s", chavePix + "\n");
    }

    @Override
    public void credito(String numeroCartao) {
        System.out.printf("Compra feita utilizando o cartão de número %s", numeroCartao + "\n");
    }
}
