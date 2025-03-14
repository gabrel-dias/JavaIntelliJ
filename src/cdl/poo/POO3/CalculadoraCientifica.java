package cdl.poo.POO3;

public class CalculadoraCientifica extends Calculadora {
    // Calculadora científica calcula funções como seno e cosseno.

    public double calcularRaiz(double a) {
        return Math.sqrt(a);
    }

    public double calcularPotencia(double a, double b) {
        double resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado *= a;
        }
        return resultado;
    }
}