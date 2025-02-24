package exercicios.udemynelio.composicao.exercicio1;

import java.time.LocalDate;

public class ContratoHora {
    private LocalDate data;
    private Double valorHora;
    private Integer horas;

    public ContratoHora() {
    }

    public ContratoHora(LocalDate data, double valorHora, int horas) {
        this.data = data;
        this.valorHora = valorHora;
        this.horas = horas;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "ContratoHora{" +
                "data=" + data +
                ", valorHora=" + valorHora +
                ", horas=" + horas +
                '}';
    }

    public double valorTotal() {
        return horas * valorHora;

    }
}
