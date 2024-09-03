package cdl.mobile;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu peso em quilos:");
        double peso = sc.nextDouble();
        System.out.println("Peso digitado: " + peso + " kg");

        System.out.println("Digite a sua altura em centímetros (exemplo: 160):");
        String alturaStr = sc.next();
        double altura = Double.parseDouble(alturaStr.substring(0, alturaStr.length() - 2) + "." + alturaStr.substring(alturaStr.length() - 2));
        System.out.println("Altura digitada: " + formatarAltura(altura) + "m");

        sc.close();

        DecimalFormatSymbols virgula = new DecimalFormatSymbols(Locale.getDefault());
        DecimalFormat formatador = new DecimalFormat("#,##0.00", virgula);

        double imc = peso / (Math.pow(altura, 2));
        System.out.println("O seu IMC é: " + formatador.format(imc));
    }

    private static String formatarAltura(double altura) {
        DecimalFormat formatadorAltura = new DecimalFormat("#0.00");
        return formatadorAltura.format(altura);
    }
}
