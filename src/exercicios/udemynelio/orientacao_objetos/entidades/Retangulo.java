package exercicios.udemynelio.orientacao_objetos.entidades;

public class Retangulo {
    public double largura;
    public double altura;

    public double area() {
        return largura * altura;
    }

    public double perimetro() {
        return 2 * (altura + largura);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
    }
}