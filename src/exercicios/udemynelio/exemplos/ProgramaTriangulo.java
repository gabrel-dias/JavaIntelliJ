package exercicios.udemynelio.exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaTriangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Digite as medidas do triangulo X");
        x.setA(sc.nextDouble());
        x.setB(sc.nextDouble());
        x.setC(sc.nextDouble());

        System.out.println("Digite as medidas dos triangulos Y");
        y.setA(sc.nextDouble());
        y.setB(sc.nextDouble());
        y.setC(sc.nextDouble());

        // triângulo X
        System.out.println("As medidas do triângulo X são:\n" +
                x.getA() + ", " + x.getB() + ", " + x.getC());
        System.out.println("A área do triângulo Y é: " + x.CalcularArea());

        // triângulo Y
        System.out.println("As medidas do triângulo Y são:\n" +
                y.getA() + ", " + y.getB() + ", " + y.getC());
        System.out.println("A área do triângulo Y é: " + y.CalcularArea());
    }
}

class Triangulo {
    private double a;
    private double b;
    private double c;

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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String CalcularArea() {
        double p = (a + b + c) / 2.0;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return String.format("%.4f%n", area);
    }
}

