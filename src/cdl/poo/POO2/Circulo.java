// GABRIEL MAGALHÃES DIAS - POO - NOITE
package cdl.poo.POO2;

public class Circulo {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void calcularArea() {
        double area = Math.PI * raio;
        System.out.printf("A área do círculo é: %.2f\n", area);
    }

}
