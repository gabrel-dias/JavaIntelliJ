package exercicios.udemynelio.composicao.exercicio1;

import exercicios.udemynelio.composicao.exercicio1.enums.NivelTrabalhador;

import java.util.ArrayList;
import java.util.List;

public class Trabalhador {
    private String nome;
    private NivelTrabalhador nivel;
    private Double salarioBase;
    //o trabalhador tem pelo menos um departamento
    private Departamento departamento;
    //o trabalhador tem vários contratos e por isso não é incluído no construtor
    private List<ContratoHora> contratos = new ArrayList<>();

    public Trabalhador(String nome, NivelTrabalhador nivel, double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrabalhador getNivel() {
        return nivel;
    }

    public void setNivel(NivelTrabalhador nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public List<ContratoHora> getContratos() {
        return contratos;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void addContrato(ContratoHora contrato) {
        contratos.add(contrato);
    }

    public void removeContrato(ContratoHora contrato) {
        contratos.remove(contrato);
    }

    public double rendaMensal(int ano, int mes) {
        double renda = salarioBase;
        for (ContratoHora c : contratos) {
            if (c.getData().getMonthValue() == mes && c.getData().getYear() == ano) {
                renda += c.valorTotal();
            }
        }
        return renda;
    }

}
