package cdl.mobile;/*
Faça um programa em Java que recebe uma temperatura em graus fahrenheit e transforme em graus celsius.
Caso o resultado da temperatura seja maior ou igual a 40o celsius, mostre uma mensagem:
ESTÁ QUENTE!, senão mostre TEMPERATURA FRIA OU SUPORTÁVEL.
*/

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class FarenheitCelsius {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // variáveis que serão usadas
        double c, f;

        System.out.println("Digite uma temperatura em Farenheit que será convertida em Celsius:");
        f = Double.parseDouble(entrada.nextLine());

        // substituindo o separador decimal por uma vírgula e formatando as casas decimais do resultado
        DecimalFormatSymbols virgula = new DecimalFormatSymbols(Locale.getDefault());
        DecimalFormat arredondar = new DecimalFormat("#,##0.00", virgula);
        c = (f - 32) / 1.8d;

        System.out.println("A temperatura convertida em Celsius é: " + arredondar.format(c) + "°C");
        // condicionais para classificar a temperatura
        if (c >= 40) {
            System.out.println("Está quente!");
        } else {
            System.out.println("Temperatura fria e suportável!");
        }
    }
}
