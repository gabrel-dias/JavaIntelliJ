package cdl.poo.POO3;

public class Calculadora {

    private double entrada1;
    private double entrada2;
    private double resultado;

    public Calculadora(double entrada1, double entrada2) {
        this.entrada1 = entrada1;
        this.entrada2 = entrada2;
    }

    public void somar(double a, double b) {
        this.resultado = a + b;
        System.out.println(this.resultado);
    }

    public void subtrair(double a, double b) {
        this.resultado = a - b;
        System.out.println(this.resultado);
    }

    public void multiplicar(double a, double b) {
        this.resultado = a * b;
        System.out.println(this.resultado);
    }

    public void dividir(double a, double b) {
        this.resultado = a / b;
        System.out.println(this.resultado);
    }

    public void calcularRaiz(double a) {
        this.resultado = Math.sqrt(a);
        System.out.println(this.resultado);
    }

    public void calcularPorcentagem(double total, double percentual) {
        this.resultado = (percentual / 100) * total;
        System.out.println(this.resultado);
    }
}