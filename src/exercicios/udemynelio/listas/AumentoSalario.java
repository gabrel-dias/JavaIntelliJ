/*
https://github.com/acenelio/list1-java/blob/master/src/entities/Employee.java
 */
package exercicios.udemynelio.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

class AumentoSalario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos funcionarios serão registrados? ");
        int n = sc.nextInt();
        int id;
        String nome;
        double salario;
        List<Funcionario> funcionariosList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Funcionário #" + (i + 1) + ":");
            System.out.print("ID: ");
            id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            nome = sc.nextLine();
            System.out.print("Salário: ");
            salario = sc.nextDouble();
            Funcionario funcionario = new Funcionario(id, nome, salario);
            funcionariosList.add(funcionario);
        }
        System.out.print("Digite o ID do funcionário que terá o salário aumentado: ");
        int idAumentado = sc.nextInt();
        Integer posicao = posicaoId(funcionariosList, idAumentado);
        if (posicao == null) {
            System.out.println("O ID digitado não existe!");
        } else {
            System.out.print("Digite a porcentagem: ");
            double porcentagem = sc.nextDouble();
            funcionariosList.get(posicao).aumentarSalario(porcentagem);
        }
        for (Funcionario f : funcionariosList) {
            System.out.println(f);
        }
    }

    public static Integer posicaoId(List<Funcionario> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}

class Funcionario {
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem) {
        salario += salario * porcentagem / 100.0;
    }

    @Override
    public String toString() {
        return id + ", " + nome + ", " + salario;
    }
}
