package exercicios.udemynelio.orientacao_objetos.entidades;

public class Empregado {
    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public void aumentarSalario(double porcentagem) {
        salarioBruto += porcentagem / 100 * salarioBruto;
    }
}
