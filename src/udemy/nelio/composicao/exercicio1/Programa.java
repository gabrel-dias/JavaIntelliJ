// TODO terminar esse exercício
package udemy.nelio.composicao.exercicio1;

import udemy.nelio.composicao.exercicio1.enums.NivelTrabalhador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // dados para o funcionário
        System.out.print("Digite o nome do departamento: ");
        String departamentoString = sc.nextLine();
        System.out.println("Entre os dados do funcionário:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Nível: ");
        String nivel = sc.nextLine();
        System.out.print("Salário base: ");
        double salario = sc.nextDouble();
        System.out.print("Quantos contratos para este trabalhador? ");
        int qtdContrato = sc.nextInt();
        Trabalhador trabalhador = new Trabalhador(nome, NivelTrabalhador.valueOf(nivel), salario, new Departamento(departamentoString));
        // dados para os contratos
        ContratoHora contrato;
        for (int i = 0; i < qtdContrato; i++) {
            System.out.println("Digite os dados do contrato #" + (i + 1) + ": ");
            sc.nextLine();
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.print("Data (DD/MM/AAAA): ");
            LocalDate data = LocalDate.parse(sc.nextLine(), formatador);
            System.out.print("Valor por hora: ");
            double valorHora = sc.nextDouble();
            System.out.print("Duração (horas): ");
            int horas = sc.nextInt();
            contrato = new ContratoHora(data, valorHora, horas);
            trabalhador.addContrato(contrato);
        }

        // digitando data para pesquisar
        System.out.print("Digite o mês e o ano para calcular a renda (MM/AAAA): ");
        String dataFiltro = "01/";
        sc.nextLine();
        dataFiltro += sc.nextLine();

        LocalDate data = LocalDate.parse(dataFiltro, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Salário base durante " + data.format(DateTimeFormatter.ofPattern("MM/yyyy")) + ": " + trabalhador.rendaMensal(data.getYear(), data.getMonthValue()));
    }
}
