package cdl.poo.POO4;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Gabriel", "Dias");
        Funcionario funcionario = new Funcionario(031456, 1700);
        Professor professor = new Professor(040315, 2300);
        System.out.println("Pessoa: " + pessoa.getClass());
        System.out.println("Funcionário: " + funcionario.getClass());
        System.out.println("Professor: " + professor.getClass());
    }
}
