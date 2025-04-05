package udemy.nelio.orientacao_objetos.entidades;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double calcularNota() {
        return nota1 + nota2 + nota3;
    }

    public String aprovaReprova() {
        if (calcularNota() > 60d) {
            return "PASSOU";
        } else {
            System.out.println("REPROVOU");
            double pontosFaltando = 60d - calcularNota();
            return "FALTANDO " + String.format("%.2f", pontosFaltando) + " pontos";
        }
    }
}
