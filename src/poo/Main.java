package poo;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Gabriel", "075", 24, "085");
        Pessoa p2 = new Pessoa();

        p1.apresentar();

        p2.setNome("Bruna");
        p2.setIdade(23);
        p2.setCpf("072");
        p2.apresentar();

    }
}
