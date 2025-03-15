package cdl.poo.POO3;

public class Calculadora {

    private double a;
    private double b;
    private double resultado;

    public Calculadora() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double somar(double a, double b) {
        setResultado(a + b);
        return getResultado();
    }

    public double subtrair(double a, double b) {
        setResultado(a - b);
        return getResultado();
    }

    public double multiplicar(double a, double b) {
        setResultado(a * b);
        return getResultado();
    }

    public double dividir(double a, double b) {
        setResultado(a / b);
        return getResultado();
    }
}
