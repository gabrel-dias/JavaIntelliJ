// GABRIEL MAGALHÃES DIAS - POO - NOITE
package cdl.poo.POO2;

public class Quadrado {
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public void calcularArea() {
        double area = lado * lado;
        System.out.printf("A área do quadro é: %.2f\n", area);
    }
}
