// GABRIEL MAGALHÃES DIAS - POO - NOITE
// POO - Exercício 3

package cdl.poo.POO3;

public class CalculadoraFinanceira extends Calculadora {
    public CalculadoraFinanceira() {
        super();
    }

    public double calcularPorcentagem(double total, double percentual) {
        return (percentual / 100) * total;
    }

    public double calcularJurosCompostos(double principal, double taxa, int periodos) {
        // Fórmula: M = P * Math.pow(1 + i, n)
        return principal * Math.pow(1 + taxa, periodos);
    }

}
