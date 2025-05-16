/*
package cdl.poo.trabalhoap2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<FaturaMensal> faturas = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();

        System.out.println("=== Sistema de Contratos de Serviços em Nuvem ===");

        // Input Cliente
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Digite o identificador do cliente: ");
        String idCliente = scanner.nextLine();

        Cliente cliente = new Cliente(nomeCliente, idCliente);
        clientes.add(cliente);

        // 1. Cadastrar um novo contrato SaaS com SLA de 99,9%
        System.out.println("Cadastrar novo contrato SaaS");
        System.out.println("SLA (Service Level Agreement) é o nível de serviço acordado, por exemplo, 99.9% significa que o serviço estará disponível 99.9% do tempo.");
        System.out.print("Digite o SLA (ex: 99.9%): ");
        double sla;
        while (true) {
            System.out.print("Digite o SLA (ex: 99.9): ");
            try {
                sla = scanner.nextDouble();
                if (sla >= 0.1 && sla <= 100.0) {
                    break; // Valor válido, sai do loop
                } else {
                    System.out.println("O SLA deve estar entre 0.1 e 100.0. Tente novamente.");
                }
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número decimal.");
                scanner.nextLine(); // Limpa o buffer do scanner e solicita novo valor ao usuário
            }
        }
        LocalDate dataInicio = null;
        LocalDate dataFim = null;

        while (true) {
            try {
                scanner.nextLine();
                if (dataInicio == null) {
                    System.out.print("Digite a data de início (dd/MM/yyyy): ");
                    String inputDataInicio = scanner.nextLine();
                    dataInicio = LocalDate.parse(inputDataInicio, formatter);
                }

                if (dataFim == null) {
                    System.out.print("Digite a data de fim (dd/MM/yyyy): ");
                    String inputDataFim = scanner.nextLine();
                    dataFim = LocalDate.parse(inputDataFim, formatter);
                }

                if (dataInicio.isEqual(dataFim)) {
                    System.out.println("A data de início não pode ser igual à data de fim. Por favor, insira novamente.");
                    dataInicio = null;
                    dataFim = null;
                } else if (dataInicio.isAfter(dataFim)) {
                    System.out.println("A data de início não pode ser posterior à data de fim. Por favor, insira novamente.");
                    dataInicio = null;
                    dataFim = null;
                } else {
                    break; // Sai do loop se as datas forem válidas
                }
            } catch (DateTimeParseException e) {
                System.out.println("Formato inválido. Por favor, use o formato dd/MM/yyyy.");
            }
        }

        // Renovação automática com entrada SIM/NÃO
        Boolean renovacaoAutomatica = null;
        while (renovacaoAutomatica == null) {
            System.out.print("Renovação automática? (SIM/NÃO): ");
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.equals("SIM")) {
                renovacaoAutomatica = true;
            } else if (input.equals("NÃO") || input.equals("NAO")) {
                renovacaoAutomatica = false;
            } else {
                System.out.println("Entrada inválida. Por favor, digite SIM ou NÃO.");
            }
        }

        System.out.print("Digite o número de usuários: ");
        int numeroUsuarios = 0;
        while (true) {
            try {
                numeroUsuarios = Integer.parseInt(scanner.nextLine());
                break; // Sai do loop se o input for válido
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
            }
        }

        ContratoSaaS contratoSaaS = new ContratoSaaS(cliente, sla, dataInicio, dataFim, renovacaoAutomatica, numeroUsuarios);
        System.out.println();
        System.out.println("Contrato SaaS cadastrado:");
        System.out.println(contratoSaaS.gerarResumoContrato());

        // 2. Registrar utilização mensal e calcular fatura
        System.out.println();
        System.out.println("Registrar utilização mensal e calcular fatura");

        LocalDate mesReferencia = null;
        while (mesReferencia == null) {
            System.out.print("Digite o mês de referência (MM/yyyy): ");
            String input = scanner.nextLine();
            try {
                mesReferencia = LocalDate.parse("01/" + input, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            } catch (DateTimeParseException e) {
                System.out.println("Formato inválido. Por favor, use o formato MM/yyyy.");
            }
        }
        double valorFatura = contratoSaaS.calcularFatura();
        FaturaMensal fatura = new FaturaMensal(cliente, mesReferencia, valorFatura);
        faturas.add(fatura);
        System.out.println();
        System.out.println("Fatura mensal registrada: " + fatura);

        // 3. Verificar se SLA foi cumprido e aplicar multa se necessário
        System.out.println();
        System.out.println("Verificar SLA");
        boolean slaCumprido = contratoSaaS.verificarSLA();
        System.out.println("SLA cumprido? " + slaCumprido);
        if (!slaCumprido) {
            System.out.println("Multa aplicada na fatura devido a violação do SLA.");
        } else {
            System.out.println("Nenhuma multa aplicada.");
        }

        // 4. Renovar contrato automaticamente se ativado
        System.out.println();
        System.out.println("Renovar contrato automaticamente se ativado");
        System.out.println("Data fim antes da renovação: " + contratoSaaS.dataFim.format(formatter));
        contratoSaaS.renovarContrato();
        System.out.println("Data fim após renovação: " + contratoSaaS.dataFim.format(formatter));

        // 5. Gerar relatório de faturamento por cliente
        System.out.println();
        System.out.println("Gerar relatório de faturamento por cliente");
        RelatorioFinanceiro relatorioFinanceiro = new RelatorioFinanceiro(faturas);
        System.out.println(relatorioFinanceiro.gerarRelatorioPorCliente(cliente));

        scanner.close();
    }
}
*/
