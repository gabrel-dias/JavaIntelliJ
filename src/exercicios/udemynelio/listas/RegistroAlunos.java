/*
Enunciado do Exercício:

Você foi contratado para desenvolver um sistema de gerenciamento de alunos em uma instituição de ensino.
O sistema deve permitir o registro de alunos e a aplicação de ajustes de notas com base em critérios específicos.

Requisitos:
Solicitar ao usuário o número N de alunos que serão cadastrados.
Para cada aluno, ler matrícula, nome e nota final. A matrícula deve ser única, ou seja, não pode haver alunos com a mesma identificação.
Permitir que o usuário ajuste a nota de um aluno específico. Para isso, solicitar um número de matrícula e um percentual de ajuste (positivo ou negativo).
Se a matrícula não existir, exibir uma mensagem e não realizar a operação.
Após as atualizações, exibir a lista final dos alunos, mostrando matrícula, nome e nota final.
A nota do aluno deve ser encapsulada, de forma que só possa ser modificada por meio de um método que aplique o ajuste percentual.
*/
package exercicios.udemynelio.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class RegistroAlunos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        // criando lista vazia de objetos de Aluno
        List<Aluno> alunoList = new ArrayList<>();
        System.out.print("Quantos estudantes serão matriculados? ");
        int qtdAlunos = sc.nextInt();

        // loop que cadastrará de acordo com a quantidade de alunos desejada
        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("Estudante #" + (i + 1));
            System.out.print("Nº matrícula: ");
            int matricula = sc.nextInt();
            while (Aluno.matriculaExistente(alunoList, matricula)) {
                System.out.println("Matrícula já existe! Tente novamente.");
                matricula = sc.nextInt();
            }
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Nota final");
            double nota = sc.nextDouble();
            Aluno aluno = new Aluno(matricula, nome, nota);
            alunoList.add(aluno);
        }
    }
}

class Aluno {
    private Integer matricula;
    private String nome;
    private Double notaFinal;

    public Aluno(Integer matricula, String nome, Double notaFinal) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Double notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", notaFinal=" + notaFinal +
                '}';
    }

    public static boolean matriculaExistente(List<Aluno> list, int matricula) {
        //list.stream() → Converte a lista em um fluxo de dados (stream).
        //.filter(x -> x.getMatricula() == matricula) → Filtra os elementos da lista, buscando o primeiro aluno que tenha a matrícula igual à informada.
        //.findFirst() → Retorna o primeiro elemento que atendeu ao filtro, se existir.
        //.orElse(null) → Se não encontrar nenhum aluno com essa matrícula, retorna null.
        Aluno aluno = list.stream().filter(x -> x.getMatricula() == matricula).findFirst().orElse(null);
        return aluno != null;
    }

}
