package cdl.poo.POO3;

public class Programa {
    public static void main(String[] args) {
        System.out.println("======MÉTODOS DA SUPERCLASSE CALCULADORA======");
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.somar(3,2));
        System.out.println(calculadora.subtrair(3,2));
        System.out.println(calculadora.multiplicar(3,2));
        System.out.println(calculadora.dividir(3,2));
        System.out.println("==============================================");
    }
}