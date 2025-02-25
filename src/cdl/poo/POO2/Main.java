// GABRIEL MAGALHÃES DIAS - POO - NOITE
package cdl.poo.POO2;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(4, 40);
        Quadrado quadrado = new Quadrado(600);
        Circulo circulo = new Circulo(80);

        retangulo.calcularArea();
        quadrado.calcularArea();
        circulo.calcularArea();
    }
}