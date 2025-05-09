package cdl.poo.trabalhoap2;

import java.time.LocalDate;

public class ContratoSaaS extends ContratoServicoNuvem implements Faturavel, Renovavel, RelatorioGeravel {
    private int numeroUsuarios;

    public ContratoSaaS(Cliente cliente, String sla, LocalDate dataInicio, LocalDate dataFim, boolean renovacaoAutomatica,
                        int numeroUsuarios) {
        super(cliente, sla, dataInicio, dataFim, renovacaoAutomatica);
        this.numeroUsuarios = numeroUsuarios;
    }

    @Override
    public double calcularFatura() {
        double custoPorUsuario = 20.0; // exemplo: 20 por usuário
        double custoTotal = numeroUsuarios * custoPorUsuario;

        // Aplicar penalidade se SLA violado
        if (!verificarSLA()) {
            custoTotal *= 0.8; // desconto de 20% como penalidade
        }
        return custoTotal;
    }

    @Override
    public boolean verificarSLA() {
        // Implementar lógica de verificação de SLA para SaaS
        // Exemplo simplificado: verificar se SLA é "99.0%" ou superior
        return sla != null && sla.compareTo("99.0%") >= 0;
    }

    @Override
    public void renovarContrato() {
        if (renovacaoAutomatica) {
            dataInicio = dataFim;
            dataFim = dataFim.plusMonths(1);
        } else {
            // Renovação manual - pode ser implementada conforme necessidade
            System.out.println("Renovação manual necessária para o contrato SaaS do cliente " + cliente.getNome());
        }
    }

    @Override
    public String gerarResumoContrato() {
        return "Contrato SaaS para cliente " + cliente.getNome() +
                ", SLA: " + sla +
                ", Período: " + dataInicio + " a " + dataFim +
                ", Renovação automática: " + renovacaoAutomatica;
    }
}
