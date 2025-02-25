// GABRIEL MAGALHÃES DIAS - POO - NOITE
package cdl.poo.POO2;

public class Retangulo {
    double base;
    double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea() {
        double area = base * altura;
        System.out.printf("A área do retângulo é: %.2f\n", area);
    }

}
