package exercicios.udemynelio.estrutura_sequencial;

import java.util.Locale;

public class Exercicio06 {
    public static void main(String[] args) {
        /*
        Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
        mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B.
        */

        Locale.setDefault(Locale.US);
        double a, b, c;
        a = 3.0d;
        b = 4.0d;
        c = 5.2d;
        double triaguloRetangulo, circulo, trapezio, quadrado, retangulo;

        // área do triângulo
        triaguloRetangulo = (a * c) / 2;

        // área do círculo
        circulo = Math.PI * (Math.pow(c, 2));

        // área do trapézio
        trapezio = ((b + a) * c) / 2;

        // área do quadrado
        quadrado = Math.pow(b, 2);

        // área do retângulo
        retangulo = b * a;

        //resultados
        System.out.printf("TRIANGULO: %.3f%n", triaguloRetangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);
    }
}
