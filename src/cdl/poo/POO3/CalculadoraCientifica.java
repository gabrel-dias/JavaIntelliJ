// GABRIEL MAGALHÃES DIAS - POO - NOITE
// POO - Exercício 3

package cdl.poo.POO3;

public class CalculadoraCientifica extends Calculadora {
    public CalculadoraCientifica() {
        super();
    }

    public double calcularRaiz(double a) {
        setResultado(Math.sqrt(a));
        return getResultado();
    }

    public double calcularPotencia(double a, double b) {
        double resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado *= a;
            setResultado(resultado);
        }
        return getResultado();
    }
}