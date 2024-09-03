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
        Scanner sc = new Scanner(System.in);

        // pedindo entradas do usuário e armazenando-as em variáveis double
        System.out.println("Digite o seu peso em quilos:");
        double peso = sc.nextDouble();
        System.out.println("Peso digitado: " + peso + "kg");
        System.out.println("Digite a sua altura em metros:");
        String alturaString = sc.next();
        double altura = Double.parseDouble(alturaString.substring(0,alturaString.length()-2) + "." + alturaString.substring(alturaString.length()-2));
        sc.close();

        // definindo formatadores
        DecimalFormatSymbols virgula = new DecimalFormatSymbols(Locale.getDefault());
        DecimalFormat formatador = new DecimalFormat("#,##0.00", virgula);
        System.out.println("Altura digitada: " + formatador.format(altura)+"m");

        // calculando resultado
//        double imc = peso / (Math.pow(altura, 2));
//        System.out.println("O seu IMC é: " + formatador.format(imc));
    }
}
