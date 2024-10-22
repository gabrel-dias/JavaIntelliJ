package poo.empresa;

public class Gestor extends Funcionario {
    public Gestor(String nome, String cpf, int idade, String matricula, String cargo, int salario) {
        // por ser uma subclasse, o super é utilizado para se referir aos atributos que foram herdados da sua superclasse
        super(nome, cpf, idade, matricula, cargo, salario);
    }

    @Override
    public void apresentarFuncionario() {
        super.apresentarFuncionario();
        System.out.println("E eu sou gestor");
    }
}
