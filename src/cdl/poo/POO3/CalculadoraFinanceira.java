package cdl.poo.POO3;

public class CalculadoraFinanceira extends Calculadora {
    // Realiza operações financeiras, como juros compostos

    public double calcularPorcentagem(double total, double percentual) {
        return (percentual / 100) * total;
    }

    public double calcularDelta(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }

}
