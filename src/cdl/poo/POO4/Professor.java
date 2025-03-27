package cdl.poo.POO4;

public class Professor extends Funcionario {
    public Professor(int matricula, double salario) {
        super(matricula, salario);
    }

    @Override
    public double getSalarioPrimeiraParcela() {
        return super.getSalario();
    }

    @Override
    public double getSalarioSegundaParcela() {
        return 0;
    }
}
