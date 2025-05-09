package cdl.poo.trabalhoap2;

import java.time.LocalDate;

public abstract class ContratoServicoNuvem {
    protected Cliente cliente;
    protected String sla;
    protected LocalDate dataInicio;
    protected LocalDate dataFim;
    protected boolean renovacaoAutomatica;

    public ContratoServicoNuvem(Cliente cliente, String sla, LocalDate dataInicio, LocalDate dataFim, boolean renovacaoAutomatica) {
        this.cliente = cliente;
        this.sla = sla;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.renovacaoAutomatica = renovacaoAutomatica;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getSla() {
        return sla;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public boolean isRenovacaoAutomatica() {
        return renovacaoAutomatica;
    }

    public abstract double calcularFatura();

    public abstract boolean verificarSLA();

    public abstract void renovarContrato();
}
