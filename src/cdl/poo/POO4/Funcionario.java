package cdl.poo.POO4;

public class Funcionario extends Pessoa {
    private int matricula;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(int matricula, double salario) {
        super();
        if (salario >= 0) {
            this.matricula = matricula;
        }
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public double getSalarioPrimeiraParcela() {
        return this.salario * 0.60;
    }
    public double getSalarioSegundaParcela() {
        return this.salario * 0.40;
    }
}
