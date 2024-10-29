package kiwify.empresa;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Gabriel", "075", 24, "018", "Assistente de TI", 1800);
        // o método de apresentação herda atributos instanciados na superclasse Pessoa e os utiliza na subclasse Funcionario
        f1.apresentarFuncionario();
        // métodos implementados pela interface Pagamento
        f1.fazerPix("gabriel@dias.com");
        f1.credito("5502");

        Gestor g1 = new Gestor("Marcelo", "052", 30, "02", "Analista", 4000);
        g1.apresentarFuncionario();
    }
}
