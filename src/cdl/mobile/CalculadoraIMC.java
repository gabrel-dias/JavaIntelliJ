package cdl.mobile;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

/*
https://www.calcule.net/saude/calcular-imc-calculo-de-imc-ideal-online-aprenda-fazer-a-formula-para-calcular/
https://ge.globo.com/eu-atleta/nutricao/post/2022/08/17/veja-qual-e-o-imc-ideal-e-como-calcular.ghtml

O índice de massa corporal (IMC) é calculado dividindo o peso em quilos pela altura em metros ao quadrado. A fórmula
para calcular o IMC é: IMC = peso / (altura x altura).

IMC - CLASSIFICAÇÃO:
Menor que 18.5 - Baixo peso ;
Entre 18.5 e 24.9 - Eutrofia (peso adequado) ;
Entre 25.0 e 29.9 - Sobrepeso ;
Entre 30.0 e 34.9 - Obesidade Grau 1 ;
Entre 35.0 e 39.9 - Obesidade Grau 2 ;
Acima de 40 - Obesidade Extrema

EXEMPLO:
Seu IMC ficou em 25,51

Acima do Peso
Seu peso ideal deve ficar entre: 47,00 e 64,00 kg ( está 1,30 kg acima do peso máximo ideal)
 */
public class CalculadoraIMC {
    public static void main(String[] args) {
        // agora preciso setar o Locale para o padrão que a JVM deveria ter, mas por algum motivo ela prefere usar
        // o padrão do meu sistema (pt_BR)
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        // definindo formatadores
        DecimalFormatSymbols virgula = new DecimalFormatSymbols(Locale.getDefault());
        DecimalFormat formatador = new DecimalFormat("#,##0.00", virgula);

        // pedindo entradas do usuário e armazenando-as em variáveis double
        System.out.println("Digite o seu peso em quilos:");
        double peso = sc.nextDouble();
        System.out.println("Peso digitado: " + formatador.format(peso) + "kg");
        System.out.println("Digite a sua altura em metros:");
        double altura = sc.nextDouble();
        System.out.println("Altura digitada: " + formatador.format(altura) + "m");
        sc.close();

        // calculando resultado
        double imc = peso / (Math.pow(altura, 2));
        System.out.println("O seu IMC é: " + formatador.format(imc));

        if (imc <= 18.5d) {
            System.out.println("Seu IMC é classificado como: \"Baixo peso\"");
        } else if (imc > 18.d && imc <= 24.9d) {
            System.out.println("Seu IMC é classificado como: \"Eutrofia (peso adequado)\"");
        } else if (imc > 25d && imc <= 29.d) {
            System.out.println("Seu IMC é classificado como: \"Sobrepeso\"");
        } else if (imc > 30d && imc <= 34.9) {
            System.out.println("Seu IMC é classificado como: \"Obesidade Grau 1\"");
        } else if (imc > 35d && imc <= 39.9d) {
            System.out.println("Seu IMC é classificado como: \"Obesidade Grau 2\"");
        }
        else System.out.println("Seu IMC é classificado como: \"Obsidade Extrema\"");
    }
}
