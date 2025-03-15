// GABRIEL MAGALHÃES DIAS - POO - NOITE
// POO - Exercício 3

package cdl.poo.POO3;

public class Programa {
    public static void main(String[] args) {
        System.out.println("======Superclasse Calculadora======");
        Calculadora calculadora = new Calculadora();
        System.out.println("Soma 3 + 2 = " + calculadora.somar(3, 2));
        System.out.println("Subtrai 4 - 3 = " + calculadora.subtrair(4, 3));
        System.out.println("Multiplica 30 x 20 = " + calculadora.multiplicar(30, 20));
        System.out.println("Divide 30 / 2 = " + calculadora.dividir(30, 2));
        System.out.println("=====================================\n");

        System.out.println("======Subclasse CalculadoraFinanceira======");
        CalculadoraFinanceira calculadoraFinanceira = new CalculadoraFinanceira();
        System.out.println("20% de 150 = " + calculadoraFinanceira.calcularPorcentagem(150, 20));
        System.out.printf("O montante após %d períodos é: %.2f%n", 12, calculadoraFinanceira.calcularJurosCompostos(1000, 0.04, 12));
        System.out.println("===========================================\n");

        System.out.println("======Subclasse CalculadoraCientifica======");
        CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();
        System.out.printf("Raíz quadrada de 12: %.2f%n", calculadoraCientifica.calcularRaiz(12));
        System.out.println("Potência de 6 elevado a 2 = " + calculadoraCientifica.calcularPotencia(6, 2));
        System.out.println("===========================================");
    }
}